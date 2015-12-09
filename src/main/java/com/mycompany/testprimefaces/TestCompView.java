package com.mycompany.testprimefaces;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

/**
 * Created by Mars on 2015/12/8.
 */
@Slf4j
@ManagedBean
@ViewScoped
public class TestCompView implements Serializable {

    @Setter
    @Getter
    private String test;

    public void settingText() {
        setTest("12341234");
    }

    public void checkingText() {
        JsfUtil.addSuccessMessage("Test = " + test);
        log.info("test =" + test);
    }

    public void randomText() {
        checkingText();
    }
}
