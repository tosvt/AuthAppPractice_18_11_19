package com.example.authapppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

        switch(v.getId()){
            case R.id.btn_auth:

                Intent other = new Intent(this, Auth.class);
                EditText ed = findViewById(R.id.editLogin);
                other.putExtra("Login", ed.getText().toString());
                startActivity(other);
                break;


                break;
        }

    }
}
