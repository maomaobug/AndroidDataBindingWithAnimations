package me.zhanghailin.androiddatabindingwithanimations;

import android.animation.Animator;
import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

/**
 * Created by hailin on 7/6/16.
 */

public class Optionbinding {
    @BindingAdapter("option")
    public static void setOption(final Button button, String optionText) {
        if (optionText == null) {
            return;
        }

        if (button.getTranslationY() <= 0) {
            button.animate()
                    .translationY(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, button.getResources().getDisplayMetrics()))
                    .setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animator) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {

                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animator) {

                        }
                    })
                    .start();
            return;
        } else {
            button.setText(optionText);
            button.setVisibility(View.VISIBLE);
            button.animate()
                    .translationY(0)
                    .start();
        }

    }
}
