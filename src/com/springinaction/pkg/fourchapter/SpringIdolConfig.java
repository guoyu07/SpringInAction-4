package com.springinaction.pkg.fourchapter;

import com.springinaction.pkg.springidol.HummeredDulcimer;
import com.springinaction.pkg.springidol.Instrumentalist;
import com.springinaction.pkg.springidol.Juggler;
import com.springinaction.pkg.springidol.Performer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ilya on 18.03.15.
 */
@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke() {
        return new Juggler(14);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        kenny.setInstrument(new HummeredDulcimer());
        return kenny;
    }
}
