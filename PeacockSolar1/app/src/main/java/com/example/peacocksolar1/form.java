package com.example.peacocksolar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t1 = (TextView) findViewById(R.id.textView);
                TextView t2 = (TextView) findViewById(R.id.textView2);
                TextView t3 = (TextView) findViewById(R.id.textView3);
                t1.getText();
                t2.getText();
                t3.getText();

            }
        });
    }
}
