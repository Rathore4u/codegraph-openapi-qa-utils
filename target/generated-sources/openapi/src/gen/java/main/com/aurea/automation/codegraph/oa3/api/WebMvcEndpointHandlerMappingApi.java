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

import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.*;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import com.aurea.automation.codegraph.oa3.JSON;
import com.aurea.automation.codegraph.oa3.Oper;
import com.aurea.automation.codegraph.oa3.models.*;

import static io.restassured.http.Method.*;

@Api(value = "WebMvcEndpointHandlerMapping")
public class WebMvcEndpointHandlerMappingApi {

    private RequestSpecBuilder reqSpec;

    private WebMvcEndpointHandlerMappingApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static WebMvcEndpointHandlerMappingApi webMvcEndpointHandlerMapping(RequestSpecBuilder reqSpec) {
        return new WebMvcEndpointHandlerMappingApi(reqSpec);
    }


    @ApiOperation(value = "links",
            notes = "",
            nickname = "linksUsingGET",
            tags = { "web-mvc-endpoint-handler-mapping" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public LinksUsingGETOper linksUsingGET() {
        return new LinksUsingGETOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public WebMvcEndpointHandlerMappingApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * links
     * 
     *
     * return Map&lt;String, Map&lt;String, Link&gt;&gt;
     */
    public static class LinksUsingGETOper implements Oper<LinksUsingGETOper> {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/actuator";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public LinksUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /actuator
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /actuator
         * @param handler handler
         * @return Map&lt;String, Map&lt;String, Link&gt;&gt;
         */
        public Map<String, Map<String, Link>> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Map<String, Map<String, Link>>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public LinksUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public LinksUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}