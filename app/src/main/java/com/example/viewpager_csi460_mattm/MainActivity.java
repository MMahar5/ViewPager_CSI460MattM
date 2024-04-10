package com.example.viewpager_csi460_mattm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    // Declare viewpager variable
    private ViewPager viewPager;

    //Create and populate the arrays for the nfl team logos and names
    private int[] teamLogos = new int[]{R.drawable._cards, R.drawable._falcons, R.drawable._ravens, R.drawable._bills, R.drawable._panthers, R.drawable._bears, R.drawable._bengals, R.drawable._browns, R.drawable._dallas,
            R.drawable._broncos, R.drawable._lions, R.drawable._gb, R.drawable._texans, R.drawable._colts, R.drawable._jags, R.drawable._kc, R.drawable._raiders, R.drawable._chargers, R.drawable._rams, R.drawable._dolphins,
            R.drawable._vikings, R.drawable._pats, R.drawable._saints, R.drawable._giants, R.drawable._jets, R.drawable._eagles, R.drawable._steelers, R.drawable._sf, R.drawable._seahawks, R.drawable._bucs, R.drawable._titans, R.drawable._commanders};
    private String[] teamNames = new String[]{"Arizona Cardinals", "Atlanta Falcons", "Baltimore Ravens", "Buffalo Bills", "Carolina Panthers", "Chicago Bears", "Cincinnati Bengals", "Cleveland Browns", "Dallas Cowboys", "Denver Broncos",
            "Detroit Lions","Green Bay Packers", "Houston Texans", "Indianapolis Colts", "Jacksonville Jaguars", "Kansas City Chiefs", "Las Vegas Raiders", "Los Angeles Chargers", "Los Angeles Rams", "Miami Dolphins", "Minnesota Vikings",
            "New England Patriots", "New Orleans Saints", "New York Giants", "New York Jets", "Philadelphia Eagles", "Pittsburgh Steelers", "San Francisco 49ers", "Seattle Seahawks", "Tampa Bay Buccaneers", "Tennessee Titans", "Washington Commanders"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPagerId);

        ViewPagerAdapter adapter = new ViewPagerAdapter(MainActivity.this, teamLogos, teamNames);

        viewPager.setAdapter(adapter);
    }
}