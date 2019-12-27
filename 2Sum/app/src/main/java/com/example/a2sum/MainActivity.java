package com.example.a2sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1;
    private EditText edittext2;
    private Button buttonSum;
    private Button buttonSub;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }


    public void addListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonSum = (Button) findViewById(R.id.button);
        buttonSub = (Button) findViewById(R.id.button1);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                String s="Sum is"+String.valueOf(sum);
                Toast.makeText(getApplicationContext(),s, Toast.LENGTH_LONG).show();
            }
        });


    buttonSub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String value1=edittext1.getText().toString();
            String value2=edittext2.getText().toString();
            int a=Integer.parseInt(value1);
            int b=Integer.parseInt(value2);
            int sum=a-b;
            String s="Sum is"+String.valueOf(sum);
            Toast.makeText(getApplicationContext(),s, Toast.LENGTH_LONG).show();
        }
    });
}
}