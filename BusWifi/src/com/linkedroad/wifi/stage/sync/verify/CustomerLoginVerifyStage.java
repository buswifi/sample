package com.linkedroad.wifi.stage.sync.verify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.linkedroad.wifi.payload.impl.CustomerLoginPayload;
import com.linkedroad.wifi.stage.WifiStage;

@Component("customerLoginVerifyStage")
public class CustomerLoginVerifyStage extends WifiStage<CustomerLoginPayload> {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(CustomerLoginVerifyStage.class);

	@Override
	public void consume(CustomerLoginPayload payload) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++customerLoginVerifyStage+++++++++++++");
	}
}
