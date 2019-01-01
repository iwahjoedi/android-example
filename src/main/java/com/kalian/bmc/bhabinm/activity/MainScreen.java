package com.kalian.bmc.bhabinm.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.kalian.bmc.bhabinm.activity.*;
import com.kalian.bmc.bhabinm.R;


public class MainScreen extends AppCompatActivity {

  private TabAdapter adapter;
  private TabLayout tabLayout;
  private ViewPager viewPager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(myToolbar);

      /* tabs */
      viewPager = (ViewPager) findViewById(R.id.viewPager);
      tabLayout = (TabLayout) findViewById(R.id.tabLayout);
      adapter = new TabAdapter(getSupportFragmentManager());
      adapter.addFragment(new Tab1Fragment(), "Notifikasi");
      adapter.addFragment(new Tab2Fragment(), "Komunikasi");
      adapter.addFragment(new Tab3Fragment(), "Capaian Pribadi");

      viewPager.setAdapter(adapter);
      tabLayout.setupWithViewPager(viewPager);
  }

}
