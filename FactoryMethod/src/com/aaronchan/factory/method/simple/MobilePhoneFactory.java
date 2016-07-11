package com.aaronchan.factory.method.simple;

public class MobilePhoneFactory {
	public MobilePhone produce(String os) {
		MobilePhone mobilePhone = null;
		if (os != null) {
			if (os.equalsIgnoreCase("android")) {
				mobilePhone = new AndroidPhone();
			} else if (os.equalsIgnoreCase("ios")) {
				mobilePhone = new IOSPhone();
			}
		}

		return mobilePhone;
	}
}
