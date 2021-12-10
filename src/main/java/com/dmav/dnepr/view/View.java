package com.dmav.dnepr.view;

import com.dmav.dnepr.Controller;
import com.dmav.dnepr.vo.Vacancy;

import java.util.List;

public interface View {
    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}
