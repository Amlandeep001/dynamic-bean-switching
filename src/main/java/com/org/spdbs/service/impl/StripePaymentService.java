package com.org.spdbs.service.impl;

import org.springframework.stereotype.Service;

import com.org.spdbs.service.PaymentService;

import lombok.extern.log4j.Log4j2;

@Service("stripe")
@Log4j2
public class StripePaymentService implements PaymentService
{
	@Override
	public String pay(String amount, String mode, String sender, String receiver)
	{
		// Simulate payment processing logic
		log.info("Processing payment with Stripe: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
		return "paid with stripe " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
	}
}
