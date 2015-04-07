package com.springinaction.pkg.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by ilya on 14.03.15.
 */

public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
