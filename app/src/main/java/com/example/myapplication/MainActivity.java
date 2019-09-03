package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private  SharedPreferences sps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sps=getSharedPreferences("share", MODE_PRIVATE);
    }
    public void onclick(View v)
    {
        switch (v.getId())
        {
            case R.id.button2:
                SharedPreferences.Editor editor=sps.edit();
                editor.putString("NAME","烦");
                editor.commit();
                break;
            case R.id.button:
                String name=sps.getString("NAME","");
                EditText a=findViewById(R.id.textView);
                a.setText(name);
                break;
        }
    }
}
