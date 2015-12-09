package com.mycompany.testprimefaces;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by mars on 2015/12/9.
 */
@ManagedBean
@ViewScoped
public class BasicView implements Serializable{

    @Getter
    @Setter
    private String text;

}