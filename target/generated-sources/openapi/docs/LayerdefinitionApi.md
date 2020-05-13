# LayerdefinitionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLayerDefinitionUsingPOST**](LayerdefinitionApi.md#createLayerDefinitionUsingPOST) | **POST** /layerdefinitions | Add a Layer Definition
[**deleteLayerDefinitionDetail**](LayerdefinitionApi.md#deleteLayerDefinitionDetail) | **DELETE** /layerdefinitions/{idOrName} | Delete a Layer Definition Detail
[**getLayerDefinitionDetails1**](LayerdefinitionApi.md#getLayerDefinitionDetails1) | **GET** /layerdefinitions/{idOrName} | Get a Layer Definition Details
[**getLayerDefinitionVersions**](LayerdefinitionApi.md#getLayerDefinitionVersions) | **GET** /layerdefinitions/{idOrName}/versions | Get all Layer Definition Versions
[**listAllLayerDefinitions**](LayerdefinitionApi.md#listAllLayerDefinitions) | **GET** /layerdefinitions | List all Layer Definitions
[**updateLayerDefinitionDetails**](LayerdefinitionApi.md#updateLayerDefinitionDetails) | **PATCH** /layerdefinitions/{idOrName} | Update a Layer Definition
[**uploadJarToS3UsingPOST**](LayerdefinitionApi.md#uploadJarToS3UsingPOST) | **POST** /files | Upload jars to s3


<a name="createLayerDefinitionUsingPOST"></a>
# **createLayerDefinitionUsingPOST**
> LayerDefinitionResponse createLayerDefinitionUsingPOST(attribute)

Add a Layer Definition

This method validates and adds a Layer Definition

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.createLayerDefinitionUsingPOST()
    .body(attribute).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attribute** | [**Attribute**](Attribute.md)| layerDefinitionDto |

### Return type

[**LayerDefinitionResponse**](LayerDefinitionResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteLayerDefinitionDetail"></a>
# **deleteLayerDefinitionDetail**
> ResponseEntity deleteLayerDefinitionDetail(idOrName)

Delete a Layer Definition Detail

This endpoint allows clients to delete the Layer Definition with the specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.deleteLayerDefinitionDetail()
    .idOrNamePath(idOrName).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| Layer Definition ID |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLayerDefinitionDetails1"></a>
# **getLayerDefinitionDetails1**
> LayerDefinitionResponse getLayerDefinitionDetails1(idOrName, version)

Get a Layer Definition Details

This endpoint allows clients to retrieve details for the Layer Definition with the specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.getLayerDefinitionDetails1()
    .idOrNamePath(idOrName).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| Layer Definition ID |
 **version** | **String**| version id to retrieve | [optional]

### Return type

[**LayerDefinitionResponse**](LayerDefinitionResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLayerDefinitionVersions"></a>
# **getLayerDefinitionVersions**
> LayerDefinitionCollectionResponse getLayerDefinitionVersions(idOrName, limit, offset)

Get all Layer Definition Versions

This endpoint allows clients to retrieve versions for the Layer Definition with the specified id

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.getLayerDefinitionVersions()
    .idOrNamePath(idOrName).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| Layer Definition ID |
 **limit** | **Integer**| limit | [optional] [default to 100]
 **offset** | **Integer**| offset | [optional] [default to 0]

### Return type

[**LayerDefinitionCollectionResponse**](LayerDefinitionCollectionResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listAllLayerDefinitions"></a>
# **listAllLayerDefinitions**
> LayerDefinitionCollectionResponse listAllLayerDefinitions(active, limit, offset)

List all Layer Definitions

This endpoint allows clients to retrieve all Layer Definition optionally indicating to get inactive ones and specifying offset and limits

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.listAllLayerDefinitions().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **Boolean**| active | [optional] [default to true]
 **limit** | **Integer**| limit | [optional] [default to 100]
 **offset** | **Integer**| offset | [optional] [default to 0]

### Return type

[**LayerDefinitionCollectionResponse**](LayerDefinitionCollectionResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateLayerDefinitionDetails"></a>
# **updateLayerDefinitionDetails**
> LayerDefinitionResponse updateLayerDefinitionDetails(idOrName, patchOperationString)

Update a Layer Definition

Update the name, description, or definition of a Layer Definition

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.updateLayerDefinitionDetails()
    .idOrNamePath(idOrName)
    .body(patchOperationString).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **String**| id of the Layer Definition |
 **patchOperationString** | [**List&lt;PatchOperationString&gt;**](List.md)| patchRequests |

### Return type

[**LayerDefinitionResponse**](LayerDefinitionResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadJarToS3UsingPOST"></a>
# **uploadJarToS3UsingPOST**
> String uploadJarToS3UsingPOST(files)

Upload jars to s3

This method receives jars and uploads them to s3

### Example
```java
// Import classes:
//import com.aurea.automation.codegraph.oa3.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LayerdefinitionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).layerdefinition();

api.uploadJarToS3UsingPOST()
    .filesMultiPart(files).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**|  |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

