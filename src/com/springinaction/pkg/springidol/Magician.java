package com.springinaction.pkg.springidol;

/**
 * Created by ilya on 15.03.15.
 */
public class Magician implements Performer {
    public Magician() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents());
    }
    //внедрение
    private MagicBox magicBox;
    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    private String magicWords;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
