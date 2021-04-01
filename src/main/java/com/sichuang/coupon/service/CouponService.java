package com.sichuang.coupon.service;

import com.sichuang.coupon.requests.FreezeCouponRequest;
import com.sichuang.coupon.tasks.BatchSendCouponTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    private static Logger logger = LoggerFactory.getLogger(CouponService.class);
    @Autowired
    private CouponFreezeService couponFreezeService;
    public void freezeCoupon(FreezeCouponRequest freezeCouponRequest) throws  Exception{
     try{
         /**
          * 1.校验
          */

         /**
          * 2.冻结
          *   插入冻结记录
          *   修改券的状态为冻结
          */
         couponFreezeService.freezeCoupon(freezeCouponRequest);

     }catch (Throwable throwable){
        logger.error(throwable.toString());
     }
    }


}
