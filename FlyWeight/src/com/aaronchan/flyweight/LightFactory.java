package com.aaronchan.flyweight;

import java.util.EnumMap;

public class LightFactory {
	private EnumMap<LightType, Light> lights;

	public LightFactory() {
		lights = new EnumMap<>(LightType.class);
	}

	public Light getLight(LightType lightType) {
		Light light = lights.get(lightType);
		if (light == null) {
			switch (lightType) {
			case BLUE:
				light = new BlueLighter();
				break;
			case GREEN:
				light = new GreenLighter();
				break;
			case RED:
				light = new RedLighter();
				break;
			default:
				break;
			}
			lights.put(lightType, light);
		}
		return light;

	}

}
