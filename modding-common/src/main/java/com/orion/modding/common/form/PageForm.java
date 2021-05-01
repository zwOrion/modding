package com.orion.modding.common.form;

import com.orion.modding.common.vo.PageVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.Min;

/**
 * @author z2647w
 * @date 2021-03-26 18:01
 */
@EqualsAndHashCode
@Data
@ToString
@ApiModel(value = "分页数据", description = "分页所需要的表单数据")
public class PageForm<T> implements BaseForm<PageVO<T>>{
    /**
     * 页码
     */
    @ApiModelProperty("查询页码")
    @Min(value = 1, message = "页码数需要大于0")
    private Integer current;
    /**
     * 每页显示记录数
     */
    @ApiModelProperty("查询数")
    @Min(value = 1, message = "每页显示条数不能小于1")
    private Integer size;
    /**
     * 构建实体
     *
     * @return T 数据实体对象
     * @author z2647w
     * @date 2021/3/26 17:14
     */
    @Override
    public PageVO<T> buildEntity() {
        PageVO<T> pageVO = new PageVO<>();
        BeanUtils.copyProperties(this, pageVO);
        return pageVO;
    }
}
