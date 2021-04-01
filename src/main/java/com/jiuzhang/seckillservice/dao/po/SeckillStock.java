package com.jiuzhang.seckillservice.dao.po;

public class SeckillStock {
    private Long id;

    private Long commodityId;

    private Long seckillActivityId;

    private Integer stockNumber;

    private Integer lockNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Long getSeckillActivityId() {
        return seckillActivityId;
    }

    public void setSeckillActivityId(Long seckillActivityId) {
        this.seckillActivityId = seckillActivityId;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Integer getLockNumber() {
        return lockNumber;
    }

    public void setLockNumber(Integer lockNumber) {
        this.lockNumber = lockNumber;
    }
}