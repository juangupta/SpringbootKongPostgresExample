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
 * SessionManagementRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-17T09:04:15.518-05:00")

public class SessionManagementRequest   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("captchaToken")
  private String captchaToken = null;

  public SessionManagementRequest header(Header header) {
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

  public SessionManagementRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SessionManagementRequest captchaToken(String captchaToken) {
    this.captchaToken = captchaToken;
    return this;
  }

  /**
   * Get captchaToken
   * @return captchaToken
  **/
  @ApiModelProperty(required = false, value = "")
  @NotNull


  public String getCaptchaToken() {
    return captchaToken;
  }

  public void setCaptchaToken(String captchaToken) {
    this.captchaToken = captchaToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionManagementRequest sessionManagementRequest = (SessionManagementRequest) o;
    return Objects.equals(this.header, sessionManagementRequest.header) &&
        Objects.equals(this.userId, sessionManagementRequest.userId) &&
        Objects.equals(this.captchaToken, sessionManagementRequest.captchaToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, userId, captchaToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionManagementRequest {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    captchaToken: ").append(toIndentedString(captchaToken)).append("\n");
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

