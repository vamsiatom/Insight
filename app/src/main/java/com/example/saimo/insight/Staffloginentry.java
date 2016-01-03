package com.example.saimo.insight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staffloginentry extends AppCompatActivity implements View.OnClickListener {
    private Button btsprofile, btsebook, btsabtclg,btscpwd,btsdept, btsclist, btsgoals, btslogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staffloginentry);
        init();
    }

    public void init() {
        btsprofile = (Button) findViewById(R.id.btsprofile);
        btsgoals = (Button) findViewById(R.id.btsgoals);
        btsebook = (Button) findViewById(R.id.btsebook);
        btsclist = (Button) findViewById(R.id.btsclist);
        btsabtclg = (Button) findViewById(R.id.btsabtclg);
        btsdept = (Button) findViewById(R.id.btsdept);
        btscpwd = (Button) findViewById(R.id.btscpwd);
        btslogout = (Button) findViewById(R.id.btslogout);

        btsprofile.setOnClickListener(this);
        btsgoals.setOnClickListener(this);
        btsclist.setOnClickListener(this);
        btsdept.setOnClickListener(this);
        btsebook.setOnClickListener(this);
        btscpwd.setOnClickListener(this);
        btsabtclg.setOnClickListener(this);
        btslogout.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btsprofile:
                Intent intent18 = new Intent(Staffloginentry.this, CORE.class);
                startActivity(intent18);
                finish();
                break;
            case R.id.btsebook:
                Intent intent19 = new Intent(Staffloginentry.this, Ebooks.class);
                startActivity(intent19);
                finish();
                break;
            case R.id.btsgoals:
                Intent intent20 = new Intent(Staffloginentry.this, GOALS.class);
                startActivity(intent20);
                finish();
                break;
            case R.id.btsdept:
                Intent intent21 = new Intent(Staffloginentry.this, AboutCollege.class);
                startActivity(intent21);
                finish();
                break;
            case R.id.btsabtclg:
                Intent intent22 = new Intent(Staffloginentry.this, AboutCollege.class);
                startActivity(intent22);
                finish();
                break;
            case R.id.btscpwd:
                Intent intent23 = new Intent(Staffloginentry.this, CORE.class);
                startActivity(intent23);
                finish();
                break;
            case R.id.btsclist:
                Intent intent24 = new Intent(Staffloginentry.this, COUNSELLING.class);
                startActivity(intent24);
                finish();
                break;
            default:
                Intent intent25 = new Intent(Staffloginentry.this, MainActivity.class);
                startActivity(intent25);
                finish();
                break;
        }
    }
}