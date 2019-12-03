package com.haazano.lesson1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        TheBigBang theBigBang10 = new TheBigBang("Певый ББ", 10);
        TheBigBang theBigBang20 = new TheBigBang("Второй ББ", 20);

        ArrayList<TheBigBang> bangs = new ArrayList<>();
        bangs.add(theBigBang10);
        bangs.add(theBigBang20);

        for (TheBigBang bang : bangs) {
            System.out.println(bang.getName() + " с массой " + bang.getMass());
        }
    }
}
