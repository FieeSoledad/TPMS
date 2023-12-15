package com.huadi.project.tpms.exception;


import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.utils.result.code.Code;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice("com.huadi.project.tpms")
public class ExceptionAll {
    /**
     * 出现异常返回错误提示, 并且回滚事务
     * @param e
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public DataResult exceptionHandler(Exception e){
        System.out.println("抓到异常");
        //手动事务回滚
        e.printStackTrace();
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        return DataResult.errByErrCode(Code.ERROR);
    }

}
