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


package com.aurea.automation.codegraph.oa3.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StackBuildRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-06T13:09:18.696+05:30[Asia/Kolkata]")
public class StackBuildRequestDto {
  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_BUILD_UPDATES_WEBHOOK_URL = "buildUpdatesWebhookUrl";
  @SerializedName(SERIALIZED_NAME_BUILD_UPDATES_WEBHOOK_URL)
  private String buildUpdatesWebhookUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repositoryUrl";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private String repositoryUrl;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_S3_ACCESS_KEY = "s3AccessKey";
  @SerializedName(SERIALIZED_NAME_S3_ACCESS_KEY)
  private String s3AccessKey;

  public static final String SERIALIZED_NAME_S3_SECRET_KEY = "s3SecretKey";
  @SerializedName(SERIALIZED_NAME_S3_SECRET_KEY)
  private String s3SecretKey;

  public static final String SERIALIZED_NAME_S3_URL = "s3Url";
  @SerializedName(SERIALIZED_NAME_S3_URL)
  private String s3Url;

  public static final String SERIALIZED_NAME_STACK_ID = "stackId";
  @SerializedName(SERIALIZED_NAME_STACK_ID)
  private String stackId;

  public StackBuildRequestDto bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public StackBuildRequestDto buildUpdatesWebhookUrl(String buildUpdatesWebhookUrl) {
    this.buildUpdatesWebhookUrl = buildUpdatesWebhookUrl;
    return this;
  }

   /**
   * Get buildUpdatesWebhookUrl
   * @return buildUpdatesWebhookUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBuildUpdatesWebhookUrl() {
    return buildUpdatesWebhookUrl;
  }

  public void setBuildUpdatesWebhookUrl(String buildUpdatesWebhookUrl) {
    this.buildUpdatesWebhookUrl = buildUpdatesWebhookUrl;
  }

  public StackBuildRequestDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StackBuildRequestDto key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StackBuildRequestDto repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public StackBuildRequestDto revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public StackBuildRequestDto s3AccessKey(String s3AccessKey) {
    this.s3AccessKey = s3AccessKey;
    return this;
  }

   /**
   * Get s3AccessKey
   * @return s3AccessKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getS3AccessKey() {
    return s3AccessKey;
  }

  public void setS3AccessKey(String s3AccessKey) {
    this.s3AccessKey = s3AccessKey;
  }

  public StackBuildRequestDto s3SecretKey(String s3SecretKey) {
    this.s3SecretKey = s3SecretKey;
    return this;
  }

   /**
   * Get s3SecretKey
   * @return s3SecretKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getS3SecretKey() {
    return s3SecretKey;
  }

  public void setS3SecretKey(String s3SecretKey) {
    this.s3SecretKey = s3SecretKey;
  }

  public StackBuildRequestDto s3Url(String s3Url) {
    this.s3Url = s3Url;
    return this;
  }

   /**
   * Get s3Url
   * @return s3Url
  **/
  @ApiModelProperty(required = true, value = "")
  public String getS3Url() {
    return s3Url;
  }

  public void setS3Url(String s3Url) {
    this.s3Url = s3Url;
  }

  public StackBuildRequestDto stackId(String stackId) {
    this.stackId = stackId;
    return this;
  }

   /**
   * Get stackId
   * @return stackId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStackId() {
    return stackId;
  }

  public void setStackId(String stackId) {
    this.stackId = stackId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackBuildRequestDto stackBuildRequestDto = (StackBuildRequestDto) o;
    return Objects.equals(this.bucket, stackBuildRequestDto.bucket) &&
        Objects.equals(this.buildUpdatesWebhookUrl, stackBuildRequestDto.buildUpdatesWebhookUrl) &&
        Objects.equals(this.id, stackBuildRequestDto.id) &&
        Objects.equals(this.key, stackBuildRequestDto.key) &&
        Objects.equals(this.repositoryUrl, stackBuildRequestDto.repositoryUrl) &&
        Objects.equals(this.revision, stackBuildRequestDto.revision) &&
        Objects.equals(this.s3AccessKey, stackBuildRequestDto.s3AccessKey) &&
        Objects.equals(this.s3SecretKey, stackBuildRequestDto.s3SecretKey) &&
        Objects.equals(this.s3Url, stackBuildRequestDto.s3Url) &&
        Objects.equals(this.stackId, stackBuildRequestDto.stackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, buildUpdatesWebhookUrl, id, key, repositoryUrl, revision, s3AccessKey, s3SecretKey, s3Url, stackId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackBuildRequestDto {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    buildUpdatesWebhookUrl: ").append(toIndentedString(buildUpdatesWebhookUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    s3AccessKey: ").append(toIndentedString(s3AccessKey)).append("\n");
    sb.append("    s3SecretKey: ").append(toIndentedString(s3SecretKey)).append("\n");
    sb.append("    s3Url: ").append(toIndentedString(s3Url)).append("\n");
    sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

