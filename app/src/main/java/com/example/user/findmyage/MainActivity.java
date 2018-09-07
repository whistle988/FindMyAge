package com.example.user.findmyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button butFindAge;
    TextView textView;
    EditText editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        butFindAge = (Button) findViewById(R.id.butFindAge);
        editText3 = (EditText) findViewById(R.id.editText3);

        // прописываем обработчик
        butFindAge.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {

        int yearOfBirth = Integer.parseInt(editText3.getText().toString());
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int myAge = currentYear - yearOfBirth;

        if (yearOfBirth <= 0){
            textView.setText("invalid input");
        }
        else if (TextUtils.isEmpty(editText3.getText().toString())){
            textView.setText("invalid input, enter your DOB");
        }else {
            textView.setText("Your Age is " + myAge);
        }
    }

}

