package com.example.saimo.insight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Studentloginentry extends AppCompatActivity implements View.OnClickListener {
    private Button btprofile, btatten, btfdback, btabtclg, btdept, btcp, btstdt, btctinf, btlogout, btnoti, btcpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentloginentry);
        init();
    }

    public void init() {
        btprofile = (Button) findViewById(R.id.btsprofile);
        btatten = (Button) findViewById(R.id.btslogout);
        btfdback = (Button) findViewById(R.id.btfdback);
        btabtclg = (Button) findViewById(R.id.btsabtclg);
        btdept = (Button) findViewById(R.id.btdept);
        btcp = (Button) findViewById(R.id.btcp);
        btstdt = (Button) findViewById(R.id.btstdt);
        btctinf = (Button) findViewById(R.id.btctinf);
        btlogout = (Button) findViewById(R.id.btsclist);
        btnoti = (Button) findViewById(R.id.btnoti);
        btcpwd = (Button) findViewById(R.id.btscpwd);

        btprofile.setOnClickListener(this);
        btatten.setOnClickListener(this);
        btfdback.setOnClickListener(this);
        btabtclg.setOnClickListener(this);
        btdept.setOnClickListener(this);
        btcp.setOnClickListener(this);
        btstdt.setOnClickListener(this);
        btctinf.setOnClickListener(this);
        btlogout.setOnClickListener(this);
        btnoti.setOnClickListener(this);
        btcpwd.setOnClickListener(this);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btsprofile:
                Intent intent3 = new Intent(Studentloginentry.this, CORE.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.btslogout:
                Intent intent4 = new Intent(Studentloginentry.this, Attendance.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.btfdback:
                Intent intent5 = new Intent(Studentloginentry.this, Feedbackform.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.btsabtclg:
                Intent intent6 = new Intent(Studentloginentry.this, AboutCollege.class);
                startActivity(intent6);
                finish();
                break;
            case R.id.btdept:
                Intent intent7 = new Intent(Studentloginentry.this, QUANT.class);
                startActivity(intent7);
                finish();
                break;
            case R.id.btcp:
                Intent intent8 = new Intent(Studentloginentry.this, QUANT.class);
                startActivity(intent8);
                finish();
                break;
            case R.id.btstdt:
                Intent intent9 = new Intent(Studentloginentry.this, Staffdetails.class);
                startActivity(intent9);
                finish();
                break;
            case R.id.btctinf:
                Intent intent10 = new Intent(Studentloginentry.this, AboutCollege.class);
                startActivity(intent10);
                finish();
                break;
            case R.id.btnoti:
                Intent intent11 = new Intent(Studentloginentry.this, Notifications.class);
                startActivity(intent11);
                finish();
                break;
            case R.id.btscpwd:
                Intent intent12 = new Intent(Studentloginentry.this, AboutCollege.class);
                startActivity(intent12);
                finish();
                break;
            default:
                Intent intent13 = new Intent(Studentloginentry.this, MainActivity.class);
                startActivity(intent13);
                finish();
                break;
        }
    }
}