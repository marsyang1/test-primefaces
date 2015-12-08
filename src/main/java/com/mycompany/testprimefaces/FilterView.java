package com.mycompany.testprimefaces;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/**
 * Created by Mars on 2015/9/27.
 */
@ManagedBean(name = "dtFilterView")
@ViewScoped
public class FilterView implements Serializable {

    @Getter
    private List<Car> cars;

    @Getter
    @Setter
    private List<Car> filteredCars;

    @Setter
    @ManagedProperty("#{carService}")
    transient private CarService service;

    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }

    public boolean filterByPrice(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        if (filterText == null || filterText.equals("")) {
            return true;
        }

        if (value == null) {
            return false;
        }

        return ((Comparable) value).compareTo(Integer.valueOf(filterText)) > 0;
    }

    public List<String> getBrands() {
        return service.getBrands();
    }

    public List<String> getColors() {
        return service.getColors();
    }

}