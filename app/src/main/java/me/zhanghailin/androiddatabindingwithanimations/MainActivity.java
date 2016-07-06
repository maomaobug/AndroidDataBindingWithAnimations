package me.zhanghailin.androiddatabindingwithanimations;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.zhanghailin.androiddatabindingwithanimations.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements Contract.View {
    ActivityMainBinding mBinding;
    OptionsViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = new OptionsViewModel(new OptionsRepository(), this);
        mBinding.setVariable(me.zhanghailin.androiddatabindingwithanimations.BR.options, mViewModel);
    }

    @Override
    public void refreshOptions() {
        mBinding.executePendingBindings();
    }
}
