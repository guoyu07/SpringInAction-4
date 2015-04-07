package com.springinaction.pkg.springidol;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by ilya on 15.03.15.
 */
public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "A ferocious tiger";
    }
}
