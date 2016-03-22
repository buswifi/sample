package com.linkedroad.wifi.stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linkedroad.util.stage.Stage;
import com.linkedroad.wifi.payload.WifiPayload;

public abstract class WifiStage <P extends WifiPayload<?>> implements Stage<P> {
	  private static final Logger logger = LoggerFactory.getLogger(WifiStage.class);

	  public boolean report(Stage<P> stage, P payload) {
		    boolean isOK = true;
		    if (logger.isDebugEnabled()) {
		      if (stage != null) {
		        logger.debug("[Stage name] - " + stage.getClass().getSimpleName());
		        if ((payload != null) && (payload.getStatus() != null) && (payload.abnormal())) {
		          logger.debug("<Alert> " + payload.getClass().getSimpleName() + " is abnormal: "
		              + payload.getStatus());
		        }
		      }
		    }

		    if (stage != null) {
		      if ((payload != null) && (payload.getStatus() != null) && (payload.abnormal())) {
		        isOK = false;
		      }
		    }
		    return isOK;
	  }
}
