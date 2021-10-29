package com.example.guessit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.*;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int randomNumber;
    public void guess(View view){

        EditText editText = (EditText) findViewById(R.id.editText);
        int guessNumber = Integer.parseInt(editText.getText().toString());
        if(guessNumber > randomNumber){
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        } else if(guessNumber < randomNumber){
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You got it! Try again.", Toast.LENGTH_SHORT).show();
        }
        

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}