package com.aaronchan.mediator.exampleA;

public class ShowImpl implements Show {
	private Leading mLeading;
	private GoodFriend mFriend;
	private Enemy mEnemy;

	public void setLeading(Leading leading) {
		mLeading = leading;
		mLeading.joinShow(this);
	}

	public void setGoodFriend(GoodFriend goodFriend) {
		mFriend = goodFriend;
		mFriend.joinShow(this);
	}

	public void setEnemy(Enemy enemy) {
		mEnemy = enemy;
		mEnemy.joinShow(this);
	}

	@Override
	public void onRoleAction(Role role, Action action) {
		if (role == mLeading) {
			switch (action) {
			case CRY:
				mFriend.comfort(role);
				mEnemy.simle(role);
				break;
			case GET_GOOD_MARKS:
				mFriend.simle(role);
				mEnemy.angry(role);
				break;
			default:
				break;
			}

		} else if (role == mFriend) {
			switch (action) {
			case CRY:
				mLeading.comfort(role);
				mEnemy.simle(role);
				break;
			case GET_GOOD_MARKS:
				mLeading.simle(role);
				mEnemy.angry(role);
				break;
			default:
				break;
			}

		} else if (role == mEnemy) {
			switch (action) {
			case CRY:
				mLeading.comfort(role);
				mFriend.comfort(role);
				break;
			case GET_GOOD_MARKS:
				mFriend.simle(role);
				mLeading.simle(role);
				break;
			default:
				break;
			}

		}
	}

}
