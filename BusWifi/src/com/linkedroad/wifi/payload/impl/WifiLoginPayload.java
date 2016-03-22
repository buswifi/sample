package com.linkedroad.wifi.payload.impl;

//import com.linkedroad.share.dto.wifi.UserLoginDTO;
//import com.linkedroad.share.dto.wifi.UserRegisterDTO;
//import com.linkedroad.share.model.wifi.Wifi;
import com.linkedroad.wifi.payload.WifiPayload;
import com.linkedroad.wifi.result.impl.WifiLoginResult;

/**
 * 
 * @author jingchen
 * 
 */
public class WifiLoginPayload extends WifiPayload<WifiLoginResult> {

  private String password;
  //private User user;
  //private UserLoginDTO userLoginDTO;
  //private UserRegisterDTO userRegisterDTO;

  public void init() {
    this.password = null;
  //  this.user = null;
   // this.userLoginDTO = null;
   // this.userRegisterDTO = null;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
/*
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserLoginDTO getUserLoginDTO() {
    return userLoginDTO;
  }

  public void setUserLoginDTO(UserLoginDTO userLoginDTO) {
    this.userLoginDTO = userLoginDTO;
  }

  public UserRegisterDTO getUserRegisterDTO() {
    return userRegisterDTO;
  }

  public void setUserRegisterDTO(UserRegisterDTO userRegisterDTO) {
    this.userRegisterDTO = userRegisterDTO;
  }*/

  @Override
  public void activate(boolean active) {
    // TODO Auto-generated method stub
  }

  @Override
  public void getStageName() {
    // TODO Auto-generated method stub
  }
}
