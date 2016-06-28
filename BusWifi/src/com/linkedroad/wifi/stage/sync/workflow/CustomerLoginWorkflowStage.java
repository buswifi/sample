package com.linkedroad.wifi.stage.sync.workflow;

import org.springframework.stereotype.Component;

import com.linkedroad.wifi.payload.impl.CustomerLoginPayload;
import com.linkedroad.wifi.stage.WifiStage;

/**
 * 
 * @author Zhiting Yang
 * 
 */
@Component("customerLoginWorkflowStage")
public class CustomerLoginWorkflowStage extends WifiStage<CustomerLoginPayload>{

	@Override
	public void consume(CustomerLoginPayload payload) throws Exception {
		System.out.println("+++++++++++++++++customerLoginWorkflowStage+++++++++++++");
	}

}
