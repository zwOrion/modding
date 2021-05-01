package com.orion.modding.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

/**
 * 页面查询对象
 *
 * @author : z2647w
 * @date : 2021/3/26 17:52
 */

@ToString
@EqualsAndHashCode
@Accessors(chain = true)
@Data
@ApiModel(value = "页面查询返回对象", description = "返回页面查询记录")
public class PageVO<T> implements Serializable {
    private static final long serialVersionUID = -3312733823188017337L;
    /**
     * 页码
     */
    @ApiModelProperty("当前页码")
    @Min(value = 1, message = "页码值最小为1")
    private Integer current;
    /**
     * 每页记录数
     */
    @ApiModelProperty("查询数量")
    @Min(value = 1, message = "查询数量最小为1")
    private Integer size;
    /**
     * 记录总数
     */
    @ApiModelProperty("记录总数")
    private Integer total;
    /**
     * 页面数
     */
    @ApiModelProperty("页面总数")
    private Integer pages;
    /**
     * 查询记录
     */
    @ApiModelProperty("记录列表")
    private List<T> records;

    public PageVO() {
    }

    /**
     * 计算查询开始索引
     *
     * @return 索引位置
     */
    public Integer calculateStartIndex() {
        return (this.current - 1) * size;
    }

    /**
     * 设置记录总数同时计算页面总数
     *
     * @param total 记录数
     */
    public void setTotalAndPages(Integer total) {
        this.total = total;
        this.setPages((this.total - 1) / this.size + 1);
    }
}
