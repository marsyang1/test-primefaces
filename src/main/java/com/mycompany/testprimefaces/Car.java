package com.mycompany.testprimefaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mars on 2015/9/27.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String id;
    private String brand;
    private int year;
    private String color;
    private int price;
    private boolean sold;

}
