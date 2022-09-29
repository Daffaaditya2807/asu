package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText login,password1;
    Button submit;
    CheckBox chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showHide();
        login();
    }
    public void showHide(){
        password1 = (EditText) findViewById(R.id.password);
        chk = (CheckBox) findViewById(R.id.showHide);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    password1.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    password1.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
    }
    public void login(){
        login = (EditText) findViewById(R.id.username);
        password1 = (EditText) findViewById(R.id.password);
        submit = (Button) findViewById(R.id.save);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = login.getText().toString();
                String password = password1.getText().toString();

                if (username.equals("admin")&&password.equals("admin")){
                    Intent i = new Intent(getApplicationContext(),Gajelas.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "GAGAL", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}