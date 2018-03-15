package com.aa;

import com.bb.Person;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger("helloworld");

    public static void main(String[] args) {
        System.out.println("helloworld777");
        Person p = new Person();
        System.out.println(p.toString());
    }
}
