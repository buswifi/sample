package com.linkedroad.util.payload;

/**
 * 
 * @author Zhiting Yang
 * 
 */
public interface Payload {

  /** reset the payload for reuse */
  void reset();

  void activate(boolean active);

  void getStageName();
}
