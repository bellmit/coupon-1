package com.sichuang.coupon.redis;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Arrays;

public class Storekey {

    private String category;

    private Object[] params;


    public Storekey(String category, Object[] params) {
        this.category = category;
        this.params = params;
    }

    public String getCategory() {
        return category;
    }


    public Object[] getParams() {
        return params;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append(category).append(params).toString();
    }
}
