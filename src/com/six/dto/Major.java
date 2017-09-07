package com.six.dto;

public class Major {
	private Integer mid;
	private String mpath;
	private Integer cid;
	private String  theme;
	private String Nickname;
	private String Avatar;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMpath() {
		return mpath;
	}
	public void setMpath(String mpath) {
		this.mpath = mpath;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public String getAvatar() {
		return Avatar;
	}
	public void setAvatar(String avatar) {
		Avatar = avatar;
	}
	public Major() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Major(Integer mid, String mpath, Integer cid, String theme, String nickname, String avatar) {
		this.mid = mid;
		this.mpath = mpath;
		this.cid = cid;
		this.theme = theme;
		Nickname = nickname;
		Avatar = avatar;
	}
	@Override
	public String toString() {
		return "Major [mid=" + mid + ", mpath=" + mpath + ", cid=" + cid + ", theme=" + theme + ", Nickname=" + Nickname
				+ ", Avatar=" + Avatar + "]";
	}
	

}
