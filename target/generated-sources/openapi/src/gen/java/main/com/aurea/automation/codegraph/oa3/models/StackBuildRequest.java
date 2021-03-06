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
import com.aurea.automation.codegraph.oa3.models.Stack;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * StackBuildRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-06T13:09:18.696+05:30[Asia/Kolkata]")
public class StackBuildRequest {
  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_COMPLETED_DT = "completedDt";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DT)
  private OffsetDateTime completedDt;

  public static final String SERIALIZED_NAME_CREATED_DT = "createdDt";
  @SerializedName(SERIALIZED_NAME_CREATED_DT)
  private OffsetDateTime createdDt;

  public static final String SERIALIZED_NAME_DUMP_FILE = "dumpFile";
  @SerializedName(SERIALIZED_NAME_DUMP_FILE)
  private String dumpFile;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PROCESSED_DT = "processedDt";
  @SerializedName(SERIALIZED_NAME_PROCESSED_DT)
  private OffsetDateTime processedDt;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repositoryUrl";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private String repositoryUrl;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_S3ACCESS_KEY = "s3accessKey";
  @SerializedName(SERIALIZED_NAME_S3ACCESS_KEY)
  private String s3accessKey;

  public static final String SERIALIZED_NAME_S3SECRET_KEY = "s3secretKey";
  @SerializedName(SERIALIZED_NAME_S3SECRET_KEY)
  private String s3secretKey;

  public static final String SERIALIZED_NAME_S3URL = "s3url";
  @SerializedName(SERIALIZED_NAME_S3URL)
  private String s3url;

  public static final String SERIALIZED_NAME_STACK = "stack";
  @SerializedName(SERIALIZED_NAME_STACK)
  private Stack stack = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public StackBuildRequest bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @ApiModelProperty(value = "")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public StackBuildRequest completedDt(OffsetDateTime completedDt) {
    this.completedDt = completedDt;
    return this;
  }

   /**
   * Get completedDt
   * @return completedDt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompletedDt() {
    return completedDt;
  }

  public void setCompletedDt(OffsetDateTime completedDt) {
    this.completedDt = completedDt;
  }

  public StackBuildRequest createdDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
    return this;
  }

   /**
   * Get createdDt
   * @return createdDt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
  }

  public StackBuildRequest dumpFile(String dumpFile) {
    this.dumpFile = dumpFile;
    return this;
  }

   /**
   * Get dumpFile
   * @return dumpFile
  **/
  @ApiModelProperty(value = "")
  public String getDumpFile() {
    return dumpFile;
  }

  public void setDumpFile(String dumpFile) {
    this.dumpFile = dumpFile;
  }

  public StackBuildRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StackBuildRequest keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Get keyName
   * @return keyName
  **/
  @ApiModelProperty(value = "")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public StackBuildRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StackBuildRequest processedDt(OffsetDateTime processedDt) {
    this.processedDt = processedDt;
    return this;
  }

   /**
   * Get processedDt
   * @return processedDt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessedDt() {
    return processedDt;
  }

  public void setProcessedDt(OffsetDateTime processedDt) {
    this.processedDt = processedDt;
  }

  public StackBuildRequest repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @ApiModelProperty(value = "")
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public StackBuildRequest revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public StackBuildRequest s3accessKey(String s3accessKey) {
    this.s3accessKey = s3accessKey;
    return this;
  }

   /**
   * Get s3accessKey
   * @return s3accessKey
  **/
  @ApiModelProperty(value = "")
  public String getS3accessKey() {
    return s3accessKey;
  }

  public void setS3accessKey(String s3accessKey) {
    this.s3accessKey = s3accessKey;
  }

  public StackBuildRequest s3secretKey(String s3secretKey) {
    this.s3secretKey = s3secretKey;
    return this;
  }

   /**
   * Get s3secretKey
   * @return s3secretKey
  **/
  @ApiModelProperty(value = "")
  public String getS3secretKey() {
    return s3secretKey;
  }

  public void setS3secretKey(String s3secretKey) {
    this.s3secretKey = s3secretKey;
  }

  public StackBuildRequest s3url(String s3url) {
    this.s3url = s3url;
    return this;
  }

   /**
   * Get s3url
   * @return s3url
  **/
  @ApiModelProperty(value = "")
  public String getS3url() {
    return s3url;
  }

  public void setS3url(String s3url) {
    this.s3url = s3url;
  }

  public StackBuildRequest stack(Stack stack) {
    this.stack = stack;
    return this;
  }

   /**
   * Get stack
   * @return stack
  **/
  @ApiModelProperty(value = "")
  public Stack getStack() {
    return stack;
  }

  public void setStack(Stack stack) {
    this.stack = stack;
  }

  public StackBuildRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StackBuildRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @ApiModelProperty(value = "")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackBuildRequest stackBuildRequest = (StackBuildRequest) o;
    return Objects.equals(this.bucket, stackBuildRequest.bucket) &&
        Objects.equals(this.completedDt, stackBuildRequest.completedDt) &&
        Objects.equals(this.createdDt, stackBuildRequest.createdDt) &&
        Objects.equals(this.dumpFile, stackBuildRequest.dumpFile) &&
        Objects.equals(this.id, stackBuildRequest.id) &&
        Objects.equals(this.keyName, stackBuildRequest.keyName) &&
        Objects.equals(this.message, stackBuildRequest.message) &&
        Objects.equals(this.processedDt, stackBuildRequest.processedDt) &&
        Objects.equals(this.repositoryUrl, stackBuildRequest.repositoryUrl) &&
        Objects.equals(this.revision, stackBuildRequest.revision) &&
        Objects.equals(this.s3accessKey, stackBuildRequest.s3accessKey) &&
        Objects.equals(this.s3secretKey, stackBuildRequest.s3secretKey) &&
        Objects.equals(this.s3url, stackBuildRequest.s3url) &&
        Objects.equals(this.stack, stackBuildRequest.stack) &&
        Objects.equals(this.status, stackBuildRequest.status) &&
        Objects.equals(this.webhookUrl, stackBuildRequest.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, completedDt, createdDt, dumpFile, id, keyName, message, processedDt, repositoryUrl, revision, s3accessKey, s3secretKey, s3url, stack, status, webhookUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackBuildRequest {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    completedDt: ").append(toIndentedString(completedDt)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
    sb.append("    dumpFile: ").append(toIndentedString(dumpFile)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    processedDt: ").append(toIndentedString(processedDt)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    s3accessKey: ").append(toIndentedString(s3accessKey)).append("\n");
    sb.append("    s3secretKey: ").append(toIndentedString(s3secretKey)).append("\n");
    sb.append("    s3url: ").append(toIndentedString(s3url)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

