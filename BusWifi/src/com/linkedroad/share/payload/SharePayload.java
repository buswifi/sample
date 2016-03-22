package com.linkedroad.share.payload;

import com.linkedroad.share.result.ShareResult;
import com.linkedroad.util.constants.Constants;
import com.linkedroad.util.constants.Constants.AccountType;
import com.linkedroad.util.payload.Payload;

/**
 * 
 * @author Jason Yeoh
 * 
 * @param <R>
 */
public class SharePayload<R extends ShareResult> implements Payload {

  private String url;
  private String sessionKey;
  private Long userId;
  private String email;
  private String status = Constants.LINKEDROAD_OK;
  private R result = null;
  private AccountType accountType;

  public void init() {
    this.url = null;
    this.sessionKey = null;
    this.userId = null;
    this.email = null;
    this.status = Constants.LINKEDROAD_OK;
    this.result = null;
    this.accountType = Constants.AccountType.USER;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public R getResult() {
    return result;
  }

  public void setResult(R result) {
    this.result = result;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  @Override
  public void reset() {
    this.sessionKey = null;
    this.userId = null;
    this.email = null;
    this.status = null;
    this.result = null;
    this.accountType = Constants.AccountType.USER;
  }

  public boolean abnormal() {
    return !Constants.LINKEDROAD_OK.equals(getStatus());
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
