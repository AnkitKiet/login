package com.example.dellinc.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button login;String usern;String passw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button login = (Button)findViewById(R.id.button);

        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText username = (EditText)findViewById(R.id.editText);
                        EditText password = (EditText)findViewById(R.id.editText2);


                        usern=username.getText().toString();
                        passw=password.getText().toString();


                        Toast.makeText(MainActivity.this, "login successfully",
                                    Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "Username= "+usern,
                                Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "password= "+passw,
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(MainActivity.this, second.class);
                        i.putExtra("username1",usern);
                        i.putExtra("password1",passw);

                        startActivity(i);


                    }
                }
        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
