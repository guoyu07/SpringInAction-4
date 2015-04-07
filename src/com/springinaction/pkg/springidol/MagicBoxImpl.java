package com.springinaction.pkg.springidol;

/**
 * Created by ilya on 15.03.15.
 */
public class MagicBoxImpl implements MagicBox {
    public MagicBoxImpl() {
    }

    @Override
    public String getContents() {
        return "A beautiful assistant";
    }
}
