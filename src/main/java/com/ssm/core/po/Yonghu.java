package com.ssm.core.po;
                /**
                  * 
                  * @author
                  *
                  */
               public class Yonghu {private int id;
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
	}private String name;
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}private String sex;
public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}private int age;
public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}private float jibengongzi;
public float getJibengongzi() {
		return jibengongzi;
	}

	public void setJibengongzi(float jibengongzi) {
		this.jibengongzi = jibengongzi;
	}private float gongjijingerenjine;
public float getGongjijingerenjine() {
		return gongjijingerenjine;
	}

	public void setGongjijingerenjine(float gongjijingerenjine) {
		this.gongjijingerenjine = gongjijingerenjine;
	}private float gongjijinzongjine;
public float getGongjijinzongjine() {
		return gongjijinzongjine;
	}

	public void setGongjijinzongjine(float gongjijinzongjine) {
		this.gongjijinzongjine = gongjijinzongjine;
	}public Yonghu(int id,String username,String password,String name,String sex,int age,float jibengongzi,float gongjijingerenjine,float gongjijinzongjine) {
		super();
		this.id = id;
this.username = username;
this.password = password;
this.name = name;
this.sex = sex;
this.age = age;
this.jibengongzi = jibengongzi;
this.gongjijingerenjine = gongjijingerenjine;
this.gongjijinzongjine = gongjijinzongjine;

	}

	public Yonghu() {
		super();
		// TODO Auto-generated constructor stub
	}
}
