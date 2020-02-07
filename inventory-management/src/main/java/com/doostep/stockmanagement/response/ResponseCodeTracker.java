package com.doostep.stockmanagement.response;

import com.doostep.stockmanagement.enums.ResponseMessages;
import org.springframework.stereotype.Component;
import java.util.HashMap;

/**
 * Global response code tracker. When a error occurs of failed response must be
 * set, it is set for that threadId in this singleton.
 *
 *
 */
@Component
public class ResponseCodeTracker {

    private static HashMap<Long, ResponseMessages> threadIdToResponseCodeEnum = new HashMap<>();

//------------------------------------------------------------------------------
    public static void setResponseCodeEnum(ResponseMessages responseCodeEnum) {
        threadIdToResponseCodeEnum.put(Thread.currentThread().getId(), responseCodeEnum);
    }
//------------------------------------------------------------------------------   

    /**
     * Get reason for failure of method.
     *
     * @return {@link ResponseMessages}
     */
    public static ResponseMessages getResponseCodeEnum() {
        ResponseMessages responseCodeEnum = threadIdToResponseCodeEnum.get(Thread.currentThread().getId());
        return responseCodeEnum;
    }
}
