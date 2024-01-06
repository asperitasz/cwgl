package com.ssm.core.po;
                /**
                  * 
                  * @author
                  *
                  */
               public class Userinfo {private int id;
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}private String username;
public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}private String password;
public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}public Userinfo(int id,String username,String password) {
		super();
		this.id = id;
this.username = username;
this.password = password;

	}

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
