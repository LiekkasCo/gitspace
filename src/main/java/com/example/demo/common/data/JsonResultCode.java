package com.example.demo.common.data;

import lombok.Getter;
import lombok.ToString;

/**
 * 返回参数自定义错误码
 * @author liangchen
 * @date 2020.07.13
 */
@Getter
@ToString
public enum JsonResultCode {

    // 公共码
    CODE_SUCCESS(0, JsonResultMessage.MSG_SUCCESS),
    CODE_FAIL(-1, JsonResultMessage.MSG_FAIL);

    /**
     * 得到返回码
     */
    private int code;

    /**
     * 返回信息
     */
    private String message;


    JsonResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
