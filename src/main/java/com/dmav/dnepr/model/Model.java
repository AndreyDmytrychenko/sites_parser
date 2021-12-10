package com.dmav.dnepr.model;

import com.dmav.dnepr.view.View;
import com.dmav.dnepr.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private View view;
    private Provider[] providers;

    public Model(View view, Provider... providers) {
        if (providers == null || view == null || providers.length == 0) throw new  IllegalArgumentException();
        this.view = view;
        this.providers = providers;
    }

    public void selectCity(String city) {
        List<Vacancy> list = new ArrayList<>();
        for (Provider provider : providers) {
            list.addAll(provider.getJavaVacancies(city));
        }
        view.update(list);
    }
}
