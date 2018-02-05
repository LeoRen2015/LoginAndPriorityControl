package com.waya.LeoDemo.dataStructure;

/**
 * Created by user on 2018/1/31.
 */
public interface LeoMap {

    interface entry<KEY,VALUE>{

        KEY getKey();
        VALUE getValue();
        VALUE setValue();
        int hashCode();
    }
}
