package com.aaronchan.factory.method.simple;

public class MobilePhoneFactory {
	public MobilePhone produce(OS os) {
		MobilePhone mobilePhone = null;
		if (os == OS.Android) {
			mobilePhone = new AndroidPhone(os);
		} else if (os == OS.IOS) {
			mobilePhone = new IOSPhone(os);
		}
		return mobilePhone;
	}
}
