package com.kk.qq_ui.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.HorizontalScrollView;

import com.kk.qq_ui.R;

public class MainActivity extends Activity {

    private SlidingMenu mParentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParentView = findViewById(R.id.main_parent);
        mParentView.setSmoothScrollingEnabled(true);


    }
}
