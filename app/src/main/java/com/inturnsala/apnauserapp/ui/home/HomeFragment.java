package com.inturnsala.apnauserapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.inturnsala.apnauserapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
  View view =  inflater.inflate(R.layout.fragment_home, container, false);

 sliderLayout = view.findViewById(R.id.slider);
 sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
 sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
 sliderLayout.setScrollTimeInSec(1);


 setSliderViews();

  return  view;



    }

    private void setSliderViews()
    {
        for(int i=0;i<5;i++)
        {
            DefaultSliderView sliderView = new DefaultSliderView(getContext());
            switch (i)
            {
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collegeapp-b1e03.appspot.com/o/gallery%2F%5BB%40d687f55jpg?alt=media&token=4a65ed35-2375-4e83-89d1-1062fa850612");
                    break;

                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collegeapp-b1e03.appspot.com/o/gallery%2F%5BB%40dfbe8f5jpg?alt=media&token=6ef40270-6255-4cd8-956b-05293e49e26b");
                    break;

                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collegeapp-b1e03.appspot.com/o/gallery%2F%5BB%40ff2cd73jpg?alt=media&token=aca3a8af-b3f5-4b9a-b6ef-a7b87ab32537");
                    break;

                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collegeapp-b1e03.appspot.com/o/gallery%2F%5BB%405a94123jpg?alt=media&token=69ae5af2-0a10-4764-86cb-45a3aaa0be9f");
                    break;

                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collegeapp-b1e03.appspot.com/o/gallery%2F%5BB%40faccb0djpg?alt=media&token=1343f066-c166-40c0-96f6-7ca8d58338b9");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}