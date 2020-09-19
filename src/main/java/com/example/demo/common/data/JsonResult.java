package com.example.demo.common.data;

import lombok.Data;
import lombok.ToString;
import org.springframework.util.Assert;

/**
 *json对象出参格式
 * @author liangchen
 * @date 2020.09.19
 */
@Data
@ToString
public class JsonResult {


    /**
     * 错误码：非0为错误
     */
    private int error = 0;

    /**
     * 返回内容
     */
    private Object content;

    /**
     * 错误消息
     */
    private Object message;

    public JsonResult(){}

    public JsonResult(JsonResultCode resultCode, Object content) {
        result(resultCode, content);
    }

    public JsonResult result(JsonResultCode resultCode,Object content){
        this.error = resultCode.getCode();
        this.content = content;
        this.message = resultCode.getMessage();
        return this;
    }

    public JsonResult success() {
        return result(JsonResultCode.CODE_SUCCESS, null);
    }

    public JsonResult success(Object content) {
        return result(JsonResultCode.CODE_SUCCESS, content);
    }

    public JsonResult fail(JsonResultCode resultCode) {
        return result(resultCode, null);
    }

    public JsonResult fail(JsonResultCode resultCode, Object content) {
        Assert.isTrue(resultCode.getCode() != JsonResultCode.CODE_SUCCESS.getCode(),"code is not equal to JsonResultCode.CODE_SUCCESS");
        return result(resultCode, content);
    }



}
