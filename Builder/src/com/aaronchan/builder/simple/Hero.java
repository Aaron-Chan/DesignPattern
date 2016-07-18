package com.aaronchan.builder.simple;

public class Hero {
	private final BodyType bodyType;
	private final HairStyle hairStyle;
	private final Profession profession;
	private final String name;

	public BodyType getBodyType() {
		return bodyType;
	}

	public HairStyle getHairStyle() {
		return hairStyle;
	}

	public Profession getProfession() {
		return profession;
	}

	public String getName() {
		return name;
	}

	public Hero(Builder builder) {
		super();
		this.bodyType = builder.bodyType;
		this.hairStyle = builder.hairStyle;
		this.profession = builder.profession;
		this.name = builder.name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This is a ").append(profession).append(" named ").append(name);
		if (hairStyle != null) {
			sb.append(" with ");
			if (hairStyle != null) {
				sb.append(hairStyle).append(' ');
			}
		}
		if (bodyType != null) {
			sb.append(" bodyType ").append(bodyType);
		}
		sb.append('.');
		return sb.toString();
	}

	public static class Builder {
		private final String name;
		private BodyType bodyType;
		private HairStyle hairStyle;
		private final Profession profession;

		public Builder(String name, Profession profession) {
			super();
			if (name == null || profession == null) {
				throw new IllegalArgumentException();
			}
			this.name = name;
			this.profession = profession;
		}

		public Builder withBodyType(BodyType bodyType) {
			this.bodyType = bodyType;
			return this;
		}

		public Builder withHairStyle(HairStyle hairStyle) {
			this.hairStyle = hairStyle;
			return this;
		}

		public Hero build() {
			return new Hero(this);
		}

	}

}
