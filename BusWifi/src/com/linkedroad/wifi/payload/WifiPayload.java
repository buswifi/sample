package com.linkedroad.wifi.payload;

import com.linkedroad.share.payload.SharePayload;
import com.linkedroad.wifi.result.WifiResult;

/**
 * 
 * @author Zhiting Yang
 * 
 */
public abstract class WifiPayload<R extends WifiResult> extends SharePayload<R> {

  private String phoneNumber;
  private String password;


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
