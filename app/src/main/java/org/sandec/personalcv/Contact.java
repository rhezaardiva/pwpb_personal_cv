package org.sandec.personalcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button btnEmail = findViewById(R.id.buttonemail);
        btnEmail.setOnClickListener(this);

        Button btnwhatsapp = findViewById(R.id.buttonwhatsapp);
        btnwhatsapp.setOnClickListener(this);

        Button btntwitter = findViewById(R.id.buttontwitter);
        btntwitter.setOnClickListener(this);

        Button btntelegram = findViewById(R.id.buttontelegram);
        btntelegram.setOnClickListener(this);

        Button btnpinterest = findViewById(R.id.buttonpinterest);
        btnpinterest.setOnClickListener(this);

        Button btngithub = findViewById(R.id.buttongithub);
        btngithub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonemail:
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"rhezaardiva@gmail.com"});
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Text");
                startActivity(emailIntent);
                break;
            case R.id.buttonwhatsapp:
                String phoneNumber = "081314980431";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.buttontwitter:
                Intent linktwitter = new Intent();
                linktwitter.setAction(Intent.ACTION_VIEW);
                linktwitter.addCategory(Intent.CATEGORY_BROWSABLE);
                linktwitter.setData(Uri.parse("https://twitter.com/rhezaardhiva"));
                startActivity(linktwitter);
                break;
            case R.id.buttontelegram:
                Intent linktelegram = new Intent();
                linktelegram.setAction(Intent.ACTION_VIEW);
                linktelegram.addCategory(Intent.CATEGORY_BROWSABLE);
                linktelegram.setData(Uri.parse("https://t.me/rhezaardiva"));
                startActivity(linktelegram);
                break;
            case R.id.buttonpinterest:
                Intent linkpinterest = new Intent();
                linkpinterest.setAction(Intent.ACTION_VIEW);
                linkpinterest.addCategory(Intent.CATEGORY_BROWSABLE);
                linkpinterest.setData(Uri.parse("https://id.pinterest.com/rhezaardhiva/"));
                startActivity(linkpinterest);
                break;
            case R.id.buttongithub:
                Intent linkgithub = new Intent();
                linkgithub.setAction(Intent.ACTION_VIEW);
                linkgithub.addCategory(Intent.CATEGORY_BROWSABLE);
                linkgithub.setData(Uri.parse("https://github.com/rhezaardiva"));
                startActivity(linkgithub);
                break;
        }
    }
}
