package com.sichuang.coupon.coupon;

import com.sichuang.coupon.mappers.CouponTaskMapper;
import com.sichuang.coupon.mappers.NotifyMsgMapper;
import com.sichuang.coupon.po.CouponTask;
import com.sichuang.coupon.po.CouponTaskFactory;
import com.sichuang.coupon.po.NotifyMsg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CouponPOApplicationTests {

    @Autowired
    private NotifyMsgMapper notifyMsgMapper;

    @Autowired
    private CouponTaskMapper couponTaskMapper;

    @Test
    void contextLoads() {
        NotifyMsg notifyMsg = notifyMsgMapper.selectByPrimaryKey(1);
        System.out.println(notifyMsg.toString());
    }

    @Test
    void insertTask() {
//        for (int i = 0; i < 10000; i++) {
//            CouponTask couponTask = CouponTaskFactory.createCouponTask();
//            System.out.println(couponTask);
//            couponTaskMapper.insert(couponTask);
//        }
        List<CouponTask>  lists=  couponTaskMapper.queryCouponsBySharding(5,3,19);
        System.out.println("size:"+lists.size());
        for(CouponTask couponTask :lists){
            System.out.println(couponTask.toString());
        }
    }


}
