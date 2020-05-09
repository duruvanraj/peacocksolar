package com.example.peacocksolar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class form extends AppCompatActivity {

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.editText);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Name = t1.getText().toString();
                if(!isValidName(Name)) {
                    t1.setError("Invalid Name");
                }
                final String Address = t2.getText().toString();
                if(!isValidAddress(Address)){
                    t2.setError("Invalid Address");

                }
                final String Email = t3.getText().toString();
                if(!isinvalidEmail(Email)) {
                    t3.setError("Invalid Email");
                }
                final String PhoneNo = t4.getText().toString();
                if(!isinvalidPhone(PhoneNo)){
                    t4.setError("Invalid PhoneNo.");
                }
            }
        });
    }

    private boolean isinvalidEmail(String Email){
        String EMAIL_PATTERN = "[a-z.0-9]{1,}[@]{1}[a-z]{1,}[.]{1}[a-z]{1,}";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

    private boolean isinvalidPhone(String Phone){
        String MOBILE_PATTERN = "[0-9]{10}";
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        Matcher matcher = pattern.matcher(Phone);
        return matcher.matches();
    }

    private boolean isValidName(String Name){
        String NAME_PATTERN = "[A-Z a-z]{1,}";
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(Name);
        return matcher.matches();
    }

    private boolean isValidAddress(String Address){
        String ADDRESS_PATTERN = "[A-Z a-z0-9]{1,}";
        Pattern pattern = Pattern.compile(ADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(Address);
        return matcher.matches();
    }
}
