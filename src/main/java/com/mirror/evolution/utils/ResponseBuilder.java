package com.mirror.evolution.utils;

import org.springframework.ext.common.object.Status;
import org.springframework.ext.module.response.PageModule;
import org.springframework.ext.module.response.PageResponse;
import org.springframework.ext.module.response.Response;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/5
 */
public class ResponseBuilder {
    private ResponseBuilder() {
        throw new IllegalStateException("No instance");
    }

    public static Response<?> ok() {
        return ok(null);
    }

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        // TODO
        response.setStatus(10000);
        response.setMsg("成功");
        response.setCode("success");
        response.setData(data);
        return response;
    }

    public static <T> PageResponse<T> ok(PageModule<T> pageModule) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        // TODO
        response.setStatus(10000);
        response.setMsg("成功");
        response.setCode("success");
        response.setData(pageModule);
        return response;
    }

    public static <T> Response<T> error(Status status) {
        return Response.create(status);
    }
}
