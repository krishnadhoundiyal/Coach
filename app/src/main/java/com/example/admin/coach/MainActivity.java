package com.example.admin.coach;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdvertFragment.OnFragmentInteractionListener {
    @Override
    public void onFragmentInteraction(Uri uri) {
        //do nothing
    }

    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("COACH");

        /*CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("TestMe");*/
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        TabLayout tabLayout = findViewById(R.id.tabs);
        Drawable img1 = ContextCompat.getDrawable(MainActivity.this,R.drawable.iconentrance);
        Drawable img2 = ContextCompat.getDrawable(MainActivity.this,R.drawable.iconadvancedcourses);
        Drawable img3 = ContextCompat.getDrawable(MainActivity.this,R.drawable.iconfacilitycourses);
        Drawable img4 = ContextCompat.getDrawable(MainActivity.this,R.drawable.iconolympiads);
        Drawable img5 = ContextCompat.getDrawable(MainActivity.this,R.drawable.iconbasiccourses);
        img1.setBounds(0, 0, 100, 100);
        img2.setBounds(0, 0, 100, 100);
        img3.setBounds(0, 0, 100, 100);
        img4.setBounds(0, 0, 100, 100);
        img5.setBounds(0, 0, 100, 100);
        TextView textView1 = new TextView(MainActivity.this);
        textView1.setText("Entrances");
        textView1.setTextColor(Color.BLACK);
        textView1.setCompoundDrawables(null, img1, null, null);
        TextView textView2 = new TextView(MainActivity.this);
        textView2.setText("Senior Classes");
        textView2.setTextColor(Color.BLACK);
        textView2.setCompoundDrawables(null, img2, null, null);
        TextView textView3 = new TextView(MainActivity.this);
        textView3.setText("Facility Courses");
        textView3.setTextColor(Color.BLACK);
        textView3.setCompoundDrawables(null, img3, null, null);
        TextView textView4 = new TextView(MainActivity.this);
        textView4.setText("Olympiads & NTSE");
        textView4.setTextColor(Color.BLACK);
        textView4.setCompoundDrawables(null, img4, null, null);
        TextView textView5 = new TextView(MainActivity.this);
        textView5.setText("Elementary Classes");
        textView5.setTextColor(Color.BLACK);
        textView5.setCompoundDrawables(null, img5, null, null);

        tabLayout.addTab(tabLayout.newTab().setCustomView(textView1));
        tabLayout.addTab(tabLayout.newTab().setCustomView(textView2));
        tabLayout.addTab(tabLayout.newTab().setCustomView(textView3));
        tabLayout.addTab(tabLayout.newTab().setCustomView(textView4));
        tabLayout.addTab(tabLayout.newTab().setCustomView(textView5));
        //tabLayout.addTab(tabLayout.newTab().setText("Coaching"));
        //tabLayout.addTab(tabLayout.newTab().setText("Counselling"));
        final ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        PagerAdapter mPagerAdapter = new tabBarAdapter(getSupportFragmentManager());
        vpPager.setAdapter(mPagerAdapter);

        //tab callbacks
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("TestObj",tab.getText().toString());
                vpPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void createCourseCards(ArrayList<CardCourse> courseCards) {
        for (int i=0; i <20;i++) {
            CardCourse objx = new CardCourse(R.drawable.algebra,4,"Physics");
            courseCards.add(objx);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(android.support.v4.view.GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class tabBarAdapter extends FragmentStatePagerAdapter {

        private static int NUM_ITEMS = 1;
        public tabBarAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    //return SubjectList.newInstance();
                    return AdvertFragment.newInstance();
                case 1:
                    //return SubjectList.newInstance();
                    return AdvertFragment.newInstance();
                case 2:
                    //return SubjectList.newInstance();
                    return AdvertFragment.newInstance();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }
    }
}
