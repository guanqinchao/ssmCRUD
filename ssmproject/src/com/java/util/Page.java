package com.java.util;

 

public class Page {
	int start = 0;
	int count = 5;
	int last = 0;
	 
 	public int getStart() {
 		if(start<0) {
 			return 0;
 			}
 		return start;
 	}
	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}
  public void caculateLast(int total) {
	/* 能被5整除的，最後一頁開始是 total -count*/
	  if(0==total%count) {
		  last=total-count;
	  }else {/* 不能被5整除的，最後一頁開始是 total -total%count*/
		  last =total-total%count;
	  }
  }
 
}
