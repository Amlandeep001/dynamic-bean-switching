package com.org.spdbs.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentRequest
{
	String amount;
	String paymentType;
	String sender;
	String receiver;
}
