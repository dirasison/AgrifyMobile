package com.example.agrify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.agrify.R;
import com.example.agrify.profile_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomnav;
    FrameLayout frameFrag;
    ImageButton imageButton; // Add ImageButton
    RelativeLayout homeContainer;
    SharedPreferences spForPermission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spForPermission = getSharedPreferences("userPermission", Context.MODE_PRIVATE);

        bottomnav = findViewById(R.id.bottomNavigation);
        frameFrag = findViewById(R.id.containerFrag);
        imageButton = findViewById(R.id.imagebutton); // Initialize ImageButton
        homeContainer = findViewById(R.id.homeCont);

        bottomnav.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.homeFrag) {
                homeContainer.setVisibility(View.VISIBLE);
                frameFrag.setVisibility(View.INVISIBLE);
                return true;
            } else if (item.getItemId() == R.id.profileFrag) {
                homeContainer.setVisibility(View.INVISIBLE);
                frameFrag.setVisibility(View.VISIBLE);
                getSupportFragmentManager().beginTransaction().replace(R.id.containerFrag, new profile_fragment()).commit();
                return true;
            }
            return false;
        });

        // Set OnClickListener for the ImageButton
        imageButton.setOnClickListener(v -> {
            // Handle button click action here
            // For example, navigate to another activity
            startActivity(new Intent(MainActivity2.this, AddToCart.class));
        });

    }
}
