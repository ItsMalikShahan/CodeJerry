package com.example.drcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    //    ArrayList<String> calculation;
    TextView resultTv, calculationTv, acTv, cancelTv, percentageTv, divisionTv, multiplicationTv,
            plusTv, minusTv, equalTv, dotTv, zeroTv, oneTv, twoTv, threeTv, fourTv, fiveTv, sixTv, sevenTv,
            eightTv, nineTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultTv = findViewById(R.id.tv_resultTV);
        calculationTv = findViewById(R.id.tv_calculatingTV);
        acTv = findViewById(R.id.tv_ac);
        cancelTv = findViewById(R.id.tv_cancel);
        percentageTv = findViewById(R.id.tv_percentage);
        divisionTv = findViewById(R.id.tv_division);
        multiplicationTv = findViewById(R.id.tv_multiplication);
        plusTv = findViewById(R.id.tv_plus);
        minusTv = findViewById(R.id.tv_minus);
        equalTv = findViewById(R.id.tv_equal);
        dotTv = findViewById(R.id.tv_dot);
        zeroTv = findViewById(R.id.tv_text0);
        oneTv = findViewById(R.id.tv_text1);
        twoTv = findViewById(R.id.tv_text2);
        threeTv = findViewById(R.id.tv_text3);
        fourTv = findViewById(R.id.tv_text4);
        fiveTv = findViewById(R.id.tv_text5);
        sixTv = findViewById(R.id.tv_text6);
        sevenTv = findViewById(R.id.tv_text7);
        eightTv = findViewById(R.id.tv_text8);
        nineTv = findViewById(R.id.tv_text9);


//    calculation = new ArrayList<>();

        String one = oneTv.getText().toString();
        String two = twoTv.getText().toString();
        String three = threeTv.getText().toString();
        String four = fourTv.getText().toString();
        String five = fiveTv.getText().toString();
        String six = sixTv.getText().toString();
        String seven = sevenTv.getText().toString();
        String eight = eightTv.getText().toString();
        String nine = nineTv.getText().toString();
        String zero = zeroTv.getText().toString();
        String dot = dotTv.getText().toString();
        String multiply = multiplicationTv.getText().toString();
        String addition = plusTv.getText().toString();
        String subtraction = minusTv.getText().toString();
        String division = divisionTv.getText().toString();


        oneTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculationTv.setText(calculationTv.getText() + one);
            }
        });

        twoTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(two);
                calculationTv.setText(calculationTv.getText() + two);
            }
        });

        threeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(three);
                calculationTv.setText(calculationTv.getText() + three);
            }
        });
        fourTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(four);
                calculationTv.setText(calculationTv.getText() + four);
            }
        });
        fiveTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(five);
                calculationTv.setText(calculationTv.getText() + five);
            }
        });
        sixTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(six);
                calculationTv.setText(calculationTv.getText() + six);
            }
        });
        sevenTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(seven);
                calculationTv.setText(calculationTv.getText() + seven);
            }
        });
        eightTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(eight);
                calculationTv.setText(calculationTv.getText() + eight);
            }
        });
        nineTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                calculation.add(nine);
                calculationTv.setText(calculationTv.getText() + nine);
            }
        });
        zeroTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (!calculationTv.getText().toString().isEmpty()) {
//                    calculation.add(zero);
                calculationTv.setText(calculationTv.getText() + zero);

            }
        });
        acTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText("");
                calculationTv.setText("");
            }
        });

        cancelTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calculationTv.getText().toString();
                if (text.length() > 0) {
                    String modifiedText = text.substring(0, text.length() - 1);
                    calculationTv.setText(modifiedText);
                }

            }
        });
        dotTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calculationTv.getText().toString().isEmpty()) {
                    calculationTv.setText(calculationTv.getText() + dot);
                }
            }
        });
        plusTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calculationTv.getText().toString();
                if (text.length() > 0) {
                    char lastChar = text.charAt(text.length() - 1);
                    if (lastChar >= '0' && lastChar <= '9') {
                        calculationTv.setText(text + " " + addition + " ");
                    } else if (lastChar == '+') {
                        // do nothing
                    } else {
                        // do nothing
                    }
                }
            }
        });
        divisionTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calculationTv.getText().toString();
                if (text.length() > 0) {
                    char lastChar = text.charAt(text.length() - 1);
                    if (lastChar >= '0' && lastChar <= '9') {
                        calculationTv.setText(text + " " + division + " ");
                    } else if (lastChar == '+') {
                        // do nothing
                    } else {
                        // do nothing
                    }
                }

            }
        });

        multiplicationTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calculationTv.getText().toString();
                if (text.length() > 0) {
                    char lastChar = text.charAt(text.length() - 1);
                    if (lastChar >= '0' && lastChar <= '9') {
                        calculationTv.setText(text + " * ");
                    } else if (lastChar == '+') {
                        // do nothing
                    } else {
                        // do nothing
                    }
                }
            }
        });
        minusTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calculationTv.getText().toString();
                if (text.length() > 0) {
                    char lastChar = text.charAt(text.length() - 1);
                    if (lastChar >= '0' && lastChar <= '9') {
                        calculationTv.setText(text + " " + subtraction + " ");
                    } else if (lastChar == '+') {
                        // do nothing
                    } else {
                        // do nothing
                    }
                }
            }
        });

        equalTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calculationTv.getText().toString();
                if (!text.isEmpty()) {
                    char lastChar = text.charAt(text.length() - 1);
                    if (lastChar >= '0' && lastChar <= '9') {
                        // Evaluate the expression and display the result on the resultTv
                        Expression expression = new ExpressionBuilder(text).build();
                        double result = expression.evaluate();
                        resultTv.setText(String.valueOf(result));
                    } else {
                        // Remove the last operator from the expression
                        String modifiedText = text.substring(0, text.length() - 1);
                        Expression expression = new ExpressionBuilder(modifiedText).build();
                        double result = expression.evaluate();
                        resultTv.setText(String.valueOf(result));
                    }
                }
            }
        });

    }
}