package com.orion.modding.common.global;



import com.orion.modding.common.utils.JsonUtil;
import com.orion.modding.common.utils.ResultVoUtil;
import com.orion.modding.common.vo.ResultVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * 全局统一处理返回参数
 *
 * @author zwOrion
 * @version 1.0.0
 * @date 2020/10/29 22:14
 */
@ControllerAdvice(basePackages = "com.orion.modding")
@Order(value = 1)
@Log4j2
public class ResponseBodyHandler implements ResponseBodyAdvice<Object> {
    /**
     * Whether this component supports the given controller method return type
     * and the selected {@code HttpMessageConverter} type.
     *
     * @param returnType    the return type
     * @param converterType the selected converter type
     * @return {@code true} if {@link #beforeBodyWrite} should be invoked;
     * {@code false} otherwise
     */
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        log.info("ResponseBodyHandler.supports.converterType -> {}", converterType);
        if (returnType.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)){
            return false;
        }
        if (Objects.requireNonNull(returnType.getMethod()).isAnnotationPresent(IgnoreResponseAdvice.class)){
            return false;
        }
        return !returnType.getParameterType().getName().equals(ResultVO.class.getName());
    }

    /**
     * Invoked after an {@code HttpMessageConverter} is selected and just before
     * its write method is invoked.
     *
     * @param body                  the body to be written
     * @param returnType            the return type of the controller method
     * @param selectedContentType   the content type selected through content negotiation
     * @param selectedConverterType the converter type selected to write to the response
     * @param request               the current request
     * @param response              the current response
     * @return the body that was passed in or a modified (possibly new) instance
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        log.info("ResponseBodyHandler.beforeBodyWrite.returnType -> {}", returnType);
        log.info("ResponseBodyHandler.beforeBodyWrite.selectedContentType -> {}", selectedContentType);
        log.info("ResponseBodyHandler.beforeBodyWrite.selectedConverterType -> {}", selectedConverterType);
        if (body instanceof String) {
            return JsonUtil.obj2String(ResultVoUtil.success(body));
        }
        return ResultVoUtil.success(body);
    }
}
