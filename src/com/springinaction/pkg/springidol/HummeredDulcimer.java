package com.springinaction.pkg.springidol;

import com.springinaction.pkg.springidol.quliafiers.StringedInstrument;
import com.springinaction.pkg.springidol.quliafiers.Strummed;
import org.springframework.stereotype.Component;

/**
 * Created by ilya on 17.03.15.
 */

@StringedInstrument
@Strummed
public class HummeredDulcimer implements Instrument {
    @Override
    public void play() {
        System.out.println("uf-uf-uf");
    }
}
