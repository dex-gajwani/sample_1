package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.name);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "WELCOME TO THE NEXT PAGE", Toast.LENGTH_SHORT).show();
                edit.getText();
                Intent intent = new Intent(MainActivity.this , nextpage.class);
                intent.putExtra("DHRUV" , edit.getText().toString());
                if(TextUtils.isEmpty(edit.getText())){
                    Toast.makeText(MainActivity.this, "LIKH KUCH", Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main Activity" , "in onStartMethod");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main Activity" , "in OnPause Method");
    }
}