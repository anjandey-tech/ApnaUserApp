package com.inturnsala.apnauserapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.inturnsala.apnauserapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment
{

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;


       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);
           list = new ArrayList<>();
           list.add(new BranchModel(R.drawable.ic_computer,"computer science", "baje department"));

           list.add(new BranchModel(R.drawable.ic_mech,"Mechanical engineering", "chater matha"));

              adapter = new BranchAdapter(getContext(),list);
              viewPager = view.findViewById(R.id.viewPager);
              viewPager.setAdapter(adapter);
           ImageView imageView = view.findViewById(R.id.collegeImage);
           Glide.with(getContext())
                   .load("https://firebasestorage.googleapis.com/v0/b/my-collegeapp-b1e03.appspot.com/o/gallery%2F%5BB%40d687f55jpg?alt=media&token=4a65ed35-2375-4e83-89d1-1062fa850612")
                   .into(imageView);
           return  view;



    }
}