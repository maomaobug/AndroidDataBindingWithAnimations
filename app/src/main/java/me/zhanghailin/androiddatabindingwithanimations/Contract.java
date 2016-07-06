package me.zhanghailin.androiddatabindingwithanimations;

import java.util.List;

/**
 * Created by hailin on 7/5/16.
 */

public interface Contract {
    interface ViewModel {
        void getOptions();
    }

    interface View {
        void refreshOptions();
    }
}
