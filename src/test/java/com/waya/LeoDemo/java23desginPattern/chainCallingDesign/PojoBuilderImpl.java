package com.waya.LeoDemo.java23desginPattern.chainCallingDesign;

import java.util.Map;

public class PojoBuilderImpl implements PojoBuilder {

    private Apojo apojo;
    public PojoBuilderImpl(Apojo apojo){
        this.apojo = apojo;
    }

    public Apojo create() {
        return apojo;
    }
    public PojoBuilder setA_int(final  int A_int) {
        apojo.setA_int(A_int);
        return this;
    }
    public PojoBuilder setB_string(final String b_string) {
        apojo.setB_string(b_string);
        return this;
    }
    public PojoBuilder setC_long(final Long c_long) {
        apojo.setC_long(c_long);
        return this;
    }
    public PojoBuilder setMap(final Map map) {
        apojo.setMap(map);
        return this;
    }
}
