package com.linkedroad.wifi.payload.impl;

import com.linkedroad.share.model.wifi.Customer;
import com.linkedroad.wifi.payload.WifiPayload;
import com.linkedroad.wifi.result.impl.CustomerLoginResult;

/**
 * 
 * @author Jason Yeoh
 * 
 */
public class CustomerLoginPayload extends WifiPayload<CustomerLoginResult> {
  private Customer guest;
  boolean isNewGuest = false;

  public void init() {
    this.guest = null;
    this.isNewGuest = false;
  }

  public Customer getGuest() {
    return guest;
  }

  public void setGuest(Customer guest) {
    this.guest = guest;
  }

  public boolean getIsNewGuest() {
    return isNewGuest;
  }

  public void setIsNewGuest(boolean isNewGuest) {
    this.isNewGuest = isNewGuest;
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
