package com.example.weatherapp2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //TextView mainCity;
    //TextView mainTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mainCity = findViewById(R.id.mainCity);
        //mainTemp = findViewById(R.id.mainTemp);
    }

//    public void otherCity(View view) {
//        Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
//        startActivityForResult(myIntent, 2);
//    }

       @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode != 2){
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if(resultCode == RESULT_OK){
            //mainCity.setText(data.getStringExtra("TEXT"));
            //mainTemp.setText(data.getStringExtra("TEMP"));
        }
    }
//    TextView mainCity;
//    TextView mainTemp;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        mainCity = findViewById(R.id.mainCity);
//        mainTemp = findViewById(R.id.mainTemp);
//    }
//
//    public void otherCity(View view) {
//        Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
//        startActivityForResult(myIntent, 2);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        if(requestCode != 2){
//            super.onActivityResult(requestCode, resultCode, data);
//            return;
//        }
//        if(resultCode == RESULT_OK){
//            mainCity.setText(data.getStringExtra("TEXT"));
//            mainTemp.setText(data.getStringExtra("TEMP"));
//        }
//    }
}
