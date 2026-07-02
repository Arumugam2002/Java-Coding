package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "Pandaram";

        String name2 = "Arumugam";

        String name1  =  new String("Arumugam");

        String s1 = "Rahul";

        String s2 = "Rahul";

        name = name + "Arumugam";

        System.out.println(s1 == s2);

        System.out.println(name);

        System.out.println(name1.equals(name2));

        System.out.println(name == name2);
        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.concat(name));


        System.out.println(name2.charAt(3));


    }
}