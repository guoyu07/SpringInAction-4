package com.springinaction.pkg.springidol;

import com.springinaction.pkg.springidol.quliafiers.StringedInstrument;
import com.springinaction.pkg.springidol.quliafiers.Strummed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ilya on 14.03.15.
 */
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
