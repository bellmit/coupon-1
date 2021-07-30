package com.coupon.service;

import com.coupon.db.dao.CouponDao;
import com.coupon.db.po.Coupon;
import com.coupon.requests.CreateCouponRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CouponService {
    private static Logger logger = LoggerFactory.getLogger(CouponService.class);

    @Autowired
    private CouponDao couponDao;

    /**
     * 创建优惠券
     *
     * @param req
     */
    public void createCoupon(CreateCouponRequest req) {
        Coupon coupon = new Coupon();
        coupon.setCouponId(req.getCouponId());
        coupon.setCouponName(req.getCouponName());
        coupon.setUserId(req.getUserId());
        coupon.setStatus(1);
        coupon.setReceivedTime(new Date());
        couponDao.insert(coupon);
    }

    /**
     * 查询优惠券
     *
     * @param couponId
     * @return
     */
    public Coupon queryCoupon(long couponId) {
        Coupon coupon = couponDao.queryById(couponId);
        return coupon;
    }

}
