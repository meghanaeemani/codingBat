package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Warmup1 w = new Warmup1();
        boolean result = w.sleepIn(true,false);
        System.out.println(result);
        boolean result2 =w.monkeyTrouble(true, true);
        System.out.println(result2);
        System.out.println(w.sumDouble(3,3));
        System.out.println(w.diff21(25));
        System.out.println(w.parrotTrouble(true, 6));

    }

}