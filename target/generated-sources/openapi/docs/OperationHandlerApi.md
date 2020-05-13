# OperationHandlerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleUsingGET**](OperationHandlerApi.md#handleUsingGET) | **GET** /actuator/health | handle
[**handleUsingGET1**](OperationHandlerApi.md#handleUsingGET1) | **GET** /actuator/info | handle


<a name="handleUsingGET"></a>
# **handleUsingGET**
> Object handleUsingGET(requestBody)

handle

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

OperationHandlerApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).operationHandler();

api.handleUsingGET().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)| body | [optional]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json

<a name="handleUsingGET1"></a>
# **handleUsingGET1**
> Object handleUsingGET1(requestBody)

handle

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

OperationHandlerApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).operationHandler();

api.handleUsingGET1().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)| body | [optional]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json

