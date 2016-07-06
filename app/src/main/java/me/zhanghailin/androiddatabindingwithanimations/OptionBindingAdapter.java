package me.zhanghailin.androiddatabindingwithanimations;

import android.databinding.BindingAdapter;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hailin on 7/6/16.
 */

public class OptionBindingAdapter {
    private boolean mOptionsShowing;

    @BindingAdapter("android:text")
    public void setOption(TextView button, String text) {
        if (text == null) {
            return;
        }

        if (button.getTranslationY() > 0) {
            button.setText(text);
            button.setVisibility(View.VISIBLE);
            button.animate()
                    .translationY(0)
                    .start();
        } else {
            button.animate()
                    .translationY(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, button.getResources().getDisplayMetrics()))
                    .start();
        }
    }
}
