package com.hope.mycalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import com.hope.mycalculator.R;



public class MainActivity extends AppCompatActivity {

    Button button_c,button_open_bracket,button_close_bracket,button_divide;
    Button button_7,button_8,button_9,button_multiply;
    Button button_4,button_5,button_6,button_plus;
    Button button_1,button_2,button_3,button_minus;
    Button button_ac,button_0,button_dot,button_equals;

    TextView result_tv,solution_tv;

    boolean toplama,cikarma,bolme,carpma;

    float sayi1 ,sayi2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_tv=findViewById(R.id.result_tv);
        solution_tv=findViewById(R.id.solution_tv);

        button_c=(Button) findViewById(R.id.button_c);
        button_open_bracket=(Button) findViewById(R.id.button_open_bracket);
        button_close_bracket=(Button) findViewById(R.id.button_close_bracket);
        button_divide=(Button) findViewById(R.id.button_divide);
        button_7=(Button) findViewById(R.id.button_7);
        button_8=(Button) findViewById(R.id.button_8);
        button_9=(Button) findViewById(R.id.button_9);
        button_multiply=(Button) findViewById(R.id.button_multiply);
        button_4=(Button) findViewById(R.id.button_4);
        button_5=(Button) findViewById(R.id.button_5);
        button_6=(Button) findViewById(R.id.button_6);
        button_minus=(Button) findViewById(R.id.button_minus);
        button_1=(Button) findViewById(R.id.button_1);
        button_2=(Button) findViewById(R.id.button_2);
        button_3=(Button) findViewById(R.id.button_3);
        button_plus=(Button) findViewById(R.id.button_plus);
        button_ac=(Button) findViewById(R.id.button_ac);
        button_0=(Button) findViewById(R.id.button_0);
        button_dot=(Button) findViewById(R.id.button_dot);
        button_equals=(Button) findViewById(R.id.button_equals);

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"");
                solution_tv.setText("");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"1");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"2");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"3");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"4");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"5");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"6");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"7");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"8");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+"9");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               result_tv.setText(result_tv.getText()+"0");
               solution_tv.setText(result_tv.getText());

            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText(result_tv.getText()+".");
                solution_tv.setText(result_tv.getText());

            }
        });

        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("");

            }
        });


        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(result_tv==null){
                    result_tv.setText("");
                }
                else{
                    sayi1=Float.parseFloat(result_tv.getText()+ "");
                    toplama=true;
                    result_tv.setText(null);
                }
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1=Float.parseFloat(result_tv.getText()+"");
                cikarma=true;
                result_tv.setText(null);
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1=Float.parseFloat(result_tv.getText()+"");
                bolme=true;
                result_tv.setText(null);
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1=Float.parseFloat(result_tv.getText()+"");
                carpma=true;
                result_tv.setText(null);
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi2=Float.parseFloat(result_tv.getText()+"");
                if(toplama==true){
                    result_tv.setText(sayi1+sayi2+"");
                    solution_tv.setText(sayi1+"+"+sayi2);
                    toplama=false;
                }
                if(cikarma==true){
                    result_tv.setText(sayi1-sayi2 +"");
                    solution_tv.setText(sayi1+"-"+sayi2);
                    cikarma=false;
                }
                if(bolme==true){
                    result_tv.setText(sayi1/sayi2 + "");
                    solution_tv.setText(sayi1+"/"+sayi2);
                    bolme=false;
                }
                if(carpma==true){
                    result_tv.setText(sayi1*sayi2 +"");
                    solution_tv.setText(sayi1 +"*"+sayi2);
                    carpma=false;
                }
            }
        });

    }
}
