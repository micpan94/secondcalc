package com.example.panczopc.secondcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnc,btnmulti,btndiv,btnplus,btnminus,btnequal;
    private TextView info,result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private  double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                clear();
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
               clear();
            }

        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
               clear();
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                clear();
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQU;
               result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
               clear();
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                val1 = Double.NaN;
                val2 = Double.NaN;
                info.setText(null);
                result.setText(null);


            }
        });

    }


   private void init(){
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 =(Button)findViewById(R.id.btn1);
       btn2 =(Button)findViewById(R.id.btn2);
       btn3 =(Button)findViewById(R.id.btn3);
       btn4 =(Button)findViewById(R.id.btn4);
       btn5 =(Button)findViewById(R.id.btn5);
       btn6 =(Button)findViewById(R.id.btn6);
       btn7 =(Button)findViewById(R.id.btn7);
       btn8 =(Button)findViewById(R.id.btn8);
       btn9 =(Button)findViewById(R.id.btn9);
       btnc =(Button)findViewById(R.id.btnc);
       btnmulti = (Button)findViewById(R.id.btnmulti);
       btndiv = (Button)findViewById(R.id.btndiv);
       btnplus = (Button)findViewById(R.id.btnplus);
       btnminus = (Button)findViewById(R.id.btnminus);
       btnequal =(Button)findViewById(R.id.btnequal);
       result = (TextView) findViewById(R.id.tvresult);
       info =(TextView)findViewById(R.id.tvcontrol);


    }

    private void compute(){
        if(!Double.isNaN(val1))  {

            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case EQU:
                    break;


            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }


    }
    private void clear(){
        info.setText("");

    }
}
