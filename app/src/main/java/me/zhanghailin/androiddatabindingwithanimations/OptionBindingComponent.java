package me.zhanghailin.androiddatabindingwithanimations;

import android.databinding.DataBindingComponent;

/**
 * Created by hailin on 7/6/16.
 */

public class OptionBindingComponent implements DataBindingComponent {
    private OptionBindingAdapter mOptionBindingAdapter = new OptionBindingAdapter();

    public OptionBindingAdapter getOptionBindingAdapter() {
        return mOptionBindingAdapter;
    }
}
