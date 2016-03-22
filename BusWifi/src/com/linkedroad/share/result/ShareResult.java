package com.linkedroad.share.result;

import com.linkedroad.util.constants.Constants;

/**
 * 
 * @author Jason Yeoh
 *
 */
public class ShareResult {
  private String status;

  public ShareResult() {
    this.status = Constants.LINKEDROAD_OK;
  }

  public ShareResult(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
