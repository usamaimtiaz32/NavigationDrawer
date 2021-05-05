package com.snovia.navigation_practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_book:
                        Intent intent=new Intent(MainActivity.this,BookActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_return:
                        Intent intent1=new Intent(MainActivity.this,ReturnActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_laptop:
                        Intent intent2=new Intent(MainActivity.this,LaptopActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_voice:
                        Intent intent3=new Intent(MainActivity.this,VoiceActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.nav_chrome_reader:
                        Intent intent4=new Intent(MainActivity.this,ChromeReaderActivity.class);
                        startActivity(intent4);
                        break;
                    case R.id.nav_read_more:
                        Intent intent5=new Intent(MainActivity.this,ReadMoreActivity.class);
                        startActivity(intent5);
                        break;
                    case R.id.nav_add_comment:
                        Intent intent6=new Intent(MainActivity.this,AddCommentActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.nav_insert_comment:
                        Intent intent7=new Intent(MainActivity.this,InsertCommentActivity.class);
                        startActivity(intent7);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}