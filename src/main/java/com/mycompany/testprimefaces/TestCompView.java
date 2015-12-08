package com.mycompany.testprimefaces;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 * Created by Mars on 2015/12/8.
 */
@Slf4j
@ManagedBean
@ViewScoped
public class TestCompView {

    @Getter
    private String test;

    public void setTest(String test) {
        this.test = test;
        log.info("test = " + test);
    }

    public void settingText(){
        setTest("12341234");
    }
}
