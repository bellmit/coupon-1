package com.sichuang.coupon.po;

import java.util.Date;

public class NotifyMsg {


    private Integer id;

    private Long batchId;

    private Long userId;

    private String notifyDay;

    private Integer notifyType;

    private Date notifyTime;

    private Integer status;

    private String comment;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNotifyDay() {
        return notifyDay;
    }

    public void setNotifyDay(String notifyDay) {
        this.notifyDay = notifyDay == null ? null : notifyDay.trim();
    }

    public Integer getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Override
    public String toString() {
        return "NotifyMsg{" +
                "id=" + id +
                ", batchId=" + batchId +
                ", userId=" + userId +
                ", notifyDay='" + notifyDay + '\'' +
                ", notifyType=" + notifyType +
                ", notifyTime=" + notifyTime +
                ", status=" + status +
                ", comment='" + comment + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}