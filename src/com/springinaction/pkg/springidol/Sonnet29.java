package com.springinaction.pkg.springidol;

/**
 * Created by ilya on 14.03.15.
 */
public class Sonnet29 implements Poem {
    private static String[] LINES = {
            "Пушкин",
            "Всё же",
            "Лучше"
    };

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for(String line : LINES) {
            System.out.println(line);
        }
    }
}
