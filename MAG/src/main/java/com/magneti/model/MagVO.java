package com.magneti.model;

public class MagVO {
	
	public String member_id;
	public String pw;
	public String name;
	public String nick;
	public String age;
	public String gender;
	public String type;
	
	public MagVO() {	
	}
	
	public MagVO(String member_id, String pw, String name, String nick, String age, String gender, String type) {
		super();
		this.member_id = member_id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
		this.age = age;
		this.gender = gender;
		this.type = type;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
