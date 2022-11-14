package com.example.clac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText num1 , num2 ;
private Button sum , mult , sub , div ;
private TextView result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initIU();
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
       int number1=Integer.parseInt(num1.getText().toString().trim());
       int number2=Integer.parseInt(num2.getText().toString().trim());
       int res = number1+number2 ;
       result.setText("result is"+res);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(num1.getText().toString().trim());
                int number2=Integer.parseInt(num2.getText().toString().trim());
                int res = number1-number2 ;
                result.setText("result is"+res);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(num1.getText().toString().trim());
                int number2=Integer.parseInt(num2.getText().toString().trim());
                int res = number1/number2 ;
                result.setText("result is"+res);

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(num1.getText().toString().trim());
                int number2=Integer.parseInt(num2.getText().toString().trim());
                int res = number1+number2 ;
                result.setText("result is"+res);

            }
        });

    }
private void initIU(){
        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        sum  =findViewById(R.id.sum);
        sub  =findViewById(R.id.sub);
        mult  =findViewById(R.id.mult);
        div  =findViewById(R.id.div);
        result =findViewById(R.id.result);

}
}