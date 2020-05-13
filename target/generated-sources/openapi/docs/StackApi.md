# StackApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStackUsingPOST**](StackApi.md#createStackUsingPOST) | **POST** /stacks | Add a Stack Definition
[**deactivateStackUsingDELETE**](StackApi.md#deactivateStackUsingDELETE) | **DELETE** /stacks/{id} | Deactivate a Stack
[**getStackDetailsUsingGET**](StackApi.md#getStackDetailsUsingGET) | **GET** /stacks/{id} | Retrieve a Stack
[**getStackVersions**](StackApi.md#getStackVersions) | **GET** /stacks/{id}/versions | Get all Stack Versions
[**listAllStacksUsingGET**](StackApi.md#listAllStacksUsingGET) | **GET** /stacks | Retrieves a list of Stacks
[**updateStackUsingPATCH**](StackApi.md#updateStackUsingPATCH) | **PATCH** /stacks/{id} | Update a Stack


<a name="createStackUsingPOST"></a>
# **createStackUsingPOST**
> StackVersion createStackUsingPOST(attribute)

Add a Stack Definition

This method validates and adds a Stack Definition

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stack();

api.createStackUsingPOST()
    .body(attribute).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attribute** | [**Attribute**](Attribute.md)| stackDto |

### Return type

[**StackVersion**](StackVersion.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deactivateStackUsingDELETE"></a>
# **deactivateStackUsingDELETE**
> List&lt;Object&gt; deactivateStackUsingDELETE(id)

Deactivate a Stack

Deactivate the Stack with the specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stack();

api.deactivateStackUsingDELETE()
    .idPath(id).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

**List&lt;Object&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStackDetailsUsingGET"></a>
# **getStackDetailsUsingGET**
> StackVersion getStackDetailsUsingGET(id, version)

Retrieve a Stack

TRetrieve a Stack with the specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stack();

api.getStackDetailsUsingGET()
    .idPath(id).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the stack to retrieve |
 **version** | **Integer**| version id to retrieve | [optional]

### Return type

[**StackVersion**](StackVersion.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStackVersions"></a>
# **getStackVersions**
> StackVersion getStackVersions(id, limit, offset)

Get all Stack Versions

This endpoint allows clients to retrieve versions for the Stack with specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stack();

api.getStackVersions()
    .idPath(id).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Stack ID |
 **limit** | **Integer**| limit | [optional] [default to 100]
 **offset** | **Integer**| offset | [optional] [default to 0]

### Return type

[**StackVersion**](StackVersion.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listAllStacksUsingGET"></a>
# **listAllStacksUsingGET**
> List&lt;Object&gt; listAllStacksUsingGET(active, limit, offset)

Retrieves a list of Stacks

Retrieves a list of Stacks

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stack();

api.listAllStacksUsingGET().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **Boolean**| active | [optional] [default to true]
 **limit** | **Integer**| limit | [optional] [default to 100]
 **offset** | **Integer**| offset | [optional] [default to 0]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateStackUsingPATCH"></a>
# **updateStackUsingPATCH**
> StackVersion updateStackUsingPATCH(id, patchOperationString)

Update a Stack

Update the name, description, or definition of a Stack

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StackApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).stack();

api.updateStackUsingPATCH()
    .idPath(id)
    .body(patchOperationString).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the Stack |
 **patchOperationString** | [**List&lt;PatchOperationString&gt;**](List.md)| patchRequests |

### Return type

[**StackVersion**](StackVersion.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

