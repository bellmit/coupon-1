package com.coupon;

import com.coupon.db.po.Coupon;
import com.coupon.requests.CreateCouponRequest;
import com.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CouponTest {
    @Autowired
    private  CouponService couponService;

    @Test
    public void insertCoupon(){
        CreateCouponRequest req = new CreateCouponRequest();
        req.setCouponName("满100减50");
        req.setUserId(123L);
        couponService.createCoupon(req);
    }

    @Test
    public void queryCoupon(){
        Coupon coupon = couponService.queryCoupon(1L);
        System.out.println(coupon.toString());
    }


}
