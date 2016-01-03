package com.example.saimo.insight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ebooks extends AppCompatActivity implements View.OnClickListener {

    private Button btgate, btgre, btcat, btprog, bteng, btquant, btsem, btcore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooks);
        initbb();
    }

    public void initbb() {
        btgate = (Button) findViewById(R.id.btgate);
        btgre = (Button) findViewById(R.id.btgre);
        btcat = (Button) findViewById(R.id.btcat);
        btprog = (Button) findViewById(R.id.btprog);
        bteng = (Button) findViewById(R.id.bteng);
        btquant = (Button) findViewById(R.id.btquant);
        btsem = (Button) findViewById(R.id.btsem);
        btcore = (Button) findViewById(R.id.btcore);

        btcat.setOnClickListener(this);
        btcore.setOnClickListener(this);
        bteng.setOnClickListener(this);
        btgate.setOnClickListener(this);
        btprog.setOnClickListener(this);
        btquant.setOnClickListener(this);
        btgre.setOnClickListener(this);
        btsem.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btgate:
                Intent intent28 = new Intent(Ebooks.this, GATE.class);
                startActivity(intent28);
                finish();
                break;
            case R.id.btgre:
                Intent intent29 = new Intent(Ebooks.this, GRE.class);
                startActivity(intent29);
                finish();
                break;
            case R.id.btcat:
                Intent intent30 = new Intent(Ebooks.this, CAT.class);
                startActivity(intent30);
                finish();
                break;
            case R.id.btcore:
                Intent intent31 = new Intent(Ebooks.this, CORE.class);
                startActivity(intent31);
                finish();
                break;
            case R.id.bteng:
                Intent intent32 = new Intent(Ebooks.this, ENGLISH.class);
                startActivity(intent32);
                finish();
                break;
            case R.id.btprog:
                Intent intent33 = new Intent(Ebooks.this, PROGRAMMING.class);
                startActivity(intent33);
                finish();
                break;
            case R.id.btsem:
                Intent intent34 = new Intent(Ebooks.this, SEMESTER.class);
                startActivity(intent34);
                finish();
                break;
            case R.id.btquant:
                Intent intent35 = new Intent(Ebooks.this, QUANT.class);
                startActivity(intent35);
                finish();
                break;
        }
    }
}
