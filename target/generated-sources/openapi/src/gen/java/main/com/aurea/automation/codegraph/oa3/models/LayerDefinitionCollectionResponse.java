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
import com.aurea.automation.codegraph.oa3.models.ExtendedAttribute;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LayerDefinitionCollectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-06T13:09:18.696+05:30[Asia/Kolkata]")
public class LayerDefinitionCollectionResponse {
  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<ExtendedAttribute> contents = null;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public LayerDefinitionCollectionResponse contents(List<ExtendedAttribute> contents) {
    this.contents = contents;
    return this;
  }

  public LayerDefinitionCollectionResponse addContentsItem(ExtendedAttribute contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<ExtendedAttribute>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @ApiModelProperty(value = "")
  public List<ExtendedAttribute> getContents() {
    return contents;
  }

  public void setContents(List<ExtendedAttribute> contents) {
    this.contents = contents;
  }

  public LayerDefinitionCollectionResponse kind(String kind) {
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

  public LayerDefinitionCollectionResponse selfLink(String selfLink) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerDefinitionCollectionResponse layerDefinitionCollectionResponse = (LayerDefinitionCollectionResponse) o;
    return Objects.equals(this.contents, layerDefinitionCollectionResponse.contents) &&
        Objects.equals(this.kind, layerDefinitionCollectionResponse.kind) &&
        Objects.equals(this.selfLink, layerDefinitionCollectionResponse.selfLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, kind, selfLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerDefinitionCollectionResponse {\n");
    
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
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
