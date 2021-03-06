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
import com.aurea.automation.codegraph.oa3.models.ModelAndView;

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

@Api(value = "BasicErrorController")
public class BasicErrorControllerApi {

    private RequestSpecBuilder reqSpec;

    private BasicErrorControllerApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static BasicErrorControllerApi basicErrorController(RequestSpecBuilder reqSpec) {
        return new BasicErrorControllerApi(reqSpec);
    }


    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingDELETE",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingDELETEOper errorHtmlUsingDELETE() {
        return new ErrorHtmlUsingDELETEOper(reqSpec);
    }

    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingGET",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingGETOper errorHtmlUsingGET() {
        return new ErrorHtmlUsingGETOper(reqSpec);
    }

    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingHEAD",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingHEADOper errorHtmlUsingHEAD() {
        return new ErrorHtmlUsingHEADOper(reqSpec);
    }

    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingOPTIONS",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingOPTIONSOper errorHtmlUsingOPTIONS() {
        return new ErrorHtmlUsingOPTIONSOper(reqSpec);
    }

    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingPATCH",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingPATCHOper errorHtmlUsingPATCH() {
        return new ErrorHtmlUsingPATCHOper(reqSpec);
    }

    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingPOST",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingPOSTOper errorHtmlUsingPOST() {
        return new ErrorHtmlUsingPOSTOper(reqSpec);
    }

    @ApiOperation(value = "errorHtml",
            notes = "",
            nickname = "errorHtmlUsingPUT",
            tags = { "basic-error-controller" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public ErrorHtmlUsingPUTOper errorHtmlUsingPUT() {
        return new ErrorHtmlUsingPUTOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public BasicErrorControllerApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingDELETEOper implements Oper<ErrorHtmlUsingDELETEOper> {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingDELETEOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * DELETE /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingDELETEOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingDELETEOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingGETOper implements Oper<ErrorHtmlUsingGETOper> {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingHEADOper implements Oper<ErrorHtmlUsingHEADOper> {

        public static final Method REQ_METHOD = HEAD;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingHEADOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * HEAD /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * HEAD /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingHEADOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingHEADOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingOPTIONSOper implements Oper<ErrorHtmlUsingOPTIONSOper> {

        public static final Method REQ_METHOD = OPTIONS;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingOPTIONSOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * OPTIONS /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * OPTIONS /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingOPTIONSOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingOPTIONSOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingPATCHOper implements Oper<ErrorHtmlUsingPATCHOper> {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingPATCHOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * PATCH /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingPATCHOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingPATCHOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingPOSTOper implements Oper<ErrorHtmlUsingPOSTOper> {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingPOSTOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingPOSTOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingPOSTOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * errorHtml
     * 
     *
     * return ModelAndView
     */
    public static class ErrorHtmlUsingPUTOper implements Oper<ErrorHtmlUsingPUTOper> {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/error";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public ErrorHtmlUsingPUTOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("text/html");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /error
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * PUT /error
         * @param handler handler
         * @return ModelAndView
         */
        public ModelAndView executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ModelAndView>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingPUTOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public ErrorHtmlUsingPUTOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
