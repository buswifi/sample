package com.linkedroad.wifi.stage.sync.generateresult;

import org.springframework.stereotype.Component;

import com.linkedroad.wifi.payload.impl.CustomerLoginPayload;
import com.linkedroad.wifi.stage.WifiStage;

/**
 * 
 * @author Zhiting Yang
 * 
 */
@Component("generateCustomerLoginResultStage")
public class GenerateCustomerLoginResultStage extends WifiStage<CustomerLoginPayload>{

	@Override
	public void consume(CustomerLoginPayload payload) throws Exception {
		System.out.println("+++++++++++++++++generateCustomerLoginResultStage+++++++++++++");

	}

}
