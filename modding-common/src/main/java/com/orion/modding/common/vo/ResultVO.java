package com.orion.modding.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * 全局统一返回对象
 *
 * @author : z2647w
 * @date : 2021/3/26 12:48
 */
@Data
@ToString
@Accessors(chain = true)
@AllArgsConstructor
@EqualsAndHashCode
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 8232094224659371869L;
    /**
     * 状态码
     */
    private Integer status;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;
}
