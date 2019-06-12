package com.fastcampus.calculater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView num0;
    TextView num1;
    TextView num2;
    TextView num3;
    TextView num4;
    TextView num5;
    TextView num6;
    TextView num7;
    TextView num8;
    TextView num9;
    TextView minus;
    TextView plus;
    TextView equal;
    TextView result;

    String temp = "";
    int resultTemp = 0;
    String operator = "";
    String operationTemp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setupListeners();
    }

    private void findViews(){
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        equal = findViewById(R.id.equal);
        result = findViewById(R.id.result);
    }

    private void setupListeners() {
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "0";
                setResult(temp);
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "1";
                setResult(temp);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "2";
                setResult(temp);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "3";
                setResult(temp);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "4";
                setResult(temp);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "5";
                setResult(temp);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "6";
                setResult(temp);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "7";
                setResult(temp);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "8";
                setResult(temp);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "9";
                setResult(temp);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!temp.isEmpty()) {
                    operation();
                    operator = "plus";
                    temp = "";
                    result.setText("" + resultTemp);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!temp.isEmpty()) {
                    operation();
                    operator = "minus";
                    temp = "";
                    result.setText("" + resultTemp);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                result.setText("" + resultTemp);
                resultTemp = 0;
                temp = "";
                operator = "";
            }
        });
    }

    private void setResult(String temp) {
        result.setText(temp);
    }

    private void operation() {
        int tempNum = Integer.parseInt(temp);

        if(!operator.isEmpty()) {
            int operationNum = Integer.parseInt(operationTemp);

            if(operator.equals("plus")) {
                resultTemp = operationNum + tempNum;
                operationTemp = String.valueOf(resultTemp);
            } else {
                resultTemp = operationNum - tempNum;
                operationTemp = String.valueOf(resultTemp);
            }
        } else {
           resultTemp = tempNum;
           operationTemp = String.valueOf(resultTemp);
        }

    }
}
