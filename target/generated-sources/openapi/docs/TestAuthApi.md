# TestAuthApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTestAuthUsingGET**](TestAuthApi.md#getTestAuthUsingGET) | **GET** /test-auth | Test Authentication


<a name="getTestAuthUsingGET"></a>
# **getTestAuthUsingGET**
> String getTestAuthUsingGET(name)

Test Authentication

This method tests authentication

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

TestAuthApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).testAuth();

api.getTestAuthUsingGET().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

