package com.aaronchan.command;

public class TV {
	private static final String[] CHANNELS = { "CCTV1", "CCTV2", "CCTV3", "CCTV4", "CCTV5", "BBC", "NBC", "ABC",
			"NHK" };
	private int index;

	public void nextChannel() {
		index++;
		if (index >= CHANNELS.length)
			index = 0;
	};

	public void previousChannel() {
		index--;
		if (index < 0)
			index = CHANNELS.length - 1;
	};

	public String getCurrentChannel() {
		return CHANNELS[index];
	}

	public void showChannel(String previousChannel) {
		for (int i = 0; i < CHANNELS.length; i++) {
			if (previousChannel == CHANNELS[i]) {
				index = i;
				break;
			}
		}

	}

}
