package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup radio_1;
    RadioGroup radio_2;
    RadioGroup radio_3;
    EditText txtMessage;
    Button btnSubmit;
    ImageView imgSubmit1;
    ImageView imgSubmit2;
    ImageView imgSubmit3;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    //String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_1 = findViewById(R.id.radio_group1);
        radio_2 = findViewById(R.id.radio_group2);
        radio_3 = findViewById(R.id.radio_group3);
        txtMessage = findViewById(R.id.txt_message);

        btnSubmit = findViewById(R.id.btn_submit);

        imgSubmit1 = findViewById(R.id.img_square);
        imgSubmit2 = findViewById(R.id.img_triangle);
        imgSubmit3 = findViewById(R.id.img_circle);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId1 = radio_1.getCheckedRadioButtonId();
                int selectedId2 = radio_2.getCheckedRadioButtonId();
                int selectedId3 = radio_3.getCheckedRadioButtonId();

                radioButton1 = findViewById(selectedId1);
                radioButton2 = findViewById(selectedId2);
                radioButton3 = findViewById(selectedId3);

                String words = "You've just created a "+ radioButton1.getText()+ "-" + radioButton2.getText() + "-" + radioButton3.getText() + " cake, " +txtMessage.getText();

                //Toast.makeText(MainActivity.this, words,Toast.LENGTH_LONG).show();

                if( TextUtils.isEmpty(txtMessage.getText())){
                    /**
                     *   You can Toast a message here that the Username is Empty
                     **/

                    Toast.makeText(MainActivity.this, "Message is Required",Toast.LENGTH_LONG).show();

                }else{
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                    alertDialogBuilder.setMessage(words);
                    alertDialogBuilder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {

                        }
                    });

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }


            }
        });

        imgSubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                //startActivity(intent);

                Toast.makeText(MainActivity.this, "300 pesos",Toast.LENGTH_LONG).show();

            }
        });

        imgSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                //startActivity(intent);

                Toast.makeText(MainActivity.this, "400 pesos",Toast.LENGTH_LONG).show();

            }
        });

        imgSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                //startActivity(intent);

                Toast.makeText(MainActivity.this, "500 pesos",Toast.LENGTH_LONG).show();

            }
        });



    }
}
