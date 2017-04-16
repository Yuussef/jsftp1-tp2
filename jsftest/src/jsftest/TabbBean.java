package jsftest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.event.ActionEvent;


public class TabbBean {
	 private List myTabbList = new ArrayList<Tabb>();
	  public TabbBean() {
		  myTabbList.add(new Tabb("Youssef", "go"));
		  myTabbList.add(new Tabb("chahbi", "ok"));
	  }
	  public List<Tabb> getMyDataList() {
	    return myTabbList;
	  }
	  public void setMyDataList(List<Tabb> myTabbList) {
	    this.myTabbList = myTabbList;
	  }
	  public void process(ActionEvent event) {
		  Iterator it = myTabbList.iterator();
		  while (it.hasNext()){
	      System.out.println("nom=" + ((Tabb) it).getNom() + ", mdp=" + ((Tabb) it).getMdp());
	    }
	  }
}
