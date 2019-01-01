package org.kalian.example.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import org.kalian.example.activity.*;
import org.kalian.example.R;


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
      adapter.addFragment(new Tab1Fragment(), "Tab One");
      adapter.addFragment(new Tab2Fragment(), "Tab Two");
      adapter.addFragment(new Tab3Fragment(), "Tab Three");

      viewPager.setAdapter(adapter);
      tabLayout.setupWithViewPager(viewPager);
  }

}
