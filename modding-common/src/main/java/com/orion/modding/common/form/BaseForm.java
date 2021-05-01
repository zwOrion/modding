package com.orion.modding.common.form;

/**
 * 表单数据接口
 *
 * @author z2647w
 * @date 2021-03-26 17:14
 */
public interface BaseForm<T> {
    /**
     * 构建实体
     *
     * @return T 数据实体对象
     * @author z2647w
     * @date 2021/3/26 17:14
     */
    T buildEntity();
}
