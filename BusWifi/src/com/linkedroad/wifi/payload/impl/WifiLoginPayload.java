package com.linkedroad.wifi.payload.impl;

import com.linkedroad.wifi.payload.WifiPayload;
import com.linkedroad.wifi.result.impl.WifiLoginResult;

/**
 * 
 * @author Zhiting Yang
 * 
 */
public class WifiLoginPayload extends WifiPayload<WifiLoginResult> {

  private String password;
  
  public void init() {
    this.password = null;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void activate(boolean active) {
    // TODO Auto-generated method stub
  }

  @Override
  public void getStageName() {
    // TODO Auto-generated method stub
  }
}
