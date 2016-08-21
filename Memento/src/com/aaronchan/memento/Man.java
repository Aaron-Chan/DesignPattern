package com.aaronchan.memento;

public class Man {
	private int attackPower;
	private int defencePower;
	private static final int MAX = 100;
	private static final int MIN = 0;

	public Man(int attackPower, int defencePower) {
		super();
		this.attackPower = attackPower;
		this.defencePower = defencePower;
	}

	public void attackPowerIncrease(int increaseAttackPower) {
		attackPower += increaseAttackPower;
		if (attackPower > MAX) {
			attackPower = MAX;
		}
	}

	public void attackPowerDecrease(int decreaseAttackPower) {
		attackPower -= decreaseAttackPower;
		if (attackPower < MIN) {
			attackPower = MIN;
		}
	}

	public void defencePowerIncrease(int increaseDefencePower) {
		defencePower += increaseDefencePower;
		if (defencePower > MAX) {
			defencePower = MAX;
		}
	}

	public void defencePowerDecrease(int decreaseDefencePower) {
		defencePower -= decreaseDefencePower;
		if (defencePower < MIN) {
			defencePower = MIN;
		}
	}

	public ManMemento getMemento() {
		ManMementoInternal manMemento = new ManMementoInternal();
		manMemento.setAttackPower(attackPower);
		manMemento.setDefencePower(defencePower);
		return manMemento;
	}

	public void setMemento(ManMemento manMemento) {
		ManMementoInternal manMementoInternal = (ManMementoInternal) manMemento;
		this.attackPower = (manMementoInternal.getAttackPower());
		this.defencePower = (manMementoInternal.getDefencePower());
	}

	@Override
	public String toString() {
		return "Man attackPower:" + attackPower + ", defencePower:" + defencePower;
	}

	private static class ManMementoInternal implements ManMemento {
		private int attackPower;
		private int defencePower;

		public int getAttackPower() {
			return attackPower;
		}

		public void setAttackPower(int attackPower) {
			this.attackPower = attackPower;
		}

		public int getDefencePower() {
			return defencePower;
		}

		public void setDefencePower(int defencePower) {
			this.defencePower = defencePower;
		}

	}

}
