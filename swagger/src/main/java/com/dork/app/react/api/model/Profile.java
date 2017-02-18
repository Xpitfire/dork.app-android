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
import com.dork.app.react.api.model.ContactInfo;
import com.dork.app.react.api.model.Content;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Profile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-18T18:49:45.404+01:00")
public class Profile {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("image")
  private Content image = null;

  @SerializedName("friendIds")
  private List<String> friendIds = new ArrayList<String>();

  /**
   * Gets or Sets invitationOptions
   */
  public enum InvitationOptionsEnum {
    @SerializedName("0")
    NUMBER_0(0),
    
    @SerializedName("1")
    NUMBER_1(1),
    
    @SerializedName("2")
    NUMBER_2(2),
    
    @SerializedName("3")
    NUMBER_3(3),
    
    @SerializedName("4")
    NUMBER_4(4),
    
    @SerializedName("5")
    NUMBER_5(5);

    private Integer value;

    InvitationOptionsEnum(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("invitationOptions")
  private InvitationOptionsEnum invitationOptions = null;

  @SerializedName("contactInfo")
  private ContactInfo contactInfo = null;

  @SerializedName("id")
  private String id = null;

  public Profile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Profile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Profile image(Content image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(example = "null", value = "")
  public Content getImage() {
    return image;
  }

  public void setImage(Content image) {
    this.image = image;
  }

  public Profile friendIds(List<String> friendIds) {
    this.friendIds = friendIds;
    return this;
  }

  public Profile addFriendIdsItem(String friendIdsItem) {
    this.friendIds.add(friendIdsItem);
    return this;
  }

   /**
   * Get friendIds
   * @return friendIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getFriendIds() {
    return friendIds;
  }

  public void setFriendIds(List<String> friendIds) {
    this.friendIds = friendIds;
  }

  public Profile invitationOptions(InvitationOptionsEnum invitationOptions) {
    this.invitationOptions = invitationOptions;
    return this;
  }

   /**
   * Get invitationOptions
   * @return invitationOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public InvitationOptionsEnum getInvitationOptions() {
    return invitationOptions;
  }

  public void setInvitationOptions(InvitationOptionsEnum invitationOptions) {
    this.invitationOptions = invitationOptions;
  }

  public Profile contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Profile id(String id) {
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
    Profile profile = (Profile) o;
    return Objects.equals(this.firstName, profile.firstName) &&
        Objects.equals(this.lastName, profile.lastName) &&
        Objects.equals(this.image, profile.image) &&
        Objects.equals(this.friendIds, profile.friendIds) &&
        Objects.equals(this.invitationOptions, profile.invitationOptions) &&
        Objects.equals(this.contactInfo, profile.contactInfo) &&
        Objects.equals(this.id, profile.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, image, friendIds, invitationOptions, contactInfo, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    friendIds: ").append(toIndentedString(friendIds)).append("\n");
    sb.append("    invitationOptions: ").append(toIndentedString(invitationOptions)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
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

