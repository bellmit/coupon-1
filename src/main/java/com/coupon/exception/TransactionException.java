package com.coupon.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 事务执行异常
 */
public class TransactionException  extends RuntimeException{
    private static Logger logger = LoggerFactory.getLogger(TransactionException.class);
    private Integer code;

    private String message;

    public TransactionException(String message) {
        super(message);
    }

    public static void rollbackCause(String message, int rows){
       if(rows <=0){
           logger.error("rollbackCause,{}",message);
          throw new TransactionException(message);
       }
   }
}
