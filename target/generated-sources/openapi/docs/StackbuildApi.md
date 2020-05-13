# StackbuildApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStackBuildRequestUsingPOST**](StackbuildApi.md#createStackBuildRequestUsingPOST) | **POST** /stackbuilds | Submits a stack build request
[**getStackBuildStatus**](StackbuildApi.md#getStackBuildStatus) | **GET** /stackbuilds/{id} | Get the stack build request data
[**getStackBuildStatus1**](StackbuildApi.md#getStackBuildStatus1) | **GET** /stackbuilds/{id}/status | Get the status of a Stack build request
[**saveStackAndLayerUpdatesUsingPOST**](StackbuildApi.md#saveStackAndLayerUpdatesUsingPOST) | **POST** /stackbuilds/{id}/updates | Send stack and layer build updates


<a name="createStackBuildRequestUsingPOST"></a>
# **createStackBuildRequestUsingPOST**
> StackBuildRequest createStackBuildRequestUsingPOST(stackBuildRequestDto)

Submits a stack build request

This method validates and adds a stack build request

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackbuildApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stackbuild();

api.createStackBuildRequestUsingPOST()
    .body(stackBuildRequestDto).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stackBuildRequestDto** | [**StackBuildRequestDto**](StackBuildRequestDto.md)| requestDto |

### Return type

[**StackBuildRequest**](StackBuildRequest.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getStackBuildStatus"></a>
# **getStackBuildStatus**
> StackBuildRequest getStackBuildStatus(id)

Get the stack build request data

This endpoint allows clients to retrieve the data of a stack build request with specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackbuildApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stackbuild();

api.getStackBuildStatus()
    .idPath(id).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Stack build request ID |

### Return type

[**StackBuildRequest**](StackBuildRequest.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStackBuildStatus1"></a>
# **getStackBuildStatus1**
> StackBuildStatus getStackBuildStatus1(id)

Get the status of a Stack build request

This endpoint allows clients to retrieve the status of a Stack build request with specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackbuildApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stackbuild();

api.getStackBuildStatus1()
    .idPath(id).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Stack build request ID |

### Return type

[**StackBuildStatus**](StackBuildStatus.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="saveStackAndLayerUpdatesUsingPOST"></a>
# **saveStackAndLayerUpdatesUsingPOST**
> StackBuildRequest saveStackAndLayerUpdatesUsingPOST(id, stackBuildStatusUpdateDto)

Send stack and layer build updates

Send stack and layer build updates

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackbuildApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stackbuild();

api.saveStackAndLayerUpdatesUsingPOST()
    .idPath(id)
    .body(stackBuildStatusUpdateDto).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **stackBuildStatusUpdateDto** | [**StackBuildStatusUpdateDto**](StackBuildStatusUpdateDto.md)| requestDto |

### Return type

[**StackBuildRequest**](StackBuildRequest.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

