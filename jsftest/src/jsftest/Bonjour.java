package jsftest;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bonjour {
	private String msg="Bonjout tt le monde!";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
