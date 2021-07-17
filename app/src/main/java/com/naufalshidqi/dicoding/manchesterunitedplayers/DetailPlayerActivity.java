package com.naufalshidqi.dicoding.manchesterunitedplayers;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPlayerActivity extends AppCompatActivity {

    private TextView tvDataName, tvDataNumber, tvDataPosition, tvDataNationality, tvDataAge, tvDataBirth, tvDataHeight, tvDataRemarks;
    private ImageView imgProfile;
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_NUMBER = "extra_number";
    public static String EXTRA_POSITION = "extra_position";
    public static String EXTRA_NATIONALITY = "extra_nationality";
    public static String EXTRA_AGE = "extra_age";
    public static String EXTRA_BIRTH = "extra_birth";
    public static String EXTRA_HEIGHT = "extra_height";
    public static String EXTRA_REMARKS = "extra_remarks";
    public static String EXTRA_PHOTO = "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        // Back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvDataName = (TextView)findViewById(R.id.tv_data_name);
        tvDataNumber = (TextView)findViewById(R.id.tv_data_number);
        tvDataPosition = (TextView)findViewById(R.id.tv_data_position);
        tvDataNationality = (TextView)findViewById(R.id.tv_data_nationality);
        tvDataAge = (TextView)findViewById(R.id.tv_data_age);
        tvDataBirth = (TextView)findViewById(R.id.tv_data_birth);
        tvDataHeight = (TextView)findViewById(R.id.tv_data_height);
        tvDataRemarks = (TextView)findViewById(R.id.tv_data_remarks);
        imgProfile = (ImageView)findViewById(R.id.img_profile);

        // Get Data from Intent
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String number = getIntent().getStringExtra(EXTRA_NUMBER);
        String position = getIntent().getStringExtra(EXTRA_POSITION);
        String nationality = getIntent().getStringExtra(EXTRA_NATIONALITY);
        String age = getIntent().getStringExtra(EXTRA_AGE);
        String birth = getIntent().getStringExtra(EXTRA_BIRTH);
        String height = getIntent().getStringExtra(EXTRA_HEIGHT);
        String remarks = getIntent().getStringExtra(EXTRA_REMARKS);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        // show in layout
        tvDataName.setText(name);
        tvDataNumber.setText(number);
        tvDataPosition.setText(position);
        tvDataNationality.setText(nationality);
        tvDataAge.setText(age);
        tvDataBirth.setText(birth);
        tvDataHeight.setText(height);
        tvDataRemarks.setText(remarks);
        Glide.with(this)
                .load(photo)
                .override(350, 550)
                .into(imgProfile);

        setActionBarTitle(name+"'s Profile Detail");
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
