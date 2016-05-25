package com.affa.pengaduan_app.pengaduanapp;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Fernalia on 5/24/2016.
 */
public class ListPengaduanActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pengaduan);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.hide();
    }
}
