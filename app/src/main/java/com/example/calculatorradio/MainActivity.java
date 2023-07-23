package com.example.calculatorradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1,e2;
        Button b1;
        RadioGroup r1;
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        r1=findViewById(R.id.r1);
        b1=findViewById(R.id.b1);
        b1.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                return false;
            }
        });




    }

    public void calculate(View view){
        EditText e1,e2;
        Button b1;
        TextView t1=findViewById(R.id.t1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);


       float num1=Float.parseFloat(e1.getText().toString());
       float num2=Float.parseFloat(e2.getText().toString());

        RadioGroup r1;
        r1=findViewById(R.id.r1);
        int id=r1.getCheckedRadioButtonId();

        if(id==R.id.add){
            float sum=num1+num2;
            //t1.setText("Addition= "+sum);
            Toast.makeText(getApplicationContext(),"Addition is= "+sum+"Id= "+id,Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.sub){
            float sub=num1-num2;
            // t1.setText("Addition= "+sub);
           Toast.makeText(getApplicationContext(),"Substraction is= "+sub,Toast.LENGTH_SHORT).show();
        }

       else if(id==R.id.mul){
            float mul=num1*num2;
//            t1.setText("Addition= "+sum);
            Toast.makeText(getApplicationContext(),"Multiplication is= "+mul,Toast.LENGTH_SHORT).show();
        }

       else if(id==R.id.div){
            float div=num1/num2;
            Toast.makeText(getApplicationContext(),"Division is= "+div,Toast.LENGTH_SHORT).show();
        }

        else if(id==-1)
            Toast.makeText(getApplicationContext(),"Choose Any Option",Toast.LENGTH_SHORT).show();
    }
}