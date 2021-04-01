package com.jiuzhang.seckillservice.dao.po;

import java.math.BigDecimal;

public class SeckillActivity {
    private Long id;

    private String name;

    private Long goodId;

    private BigDecimal seckillPrice;

    private Long seckillNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Long getSeckillNumber() {
        return seckillNumber;
    }

    public void setSeckillNumber(Long seckillNumber) {
        this.seckillNumber = seckillNumber;
    }
}