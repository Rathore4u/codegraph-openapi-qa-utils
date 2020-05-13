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
import com.aurea.automation.codegraph.oa3.models.Attribute;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExtendedAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-06T13:09:18.696+05:30[Asia/Kolkata]")
public class ExtendedAttribute extends Attribute {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAYER_ID = "layerId";
  @SerializedName(SERIALIZED_NAME_LAYER_ID)
  private String layerId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_LAYER_CODE_ENTRY_POINT = "layerCodeEntryPoint";
  @SerializedName(SERIALIZED_NAME_LAYER_CODE_ENTRY_POINT)
  private String layerCodeEntryPoint;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_STACK_ID = "stackId";
  @SerializedName(SERIALIZED_NAME_STACK_ID)
  private String stackId;

  public ExtendedAttribute id(String id) {
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

  public ExtendedAttribute layerId(String layerId) {
    this.layerId = layerId;
    return this;
  }

   /**
   * Get layerId
   * @return layerId
  **/
  @ApiModelProperty(value = "")
  public String getLayerId() {
    return layerId;
  }

  public void setLayerId(String layerId) {
    this.layerId = layerId;
  }

  public ExtendedAttribute version(Integer version) {
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

  public ExtendedAttribute layerCodeEntryPoint(String layerCodeEntryPoint) {
    this.layerCodeEntryPoint = layerCodeEntryPoint;
    return this;
  }

   /**
   * Get layerCodeEntryPoint
   * @return layerCodeEntryPoint
  **/
  @ApiModelProperty(value = "")
  public String getLayerCodeEntryPoint() {
    return layerCodeEntryPoint;
  }

  public void setLayerCodeEntryPoint(String layerCodeEntryPoint) {
    this.layerCodeEntryPoint = layerCodeEntryPoint;
  }

  public ExtendedAttribute active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public ExtendedAttribute selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

   /**
   * Get selfLink
   * @return selfLink
  **/
  @ApiModelProperty(value = "")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public ExtendedAttribute kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ExtendedAttribute stackId(String stackId) {
    this.stackId = stackId;
    return this;
  }

   /**
   * Get stackId
   * @return stackId
  **/
  @ApiModelProperty(value = "")
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
    ExtendedAttribute extendedAttribute = (ExtendedAttribute) o;
    return Objects.equals(this.id, extendedAttribute.id) &&
        Objects.equals(this.layerId, extendedAttribute.layerId) &&
        Objects.equals(this.version, extendedAttribute.version) &&
        Objects.equals(this.layerCodeEntryPoint, extendedAttribute.layerCodeEntryPoint) &&
        Objects.equals(this.active, extendedAttribute.active) &&
        Objects.equals(this.selfLink, extendedAttribute.selfLink) &&
        Objects.equals(this.kind, extendedAttribute.kind) &&
        Objects.equals(this.stackId, extendedAttribute.stackId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, layerId, version, layerCodeEntryPoint, active, selfLink, kind, stackId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedAttribute {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    layerCodeEntryPoint: ").append(toIndentedString(layerCodeEntryPoint)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
