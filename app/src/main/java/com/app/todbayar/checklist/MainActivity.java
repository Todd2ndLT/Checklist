package com.app.todbayar.checklist;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //============================
    //          OTHER
    //============================
    private Toolbar toolbar;
    private DrawerLayout layoutDrawer;
    private NavigationView lSideMenu;
    private Menu sideMenu;
    //============================
    //          FRAGMENT
    //============================
    private ViewPager vPager;
    private FragHierarchy fragHier;
    private FragAdd fragAdd;
    private FragDetail fragDetail;
    private FragReport fragReport;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TOOLBAR
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_drawer_menu);
        //SETTING MENUS
        layoutDrawer = (DrawerLayout) findViewById(R.id.view_main_layout);
        lSideMenu = findViewById(R.id.view_main_menu);
        lSideMenu.setNavigationItemSelectedListener(this);
        sideMenu = (Menu) lSideMenu.getMenu();
        //SETTING MAIN LAYOUT
        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager(),this);
        //---------------------------------------------
        /*fragHier = new FragHierarchy();
        fragAdapter.addFragment(fragHier, "Hierarchy");
        fragAdd = new FragAdd();
        fragAdapter.addFragment(fragAdd, "Add");*/
        fragDetail = new FragDetail();
        fragAdapter.addFragment(fragDetail, "Detail");
        /*fragReport = new FragReport();
        fragAdapter.addFragment(fragReport, "Report");*/
        //---------------------------------------------
        vPager = (ViewPager) findViewById(R.id.view_main_content);
        vPager.setAdapter(fragAdapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                layoutDrawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.drawer_menu_checklist_add:
                Log.d("Debug", "menu checklist add");
                break;
            case R.id.drawer_menu_checklist_check:
                Log.d("Debug", "menu checklist check");
                break;
            case R.id.drawer_menu_checklist_report:
                Log.d("Debug", "menu checklist report");
                break;
            case R.id.drawer_menu_checklist_add_location:
                //showLayoutInMainActivity(R.layout.activity_location);
                break;
            case R.id.drawer_menu_checklist_add_level:
                //showLayoutInMainActivity(R.layout.activity_level);
                break;
            case R.id.drawer_menu_checklist_add_category:
                //showLayoutInMainActivity(R.layout.activity_category);
                break;
            case R.id.drawer_menu_checklist_add_list:
                //showLayoutInMainActivity(R.layout.fragment_hierarchy_list);
                break;
            case R.id.drawer_menu_logout:
                Log.d("Debug", "menu logout");
                break;
        }
        return false;
    }

    public void showLayoutInMainActivity(int resource){
        //layoutMainContent.removeAllViews();
        //LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View viewAction = inflater.inflate(R.layout.fragment_hierarchy, null);
        //View viewList = inflater.inflate(R.layout.activity_category, null);
        //layoutMainContent.addView(viewAction);
        //layoutMainContent.addView(viewList);

    }
}
