package com.example.pairassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Locale;

import static java.lang.String.*;


public class MainActivity extends AppCompatActivity {

    double in1 = 0, i2 = 0;
    TextView edittext1,edittext2;
    boolean Add, Sub, Multiply, Divide, deci, dot_clicked;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub,
            button_Mul, button_Div, button_Equ, button_Del, button_Dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dot_clicked = false;
        DecimalFormat output = new DecimalFormat("##.####");

        button_0 = (Button) findViewById(R.id.b0);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Dot = (Button) findViewById(R.id.bDot);
        button_Add = (Button) findViewById(R.id.badd);
        button_Sub = (Button) findViewById(R.id.bsub);
        button_Mul = (Button) findViewById(R.id.bmul);
        button_Div = (Button) findViewById(R.id.biv);
        button_Del = (Button) findViewById(R.id.buttonDel);
        button_Equ = (Button) findViewById(R.id.buttoneql);

        edittext1 = (TextView) findViewById(R.id.display);
        edittext2 = (TextView) findViewById(R.id.display2);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "1");

              }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "4");
         }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "5");
        }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "6");
        }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "7");
        }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "8");
        }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "9");
        }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            edittext1.setText(edittext1.getText() + "0");
        }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot_clicked = false;

                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    edittext2.setText("+");
                    Add = true;
                    deci = false;
                    edittext1.setHint(null);
                    edittext1.setText(null);
                }
            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot_clicked = false;

                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    edittext2.setText("-");

                    Sub = true;
                    deci = false;
                    edittext1.setHint(null);
                    edittext1.setText(null);
                }
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot_clicked = false;

                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    edittext2.setText("*");

                    Multiply = true;
                    deci = false;

                    edittext1.setHint(null);
                    edittext1.setText(null);
                }
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot_clicked = false;

                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    edittext2.setText("/");

                    Divide = true;
                    deci = false;

                    edittext1.setHint(null);
                    edittext1.setText(null);
                }
            }
        });


        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide) {
                    i2 = Float.parseFloat(edittext1.getText() + " ");
                }


                if (Add) {

                    edittext2.setText(output.format(in1 + i2));
                    edittext1.setText(" ");
                    Add = false;
                }

                if (Sub) {

                    edittext2.setText(output.format(in1 - i2));
                    edittext1.setText(" ");
                    Sub = false;
                }

                if (Multiply) {

                    edittext2.setText(output.format(in1 * i2));
                    edittext1.setText(" ");
                    Multiply = false;
                }

                if (Divide) {

                    edittext2.setText(output.format(in1 / i2));
                    edittext1.setText(" ");
                    Divide = false;
                }

            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(null);
                edittext1.setHint("Input");

                edittext2.setText(null);
                edittext2.setHint("Result");

                dot_clicked = false;
                in1 = 0.0;
                i2 = 0.0;
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().toString().isEmpty()) {

                    edittext1.setText("0.");
                    dot_clicked = true;
                }

                if (dot_clicked == false) {

                    edittext1.append(".");
                    dot_clicked = true;
                }
            }
        });
    }
}

