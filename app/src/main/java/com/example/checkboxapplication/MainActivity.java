package com.example.checkboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox google,firefox,yahoo;
    private Button Wresult;
    private TextView result;
    private ArrayList<String> mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        google=findViewById(R.id.google);
        firefox=findViewById(R.id.firefox);
        yahoo=findViewById(R.id.yahoo);
        Wresult=findViewById(R.id.Wresult);
        result=findViewById(R.id.result);
        mResult=new ArrayList<>();
        Wresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (google.isChecked())
                    mResult.add("Google");
                else
                   mResult.remove("Google");
                
            }
        });
        firefox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firefox.isChecked())
                    mResult.add("Firefox");
                else
                    mResult.remove("Firefox");
            }
        });
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yahoo.isChecked())
                    mResult.add("Yahoo");
                else
                    mResult.remove("Yahoo");
            }
        });
        Wresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
                for (String s:mResult)
                    stringBuilder.append(s).append("\n");
                Wresult.setText(stringBuilder.toString());
                Wresult.setEnabled(false);
            }
        });
    }
}