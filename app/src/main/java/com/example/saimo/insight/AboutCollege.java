package com.example.saimo.insight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutCollege extends AppCompatActivity implements View.OnClickListener {

    private Button bthod,btvision,btmission,btback2,btchair,btnews,btfee,btplace,btprinci,btcourse,btevents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_college);
        init1();
    }
    public void init1()
    {
        bthod = (Button) findViewById(R.id.bthod);
        btfee = (Button) findViewById(R.id.btfee);
        btcourse = (Button) findViewById(R.id.btcourse);
        btplace = (Button) findViewById(R.id.btplace);
        btprinci = (Button) findViewById(R.id.btprinci);
        btchair = (Button) findViewById(R.id.btchair);
        btmission = (Button) findViewById(R.id.btmission);
        btvision = (Button) findViewById(R.id.btvision);
        btevents = (Button) findViewById(R.id.btevents);
        btnews = (Button) findViewById(R.id.btnews);
        btback2 = (Button) findViewById(R.id.btback2);

        btcourse.setOnClickListener(this);
        btprinci.setOnClickListener(this);
        btchair.setOnClickListener(this);
        btmission.setOnClickListener(this);
        btback2.setOnClickListener(this);
        btevents.setOnClickListener(this);
        btfee.setOnClickListener(this);
        bthod.setOnClickListener(this);
        btplace.setOnClickListener(this);
        btvision.setOnClickListener(this);
        btnews.setOnClickListener(this);

    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bthod:
                Intent intent50=new Intent(AboutCollege.this, CORE.class);
                startActivity(intent50);
                finish();
                break;
            case R.id.btcourse:
                Intent intent57= new Intent(AboutCollege.this,Courses.class);
                startActivity(intent57);
                finish();
                break;
            case R.id.btfee:
                Intent intent58= new Intent(AboutCollege.this,Feestructure.class);
                startActivity(intent58);
                finish();
                break;
            case R.id.btnews:
                Intent intent59= new Intent(AboutCollege.this,News.class);
                startActivity(intent59);
                finish();
                break;
            case R.id.btback2:
                Intent intent54= new Intent(AboutCollege.this,Studentloginentry.class);
                startActivity(intent54);
                finish();
                break;
            case R.id.btplace:
                Intent intent61=new Intent(AboutCollege.this,Placements.class);
                startActivity(intent61);
                finish();
                break;
            case R.id.btvision:
                Intent intent55= new Intent(AboutCollege.this,Vision.class);
                startActivity(intent55);
                finish();
                break;
            case R.id.btmission:
                Intent intent51= new Intent(AboutCollege.this,Mission.class);
                startActivity(intent51);
                finish();
                break;
            case R.id.btchair:
                Intent intent52= new Intent(AboutCollege.this,Aboutchairman.class);
                startActivity(intent52);
                finish();
                break;
            case R.id.btevents:
                Intent intent53= new Intent(AboutCollege.this,Events.class);
                startActivity(intent53);
                finish();
                break;
            default:
                Intent intent60=new Intent(AboutCollege.this,Principal.class);
                startActivity(intent60);
                finish();
                break;
}
}
}