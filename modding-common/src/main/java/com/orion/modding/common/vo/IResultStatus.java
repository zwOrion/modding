package com.orion.modding.common.vo;

/**
 * 状态码枚举扩展接口
 *
 * @author z2647w
 * @date 2021-03-26 13:25
 */
public interface IResultStatus {
    /**
     * 获取Status状态码
     *
     * @return java.lang.Integer
     * @author z2647w
     * @date 2021/3/26 13:34
     */
    Integer getStatus();

    /**
     * 获取Message信息
     *
     * @return java.lang.String
     * @author z2647w
     * @date 2021/3/26 13:35
     */
    String getMessage();
}
