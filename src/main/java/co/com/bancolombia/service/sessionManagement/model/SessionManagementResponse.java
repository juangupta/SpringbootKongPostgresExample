package co.com.bancolombia.service.sessionManagement.model;

import java.util.Objects;
import co.com.bancolombia.service.sessionManagement.model.Header;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SessionManagementResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-17T09:04:15.518-05:00")

public class SessionManagementResponse   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("accessToken")
  private String accessToken = null;

  @JsonProperty("expireIn")
  private String expireIn = null;

  @JsonProperty("refreshToken")
  private String refreshToken = null;
  
  public SessionManagementResponse header(Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public SessionManagementResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(value = "")


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public SessionManagementResponse expireIn(String expireIn) {
    this.expireIn = expireIn;
    return this;
  }

  /**
   * Get expireIn
   * @return expireIn
  **/
  @ApiModelProperty(value = "")


  public String getExpireIn() {
    return expireIn;
  }

  public void setExpireIn(String expireIn) {
    this.expireIn = expireIn;
  }

  public SessionManagementResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")


  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionManagementResponse sessionManagementResponse = (SessionManagementResponse) o;
    return Objects.equals(this.header, sessionManagementResponse.header) &&
        Objects.equals(this.accessToken, sessionManagementResponse.accessToken) &&
        Objects.equals(this.expireIn, sessionManagementResponse.expireIn) &&
        Objects.equals(this.refreshToken, sessionManagementResponse.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, accessToken, expireIn, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionManagementResponse {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expireIn: ").append(toIndentedString(expireIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

