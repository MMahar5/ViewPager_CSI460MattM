package com.example.viewpager_csi460_mattm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    //Declares context obj and the arrays for our team images and names
    Context context;
    int[] nflTeamImages;
    String[] nflTeamNames;

    //Constructor
    public ViewPagerAdapter(Context context, int[] nflTeamImages, String[] nflTeamNames) {
        this.context = context;
        this.nflTeamImages = nflTeamImages;
        this.nflTeamNames = nflTeamNames;
    }

    //Get image count
    public int getCount(){
        return nflTeamImages.length;
    }

    //Check if page view is associated with the object from instantiateItem
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    //Sets up the view item with the nfl logo image and team name text label
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View v = LayoutInflater.from(context).inflate(R.layout.nfl_team, container, false);
        ImageView imageView = v.findViewById(R.id.teamLogoImg);
        TextView textView = v.findViewById(R.id.nflTeamName);

        imageView.setImageResource(nflTeamImages[position]);
        textView.setText(nflTeamNames[position]);

        container.addView(v);
        return v;
    }

    //Gets rid of view item if it is not visible to the user
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}
