package com.appxperts.viewanimatorstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {


    Button buttonPrev, buttonNext;
    ViewAnimator viewAnimator;


    // similar to ViewAnimator we have ViewSwitcher(view from factory method) and ViewFlipper(periodic view)
    // more at http://stackoverflow.com/questions/3542312/whats-the-difference-between-viewflipper-and-viewswitcher


    Animation slide_in_left, slide_out_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPrev = (Button) findViewById(R.id.prev);
        buttonNext = (Button) findViewById(R.id.next);
        viewAnimator = (ViewAnimator) findViewById(R.id.viewanimator);

        slide_in_left = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
        slide_out_right = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_out_right);


        viewAnimator.setInAnimation(slide_in_left);
        viewAnimator.setOutAnimation(slide_out_right);
    }

    public void clickPrevious(View v) {
        viewAnimator.showPrevious();
    }


    public void clickNext(View v) {
        viewAnimator.showNext();
    }

}
