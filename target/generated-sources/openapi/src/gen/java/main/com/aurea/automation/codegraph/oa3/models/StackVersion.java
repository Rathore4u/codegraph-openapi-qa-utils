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
 * StackVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-06T13:09:18.696+05:30[Asia/Kolkata]")
public class StackVersion {
  public static final String SERIALIZED_NAME_CREATED_DT = "createdDt";
  @SerializedName(SERIALIZED_NAME_CREATED_DT)
  private OffsetDateTime createdDt;

  public static final String SERIALIZED_NAME_DEFINITION = "definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private String definition;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STACK = "stack";
  @SerializedName(SERIALIZED_NAME_STACK)
  private Stack stack = null;

  public static final String SERIALIZED_NAME_UPDATED_DT = "updatedDt";
  @SerializedName(SERIALIZED_NAME_UPDATED_DT)
  private OffsetDateTime updatedDt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public StackVersion createdDt(OffsetDateTime createdDt) {
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

  public StackVersion definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public StackVersion id(String id) {
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

  public StackVersion stack(Stack stack) {
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

  public StackVersion updatedDt(OffsetDateTime updatedDt) {
    this.updatedDt = updatedDt;
    return this;
  }

   /**
   * Get updatedDt
   * @return updatedDt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedDt() {
    return updatedDt;
  }

  public void setUpdatedDt(OffsetDateTime updatedDt) {
    this.updatedDt = updatedDt;
  }

  public StackVersion version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackVersion stackVersion = (StackVersion) o;
    return Objects.equals(this.createdDt, stackVersion.createdDt) &&
        Objects.equals(this.definition, stackVersion.definition) &&
        Objects.equals(this.id, stackVersion.id) &&
        Objects.equals(this.stack, stackVersion.stack) &&
        Objects.equals(this.updatedDt, stackVersion.updatedDt) &&
        Objects.equals(this.version, stackVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDt, definition, id, stack, updatedDt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackVersion {\n");
    
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    updatedDt: ").append(toIndentedString(updatedDt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

