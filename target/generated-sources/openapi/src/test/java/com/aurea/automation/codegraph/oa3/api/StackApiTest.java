/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aurea.automation.codegraph.oa3.api;

import com.aurea.automation.codegraph.oa3.models.Attribute;
import com.aurea.automation.codegraph.oa3.models.ErrorResponse;
import com.aurea.automation.codegraph.oa3.models.PatchOperationString;
import com.aurea.automation.codegraph.oa3.models.StackVersion;
import com.aurea.automation.codegraph.oa3.ApiClient;
import com.aurea.automation.codegraph.oa3.api.StackApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static com.aurea.automation.codegraph.oa3.GsonObjectMapper.gson;

/**
 * API tests for StackApi
 */
@Ignore
public class StackApiTest {

    private StackApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost"))).stack();
    }

    /**
     * OK
     */
    @Test
    public void shouldSee200AfterCreateStackUsingPOST() {
        Attribute attribute = null;
        api.createStackUsingPOST()
                .body(attribute).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not authenticated
     */
    @Test
    public void shouldSee401AfterCreateStackUsingPOST() {
        Attribute attribute = null;
        api.createStackUsingPOST()
                .body(attribute).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * The Stack definition provided is not a valid YAML
     */
    @Test
    public void shouldSee422AfterCreateStackUsingPOST() {
        Attribute attribute = null;
        api.createStackUsingPOST()
                .body(attribute).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterDeactivateStackUsingDELETE() {
        String id = null;
        api.deactivateStackUsingDELETE()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * successful operation
     */
    @Test
    public void shouldSee204AfterDeactivateStackUsingDELETE() {
        String id = null;
        api.deactivateStackUsingDELETE()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterDeactivateStackUsingDELETE() {
        String id = null;
        api.deactivateStackUsingDELETE()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Stack not found
     */
    @Test
    public void shouldSee404AfterDeactivateStackUsingDELETE() {
        String id = null;
        api.deactivateStackUsingDELETE()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * A StackVersion
     */
    @Test
    public void shouldSee200AfterGetStackDetailsUsingGET() {
        String id = null;
        Integer version = null;
        api.getStackDetailsUsingGET()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not authenticated
     */
    @Test
    public void shouldSee401AfterGetStackDetailsUsingGET() {
        String id = null;
        Integer version = null;
        api.getStackDetailsUsingGET()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Stack not found
     */
    @Test
    public void shouldSee404AfterGetStackDetailsUsingGET() {
        String id = null;
        Integer version = null;
        api.getStackDetailsUsingGET()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * A StackVersion
     */
    @Test
    public void shouldSee200AfterGetStackVersions() {
        String id = null;
        Integer limit = null;
        Integer offset = null;
        api.getStackVersions()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not authenticated
     */
    @Test
    public void shouldSee401AfterGetStackVersions() {
        String id = null;
        Integer limit = null;
        Integer offset = null;
        api.getStackVersions()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A Stack with the specified id does not exist
     */
    @Test
    public void shouldSee404AfterGetStackVersions() {
        String id = null;
        Integer limit = null;
        Integer offset = null;
        api.getStackVersions()
                .idPath(id).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterListAllStacksUsingGET() {
        Boolean active = null;
        Integer limit = null;
        Integer offset = null;
        api.listAllStacksUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Stack updated
     */
    @Test
    public void shouldSee200AfterUpdateStackUsingPATCH() {
        String id = null;
        List<PatchOperationString> patchOperationString = null;
        api.updateStackUsingPATCH()
                .idPath(id)
                .body(patchOperationString).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not authenticated
     */
    @Test
    public void shouldSee401AfterUpdateStackUsingPATCH() {
        String id = null;
        List<PatchOperationString> patchOperationString = null;
        api.updateStackUsingPATCH()
                .idPath(id)
                .body(patchOperationString).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Stack not found
     */
    @Test
    public void shouldSee404AfterUpdateStackUsingPATCH() {
        String id = null;
        List<PatchOperationString> patchOperationString = null;
        api.updateStackUsingPATCH()
                .idPath(id)
                .body(patchOperationString).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid or missing parameters
     */
    @Test
    public void shouldSee422AfterUpdateStackUsingPATCH() {
        String id = null;
        List<PatchOperationString> patchOperationString = null;
        api.updateStackUsingPATCH()
                .idPath(id)
                .body(patchOperationString).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}