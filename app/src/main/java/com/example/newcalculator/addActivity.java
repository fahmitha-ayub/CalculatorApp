package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addActivity extends AppCompatActivity {

    Button b1,b2;
    EditText ed1,ed2;
    TextView ed3;
    String getNum1,getNum2,result;
    Integer num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        b1=(Button) findViewById(R.id.addbut);
        b2=(Button) findViewById(R.id.menubut);
        ed1=(EditText) findViewById(R.id.add1);
        ed2=(EditText) findViewById(R.id.add2);
        ed3=(TextView) findViewById(R.id.res1) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                ed3.setText(result);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob5=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob5);
            }
        });
    }
}
