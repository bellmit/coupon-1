package com.coupon.enums;

public enum FreezeStatus {
    FROZEN(1,"已冻结"),
    UNFROZEN(2,"已解冻");
    private int freezeStatus;
    private String freezeStatusDesc;

    FreezeStatus(int freezeStatus, String freezeStatusDesc) {
        this.freezeStatus = freezeStatus;
        this.freezeStatusDesc = freezeStatusDesc;
    }

    public int getValue(){
        return freezeStatus;
    }

}
