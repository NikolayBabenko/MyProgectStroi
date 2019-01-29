package com.babnik.materialfor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText craser, mp75,vsego;
    TextView res_mp75, res_craser, itogo;
    Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        craser = (EditText) findViewById(R.id.crazer);
        mp75 = (EditText) findViewById(R.id.mp75);

        res_mp75 = (TextView) findViewById(R.id.res_mp75);
        res_craser = (TextView) findViewById(R.id.res_craser);
        vsego = (EditText) findViewById(R.id.vsego);
        itogo = (TextView) findViewById(R.id.itogo);

        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(this);



        }





    @Override
    public void onClick(View view) {
        if( craser.length() == 0 )
        {
            Toast.makeText(this,"Не введена квадратура по цементно-песщаной штукатурке.",Toast.LENGTH_LONG).show();
            int mp75Int = Integer.parseInt(mp75.getText().toString());
            res_mp75.setText( mp75Int/ 7 * 4 +"");
            itogo.setText(((mp75Int * Integer.parseInt(vsego.getText().toString()))/2/3 +""));


        }
        else {

        int mp75Int = Integer.parseInt(mp75.getText().toString());
        res_mp75.setText( mp75Int/ 7 * 4 +"");
        int craserInt = Integer.parseInt(craser.getText().toString());
        res_craser.setText(craser.getText().toString());
        itogo.setText(((mp75Int + craserInt)* Integer.parseInt(vsego.getText().toString()))/2/3 +"");
        }



    }}
