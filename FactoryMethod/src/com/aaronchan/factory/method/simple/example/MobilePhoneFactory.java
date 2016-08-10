package com.aaronchan.factory.method.simple.example;

public class MobilePhoneFactory {
	public MobilePhone produce(String os) {
		MobilePhone mobilePhone = null;
		if ("android".equalsIgnoreCase(os)) {
			mobilePhone = new AndroidPhone();
		} else if ("ios".equalsIgnoreCase(os)) {
			mobilePhone = new IOSPhone();
		}
		return mobilePhone;
	}
}
