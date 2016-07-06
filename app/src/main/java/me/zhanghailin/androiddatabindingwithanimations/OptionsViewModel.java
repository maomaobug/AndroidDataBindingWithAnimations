package me.zhanghailin.androiddatabindingwithanimations;

import org.apache.commons.codec.language.bm.Rule;

import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by hailin on 7/5/16.
 */

public class OptionsViewModel implements Contract.ViewModel {
    private OptionsRepository mRepository;
    private Contract.View mView;
    private final List<String> mOptions = new ArrayList<>();

    public OptionsViewModel(OptionsRepository repository, Contract.View view) {
        mRepository = repository;
        mView = view;
    }

    @Override
    public void getOptions() {
        mRepository.fetchOptions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<String>>() {
                    @Override
                    public void call(List<String> strings) {
                        mOptions.clear();
                        mOptions.addAll(strings);
                        mView.refreshOptions();
                    }
                });
    }

    public String get(int i) {
        return mOptions.size() > i ? mOptions.get(i) : null;
    }
}
