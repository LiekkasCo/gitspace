package com.example.demo.controller;

import com.example.demo.common.data.JsonResult;
import com.example.demo.common.data.JsonResultCode;

/**
 * BaseController
 * @author liangchen
 * @date 2020.09.16
 */
public class BaseController {

    public JsonResult result(JsonResultCode resultCode, Object content) {
        return (new JsonResult()).result(resultCode, content);
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


    public JsonResult fail() {
        return result(JsonResultCode.CODE_FAIL, null);
    }

}
