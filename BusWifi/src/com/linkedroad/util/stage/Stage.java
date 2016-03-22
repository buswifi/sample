package com.linkedroad.util.stage;

import com.linkedroad.util.payload.Payload;

public interface Stage <P extends Payload>{
	  void consume(P payload) throws Exception;

	  // reports the current state of the pipeline stage
	  boolean report(Stage<P> stage, P payload);
}
