package org.sandec.personalcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProfileA = findViewById(R.id.buttonProfile);
        btnProfileA.setOnClickListener(this);

        Button btnPortofolioA = findViewById(R.id.buttonPortofolio);
        btnPortofolioA.setOnClickListener(this);

        Button btnEducationA = findViewById(R.id.buttonEducation);
        btnEducationA.setOnClickListener(this);

        Button btnContactA = findViewById(R.id.buttonContact);
        btnContactA.setOnClickListener(this);

        Button btnSkillA = findViewById(R.id.buttonSkill);
        btnSkillA.setOnClickListener(this);

        Button btnCertificateA = findViewById(R.id.buttonCertificate);
        btnCertificateA.setOnClickListener(this);

        Button btnOrganizationA = findViewById(R.id.buttonOrganization);
        btnOrganizationA.setOnClickListener(this);

        Button btnInfoA = findViewById(R.id.buttonInfo);
        btnInfoA.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonPortofolio:
                Intent moveIntent = new Intent(MainActivity.this, Portofolio.class);
                startActivity(moveIntent);
                break;
            case R.id.buttonProfile:
                Intent moveIntentA = new Intent(MainActivity.this, Profile.class);
                startActivity(moveIntentA);
                break;
            case R.id.buttonEducation:
                Intent moveIntentB = new Intent(MainActivity.this, Education.class);
                startActivity(moveIntentB);
                break;
            case R.id.buttonContact:
                Intent moveIntentC = new Intent(MainActivity.this, Contact.class);
                startActivity(moveIntentC);
                break;
            case R.id.buttonSkill:
                Intent moveIntentD = new Intent(MainActivity.this, Skills.class);
                startActivity(moveIntentD);
                break;
            case R.id.buttonCertificate:
                Intent moveIntentE = new Intent(MainActivity.this, Certificate.class);
                startActivity(moveIntentE);
                break;
            case R.id.buttonOrganization:
                Intent moveIntentF = new Intent(MainActivity.this, Organization.class);
                startActivity(moveIntentF);
                break;
            case R.id.buttonInfo:
                Intent moveIntentG = new Intent(MainActivity.this, Info.class);
                startActivity(moveIntentG);
                break;
        }
    }
}
