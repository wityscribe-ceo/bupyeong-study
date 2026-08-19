package com.the.ex;
import java.util.ArrayList;
import java.util.Iterator;
import com.the.dto.Rect;

public class Java0819Ex2 {
 public static void main(String[] args) {
	  ArrayList<Rect> list=new ArrayList<Rect>();
	  list.add(new Rect(11,11));
	  list.add(new Rect(12,11));
	  list.add(new Rect(11,31));
	  list.add(new Rect(14,11));
	  list.add(new Rect(11,51));
	  list.add(new Rect(16,11));
	  
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i));
	  }
	  System.out.println("-------------------");
	  
	  list.add(2,new Rect(99,99));
	  for(Rect r:list) {
		  System.out.println(r);
	  }
	  System.out.println("-------------------");
	  
	  
	  list.remove(2);
	  list.remove(new Rect(11,31));
	  for(Rect r:list) {
		  System.out.println(r);	 
	}
	  System.out.println("-------------------");
	  
	  int index=list.indexOf(new Rect(14,11));
	  System.out.println(index);
	  
	  System.out.println(list.contains(new Rect(11,51)));
	  System.out.println(list.contains(new Rect(22,51)));
	  System.out.println(list.isEmpty());
	  
	  list.set(2,new Rect(22,22));
	  Iterator<Rect> iter=list.iterator();
	  while(iter.hasNext()) {
		  System.out.println(iter.next());
	  }
 

	  
  }
}