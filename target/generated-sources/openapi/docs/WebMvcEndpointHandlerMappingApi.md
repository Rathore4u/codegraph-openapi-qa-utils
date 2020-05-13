# WebMvcEndpointHandlerMappingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linksUsingGET**](WebMvcEndpointHandlerMappingApi.md#linksUsingGET) | **GET** /actuator | links


<a name="linksUsingGET"></a>
# **linksUsingGET**
> Map&lt;String, Map&lt;String, Link&gt;&gt; linksUsingGET()

links

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

WebMvcEndpointHandlerMappingApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).webMvcEndpointHandlerMapping();

api.linksUsingGET().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Map&lt;String, Link&gt;&gt;**](Map.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.spring-boot.actuator.v2+json

