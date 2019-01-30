package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Bon toutou :)", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        TextView showCountTextView = (TextView) findViewById(R.id.textViewCount);

        String countString = showCountTextView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count ++;

        showCountTextView.setText(count.toString());
    }

    public void randomMe(View view){
        TextView showRandomTextView = (TextView) findViewById(R.id.textViewCount);

        String randomString = showRandomTextView.getText().toString();

        Integer rand = (int)(Math.random() * ((100) + 1));


        showRandomTextView.setText(rand.toString());
    }

    public void bonToutou(View view){
        Intent toutouIntent = new Intent(this, secondActivity.class);

        startActivity(toutouIntent);
    }
}
