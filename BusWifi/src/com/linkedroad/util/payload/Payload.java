package com.linkedroad.util.payload;

public interface Payload {

  /** reset the payload for reuse */
  void reset();

  void activate(boolean active);

  void getStageName();
}
