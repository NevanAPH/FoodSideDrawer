package com.nevanpplg2.favfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.nevanpplg2.favfood.fragments.MakananFavorit;
import com.nevanpplg2.favfood.fragments.MakananKhas;
import com.nevanpplg2.favfood.fragments.MinumanKhas;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        transferPage(1);

        NavigationView navigationView = findViewById(R.id.nav_sidemenu);
        navigationView.setNavigationItemSelectedListener(
                item -> {
                    int itemId = item.getItemId();
                    transferPage(
                            itemId == R.id.makanan_khas ? 1
                                    : itemId == R.id.minuman_khas ? 2 : 3
                            );

                    drawerLayout.closeDrawers();
                    return true;
                });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    private void transferPage(int page) {
        switch (page) {
            case 1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new MakananKhas())
                        .commit();

                Objects.requireNonNull(getSupportActionBar()).setTitle("Makanan Khas");
                break;
            case 2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new MinumanKhas())
                        .commit();

                Objects.requireNonNull(getSupportActionBar()).setTitle("Minuman Khas");
                break;
            case 3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new MakananFavorit())
                        .commit();

                Objects.requireNonNull(getSupportActionBar()).setTitle("Makanan Favorit");
                break;
        }
    }
}