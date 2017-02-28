/*
 * API V1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.dork.app.react.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Content
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-18T18:49:45.404+01:00")
public class Content {
  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("mediaId")
  private String mediaId = null;

  @SerializedName("thumbnailId")
  private String thumbnailId = null;

  @SerializedName("id")
  private String id = null;

  public Content mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Content size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Content mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public Content thumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
    return this;
  }

   /**
   * Get thumbnailId
   * @return thumbnailId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThumbnailId() {
    return thumbnailId;
  }

  public void setThumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
  }

  public Content id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.mimeType, content.mimeType) &&
        Objects.equals(this.size, content.size) &&
        Objects.equals(this.mediaId, content.mediaId) &&
        Objects.equals(this.thumbnailId, content.thumbnailId) &&
        Objects.equals(this.id, content.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeType, size, mediaId, thumbnailId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    thumbnailId: ").append(toIndentedString(thumbnailId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
