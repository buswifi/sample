package com.linkedroad.wifi.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.linkedroad.util.exception.PipelineException;
//import com.linkedroad.wifi.payload.impl.WifiLoginPayload;
import com.linkedroad.util.pipeline.Pipeline;
import com.linkedroad.wifi.payload.impl.CustomerLoginPayload;


@Path("/wifi/")
public class WifiRESTfulService {
	  private static final Logger logger = LoggerFactory.getLogger(WifiRESTfulService.class);

	  @Autowired
	  @Qualifier("customerLoginPipeline")
	  private Pipeline<CustomerLoginPayload> customerLoginPipeline;
	
	  @GET
	  @Path("login/customer")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public String loginAsWIFIGuest() {
	    String result = "testing";
	    CustomerLoginPayload payload = null;
	    try {
	      payload = customerLoginPipeline.createPayload();
	      payload.init();
	      //payload.setEmail(guest.getEmail());
	     // payload.setPhoneNumber(guest.getPhoneNumber());
	      customerLoginPipeline.executeSynchronous(payload);
	     // result = GsonUtil.getJson(payload.getResult());
	      customerLoginPipeline.executeAsynchronous(payload);
	    } catch (PipelineException e) {
	      if (logger.isErrorEnabled()) {
	        logger.error(e.getMessage());
	      }
	    }
	    return result;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
