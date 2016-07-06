package me.zhanghailin.androiddatabindingwithanimations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by hailin on 7/5/16.
 */

public class OptionsRepository {
    private static final ArrayList<String> mockedOptions = new ArrayList<>();
    static {
        mockedOptions.add("a1");
        mockedOptions.add("a2");
        mockedOptions.add("a3");
        mockedOptions.add("a4");
        mockedOptions.add("b1");
        mockedOptions.add("b2");
        mockedOptions.add("b3");
        mockedOptions.add("b4");
    }

    public Observable<List<String>> fetchOptions() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Collections.shuffle(mockedOptions);
                subscriber.onStart();
                subscriber.onNext(mockedOptions.subList(0, 4));
                subscriber.onCompleted();
            }
        });
    }
}
