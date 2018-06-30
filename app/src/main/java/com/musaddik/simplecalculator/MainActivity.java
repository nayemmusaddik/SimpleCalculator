package com.musaddik.simplecalculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Create object
        Button btnsum = (Button) findViewById(R.id.buttonsum);
        Button btnsub = (Button) findViewById(R.id.buttonsub);
        Button btndiv = (Button) findViewById(R.id.buttondiv);
        Button btnmul = (Button) findViewById(R.id.buttonmul);
        final EditText etv = (EditText) findViewById(R.id.editText1);
        final EditText etv2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView1);
// Create button click event
        btnsum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sum = x + y; //Perform Maths operation
                result.setText("The ANS of " + x + " + " + y + " = " + sum);//print answer
            }
        });
        btnsub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sub = x - y; //Perform Maths operation
                result.setText("The ANS of " + x + " - " + y + " = " + sub);//print answer
            }
        });
        btndiv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int div = x / y; //Perform Maths operation
                result.setText("The ANS of " + x + " / " + y + " = " + div);//print answer
            }
        });
        btnmul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int mul = x * y; //Perform Maths operation
                result.setText("The ANS of " + x + " * " + y + " = " + mul);//Print answer
            }
        });
    }
}