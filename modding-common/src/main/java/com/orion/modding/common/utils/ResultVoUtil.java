package com.orion.modding.common.utils;

import com.orion.modding.common.vo.IResultStatus;
import com.orion.modding.common.vo.ResultVO;

/**
 * @author z2647w
 * @date 2021-03-26 14:46
 */
public class ResultVoUtil {
    private ResultVoUtil() {
    }

    /**
     * 获取失败的返回结果
     *
     * @param status  状态码
     * @param message 提示信息
     * @return com.gitee.z2647w.vo.ResultVO<T> 统一返回结果
     * @date 2020/10/31 23:35
     */

    /**
     * 获取失败的返回结果
     *
     * @param status  状态码
     * @param message 提示信息
     * @return com.orion.modding.common.vo.ResultVO<T> 全局统一返回结果
     * @author z2647w
     * @date 2021/3/26 15:06
     */
    public static <T> ResultVO<T> fail(Integer status, String message) {
        return new ResultVO<>(status, message, null);
    }


    /**
     * 获取成功返回结果
     *
     * @return com.orion.modding.common.vo.ResultVO<T>
     * @author z2647w
     * @date 2021/3/26 16:00
     */
    public static <T> ResultVO<T> success() {
        return new ResultVO<>(200, null, null);
    }


    /**
     * 获取成功返回结果
     *
     * @param data 响应数据
     * @return com.orion.modding.common.vo.ResultVO<T>
     * @author z2647w
     * @date 2021/3/26 16:00
     */
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(200, null, data);
    }


    /**
     * 获取返回结果
     *
     * @param resultStatus 结果状态枚举
     * @param data         响应数据
     * @return com.orion.modding.common.vo.ResultVO<T>
     * @author z2647w
     * @date 2021/3/26 16:01
     */
    public static <T> ResultVO<T> getResult(IResultStatus resultStatus, T data) {
        return new ResultVO<>(resultStatus.getStatus(), resultStatus.getMessage(), data);
    }

    /**
     * 获取返回结果
     *
     * @param resultStatus 结果状态枚举
     * @return com.orion.modding.common.vo.ResultVO<T>
     * @author z2647w
     * @date 2021/3/26 16:01
     */
    public static <T> ResultVO<T> getResult(IResultStatus resultStatus) {
        return new ResultVO<>(resultStatus.getStatus(), resultStatus.getMessage(), null);
    }
}
