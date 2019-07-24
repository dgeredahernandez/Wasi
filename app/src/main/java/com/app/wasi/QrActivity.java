package com.app.wasi;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class QrActivity extends AppCompatActivity implements View.OnClickListener, TabLayout.BaseOnTabSelectedListener {

    ImageButton btnHome;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);

        setTitle("Código QR");

        btnHome = findViewById(R.id.imageButtonHomeQr);

        btnHome.setOnClickListener(this);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem tabEscanear = findViewById(R.id.tabEscanear);
        TabItem tabMiCodigo = findViewById(R.id.tabMiCodigo);
        viewPager = findViewById(R.id.viewPager);

        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.imageButtonHomeQr:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
