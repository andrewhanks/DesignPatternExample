package com.example.andrewhanks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andrewhanks.myapplication.template.TemplateMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button templateButton = (Button) findViewById(R.id.template);
        templateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemplateMain templateMain = new TemplateMain();
                templateMain.start();
            }
        });
    }
}
