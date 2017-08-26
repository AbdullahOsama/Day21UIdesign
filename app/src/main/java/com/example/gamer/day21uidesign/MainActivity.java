package com.example.gamer.day21uidesign;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=(Button)findViewById(R.id.button);
    }
    public void onClick(View view) {
        Toast.makeText(this, "Button clicked ! ", Toast.LENGTH_SHORT).show();
    }



}