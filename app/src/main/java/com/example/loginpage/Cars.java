package com.example.loginpage;

import android.view.Display;

public class Cars {
    int number;
    String name;
    void Cars(int number,String name){
        this.number=number;
        this.name=name;
    }
    void  Display(){
        System.out.println(number+""+name);
    }
}
