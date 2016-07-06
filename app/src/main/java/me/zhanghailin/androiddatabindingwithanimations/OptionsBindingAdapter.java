package me.zhanghailin.androiddatabindingwithanimations;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingComponent;
import android.view.View;
import android.widget.Button;

/**
 * Created by hailin on 7/5/16.
 */

public class OptionsBindingAdapter {
    @BindingAdapter("android:text")
    void setText(Button button, String optionText) {
        button.setText(optionText);
        button.setVisibility(View.VISIBLE);
    }
}
