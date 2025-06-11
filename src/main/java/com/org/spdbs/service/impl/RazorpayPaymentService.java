package com.org.spdbs.service.impl;

import org.springframework.stereotype.Service;

import com.org.spdbs.service.PaymentService;

import lombok.extern.log4j.Log4j2;

@Service("razorpay")
@Log4j2
public class RazorpayPaymentService implements PaymentService
{
	@Override
	public String pay(String amount, String mode, String sender, String receiver)
	{
		log.info("Processing payment with Razorpay: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
		return "paid with razorpay " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
	}
}
