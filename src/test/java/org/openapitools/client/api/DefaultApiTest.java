/*
 * Transaction Service
 * #### Notes  * Allows for the loading of funds to a user's account. * Handles the authorization of a transaction based on a user's balance. * Requires realtime synchronous calculation of balance on request. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AuthorizationRequest;
import org.openapitools.client.model.AuthorizationResponse;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.LoadRequest;
import org.openapitools.client.model.LoadResponse;
import org.openapitools.client.model.Ping;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Removes funds from a user&#39;s account if sufficient funds are available.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authorizationMessageIdPutTest() throws ApiException {
        String messageId = null;
        AuthorizationRequest authorizationRequest = null;
        AuthorizationResponse response = api.authorizationMessageIdPut(messageId, authorizationRequest);
        // TODO: test validations
    }

    /**
     * Adds funds to a user&#39;s account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadMessageIdPutTest() throws ApiException {
        String messageId = null;
        LoadRequest loadRequest = null;
        LoadResponse response = api.loadMessageIdPut(messageId, loadRequest);
        // TODO: test validations
    }

    /**
     * Tests the availability of the service and returns the current server time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pingGetTest() throws ApiException {
        Ping response = api.pingGet();
        // TODO: test validations
    }

}
