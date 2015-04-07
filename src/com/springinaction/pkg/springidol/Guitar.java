package com.springinaction.pkg.springidol;

import com.springinaction.pkg.springidol.quliafiers.StringedInstrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ilya on 14.03.15.
 */

@StringedInstrument
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Spliiiiiin");
    }
}
