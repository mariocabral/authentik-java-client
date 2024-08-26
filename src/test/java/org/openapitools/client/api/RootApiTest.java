/*
 * authentik
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2024.6.3
 * Contact: hello@goauthentik.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Config;
import org.openapitools.client.model.GenericError;
import org.openapitools.client.model.ValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RootApi
 */
@Disabled
public class RootApiTest {

    private final RootApi api = new RootApi();

    /**
     * Retrieve public configuration options
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rootConfigRetrieveTest() throws ApiException {
        Config response = api.rootConfigRetrieve();
        // TODO: test validations
    }

}
