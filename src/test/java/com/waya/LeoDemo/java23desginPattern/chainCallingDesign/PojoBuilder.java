package com.waya.LeoDemo.java23desginPattern.chainCallingDesign;

import java.util.Map;

public interface PojoBuilder {
    Apojo create();

    PojoBuilder setA_int(final int A_int);
    PojoBuilder setB_string(final String b_string);
    PojoBuilder setC_long(final Long c_long);
    PojoBuilder  setMap(final Map map);


}
