/*
 * API V1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.dork.app.react.api;

import com.dork.app.react.api.invoker.ApiException;
import com.dork.app.react.api.model.ActMessage;
import com.dork.app.react.api.model.Page;
import com.dork.app.react.api.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for MessageApi
 */
@Ignore
public class MessageApiTest {

    private final MessageApi api = new MessageApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiMessageMessageRecentActByIdPostTest() throws ApiException {
        String id = null;
        User user = null;
        Page page = null;
        List<ActMessage> response = api.apiMessageMessageRecentActByIdPost(id, user, page);

        // TODO: test validations
    }
    
}