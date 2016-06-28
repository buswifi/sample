package com.linkedroad.wifi.result.impl;

import com.linkedroad.wifi.result.WifiResult;
import com.linkedroad.util.constants.Constants;

/**
 * 
 * @author Jason Yeoh
 * 
 */
public class CustomerLoginResult  extends WifiResult{

  private Long userId;
  private String sessionKey;
  private String email;
  private String phoneNumber;
  private String address;
  private String city;
  private String state;
  private String zip;
  private String country;

  public CustomerLoginResult() {
    super();
  }

  public CustomerLoginResult(String status) {
    if (status != Constants.LINKEDROAD_OK) {
      this.userId = null;
      this.sessionKey = null;
      this.email = null;
      this.phoneNumber = null;
      this.address = null;
      this.city = null;
      this.state = null;
      this.zip = null;
      this.country = null;
    }
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
