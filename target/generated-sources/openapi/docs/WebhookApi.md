# WebhookApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveStackAndLayerUpdatesUsingPOST**](WebhookApi.md#saveStackAndLayerUpdatesUsingPOST) | **POST** /stackbuilds/{id}/updates | Send stack and layer build updates


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

WebhookApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).webhook();

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

