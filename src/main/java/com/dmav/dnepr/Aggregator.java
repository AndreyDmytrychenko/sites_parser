package com.dmav.dnepr;

import com.dmav.dnepr.model.HHStrategy;
import com.dmav.dnepr.model.HabrCarrerStrategy;
import com.dmav.dnepr.model.Model;
import com.dmav.dnepr.model.Provider;
import com.dmav.dnepr.view.HtmlView;


public class Aggregator {

    public static void main(String[] args) {

        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new HabrCarrerStrategy()));
        Controller controller = new Controller(model);

        view.setController(controller);

        view.userCitySelectEmulationMethod();

    }
}
