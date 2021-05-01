package com.orion.modding.common.exception;


import com.orion.modding.common.vo.IResultStatus;

/**
 * @author z2647w
 * @date 2021-03-26 14:58
 */
public class ServiceException extends RuntimeException{
    /**
     * 状态信息
     */
    private IResultStatus resultStatus;



    public ServiceException(IResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ServiceException(String message, IResultStatus resultStatus) {
        super(message);
        this.resultStatus = resultStatus;
    }

    public ServiceException(String message, Throwable cause, IResultStatus resultStatus) {
        super(message, cause);
        this.resultStatus = resultStatus;
    }

    public ServiceException(Throwable cause, IResultStatus resultStatus) {
        super(cause);
        this.resultStatus = resultStatus;
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, IResultStatus resultStatus) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.resultStatus = resultStatus;
    }

    public IResultStatus getResultStatus() {
        return resultStatus;
    }
}
