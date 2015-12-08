package com.clarity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class FontSettings implements Serializable {
   private static int INCREMENT = 1;
   private int size = 1;
   
   public int getSize() { return size; }
   public void setSize(int newValue) { size = newValue; }
   public void increment() { size += INCREMENT; }
   public void decrement() { size -= INCREMENT; }
}