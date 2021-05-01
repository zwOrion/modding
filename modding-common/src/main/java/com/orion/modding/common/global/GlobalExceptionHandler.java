package com.orion.modding.common.global;

import com.orion.modding.common.exception.ServiceException;
import com.orion.modding.common.utils.ResultVoUtil;
import com.orion.modding.common.vo.ResultStatus;
import com.orion.modding.common.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理
 *
 * @author zwOrion
 * @version 1.0.0
 * @date 2020/10/29 19:04
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResultVO<Object> runtimeException(Exception e) {
        e.printStackTrace();
        return ResultVoUtil.getResult(ResultStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(ServiceException.class)
    public ResultVO<Object> serviceException(ServiceException e) {
        e.printStackTrace();
        return ResultVoUtil.getResult(e.getResultStatus());
    }
}
