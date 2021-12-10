package com.dmav.dnepr.model;

import com.dmav.dnepr.vo.Vacancy;

import java.util.List;

public interface Strategy {

    List<Vacancy> getVacancies(String searchString);
}
