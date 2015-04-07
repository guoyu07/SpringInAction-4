package com.springinaction.pkg.springidol;

/**
 * Created by ilya on 14.03.15.
 */
public class Stage {
    private Stage() {
    }

    private static class StageSingletoneHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletoneHolder.instance;
    }
}
