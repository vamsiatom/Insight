package com.example.saimo.insight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etcollegeid,etpasscode;
    private Button btlogin,btstudent,btstaff,btstafflogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
public void init()
{
    btlogin = (Button)findViewById(R.id.btlogin);
    btstudent = (Button)findViewById(R.id.btstudent);
    btstaff = (Button)findViewById(R.id.btstaff);
    btstafflogin = (Button)findViewById(R.id.btstafflogin);
    etcollegeid = (EditText)findViewById(R.id.etcollegeid);
    etpasscode = (EditText)findViewById(R.id.etpasscode);

    btlogin.setOnClickListener(this);
    btstaff.setOnClickListener(this);
    btstudent.setOnClickListener(this);
    btstafflogin.setOnClickListener(this);
}
    public void onClick(View view){
        switch (view.getId())
        {
            case R.id.btlogin:
                Intent intent = new Intent(MainActivity.this,Studentloginentry.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btstaff:
                Intent intent1 = new Intent(MainActivity.this,Staffregister.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.btstafflogin:
                Intent intent26 = new Intent(MainActivity.this,Staffloginentry.class);
                startActivity(intent26);
                finish();
                break;
            default:
                Intent intent2 = new Intent(MainActivity.this,StudentRegister.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
