package test;

import domian.Control;
import domian.Television;

public class ClassPrincipal {
    public static void main(String[] args) {

        Television television = new Television("Sansung Q100", 50, false);
        Control control = new Control();


        System.out.println(television.toString());
    }
}