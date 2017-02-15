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
import com.dork.app.react.api.model.Profile;
import com.dork.app.react.api.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InitApi
 */
@Ignore
public class InitApiTest {

    private final InitApi api = new InitApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiInitProfileGetTest() throws ApiException {
        api.apiInitProfileGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiInitProfilePostTest() throws ApiException {
        Profile profile = null;
        api.apiInitProfilePost(profile);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiInitUserGetTest() throws ApiException {
        api.apiInitUserGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiInitUserPostTest() throws ApiException {
        User user = null;
        api.apiInitUserPost(user);

        // TODO: test validations
    }
    
}
