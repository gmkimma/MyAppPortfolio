package com.gregkimma.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void message1(View view) {
        showToastMessage("This button will launch my Popular Movies App");
    }

    public void message2(View view) {
        showToastMessage("This button will launch my Stock Hawk App");
    }

    public void message3(View view) {
        showToastMessage("This button will launch my Build It Bigger App");
    }

    public void message4(View view) {
        showToastMessage("This button will launch my Make Your App Material App");
    }

    public void message5(View view) {
        showToastMessage("This button will launch my Go Ubiquitous App");
    }

    public void message6(View view) {
        showToastMessage("This button will launch my Capstone App");
    }

    private void showToastMessage(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}