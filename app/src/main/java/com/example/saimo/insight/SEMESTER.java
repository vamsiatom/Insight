package com.example.saimo.insight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SEMESTER extends AppCompatActivity implements View.OnClickListener {

    private Button bt11, bt12, bt21, bt22, bt31, bt32, bt41, bt42, btback3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        vamsi();
    }

    public void vamsi() {
        bt11 = (Button) findViewById(R.id.bt11);
        bt42 = (Button) findViewById(R.id.bt42);
        bt32 = (Button) findViewById(R.id.bt32);
        bt22 = (Button) findViewById(R.id.bt22);
        bt12 = (Button) findViewById(R.id.bt12);
        bt21 = (Button) findViewById(R.id.bt21);
        bt31 = (Button) findViewById(R.id.bt31);
        bt41 = (Button) findViewById(R.id.bt41);
        btback3 = (Button) findViewById(R.id.btback3);

        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt21.setOnClickListener(this);
        bt22.setOnClickListener(this);
        bt31.setOnClickListener(this);
        bt32.setOnClickListener(this);
        bt41.setOnClickListener(this);
        bt42.setOnClickListener(this);
        btback3.setOnClickListener(this);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt11:
                Intent intent80 = new Intent(SEMESTER.this, One_one.class);
                startActivity(intent80);
                finish();
                break;
            case R.id.bt12:
                Intent intent81 = new Intent(SEMESTER.this, One_two.class);
                startActivity(intent81);
                finish();
                break;
            case R.id.bt21:
                Intent intent82 = new Intent(SEMESTER.this, Two_one.class);
                startActivity(intent82);
                finish();
                break;
            case R.id.bt22:
                Intent intent83 = new Intent(SEMESTER.this, Two_two.class);
                startActivity(intent83);
                finish();
                break;
            case R.id.bt31:
                Intent intent84 = new Intent(SEMESTER.this, Three_one.class);
                startActivity(intent84);
                finish();
                break;
            case R.id.bt32:
                Intent intent85 = new Intent(SEMESTER.this, Three_two.class);
                startActivity(intent85);
                finish();
                break;
            case R.id.bt41:
                Intent intent86 = new Intent(SEMESTER.this, Four_one.class);
                startActivity(intent86);
                finish();
                break;
            case R.id.bt42:
                Intent intent87 = new Intent(SEMESTER.this, Four_two.class);
                startActivity(intent87);
                finish();
                break;
            default:
                Intent intent88 = new Intent(SEMESTER.this, Ebooks.class);
                startActivity(intent88);
                finish();
                break;


        }
    }
}
