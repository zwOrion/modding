package com.orion.modding.common.vo;

import com.orion.modding.common.vo.IResultStatus;

/**
 * 基本状态码枚举类
 *
 * @author z2647w
 * @date 2021-03-26 12:50
 */
public enum ResultStatus implements IResultStatus {

    /**
     * 请求成功
     */
    SUCCESS(200, "OK"),
    /**
     * 请求资源不存在或者资源已经移动
     */
    NOT_FOUND(404, "资源不存在"),
    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR(500, "服务器异常");


    /**
     * 状态码
     */
    private final Integer status;
    /**
     * 提示信息
     */
    private final String message;

    ResultStatus(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
