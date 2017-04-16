package jsftest;

import java.io.Serializable;

public class ApplicationStatus implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int value =0;

public Integer getCounter(){
	return ++value;
}
void init(){
	System.err.println("Create"+ this);
}
void close(){
	System.err.println("Close"+ this);
}
}
