package com.springinaction.pkg.springidol;

import java.util.Collection;
import java.util.Map;

/**
 * Created by ilya on 14.03.15.
 */
public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for(String key : instruments.keySet()){
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
