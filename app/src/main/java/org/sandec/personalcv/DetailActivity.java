package org.sandec.personalcv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static String EXTRA_NAME = "NAME";
    public String EXTRA_FROM = "FROM";
    public String EXTRA_PHOTO = "PHOTO";

    private int total = 0;
    String name;

    ImageView img_item_Photo;
    TextView tv_item_Name, tv_item_From;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img_item_Photo = findViewById(R.id.img_item_photo);
        tv_item_Name = findViewById(R.id.tv_item_name);
        tv_item_From = findViewById(R.id.tv_item_from);

        name = getIntent().getStringExtra(EXTRA_NAME);
        Glide.with(this).load(getIntent().getStringExtra(EXTRA_PHOTO)).into(img_item_Photo);
        String from = getIntent().getStringExtra(EXTRA_FROM);

        tv_item_Name.setText(name);
        tv_item_From.setText(from);
    }

}
