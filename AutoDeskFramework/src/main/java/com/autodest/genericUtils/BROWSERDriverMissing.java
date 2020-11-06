package com.autodest.genericUtils;

public class BROWSERDriverMissing extends IllegalStateException{
	BROWSERDriverMissing(IllegalStateException e){
		System.err.println("BROWSERDriver.exe jar is missing in your Project ==>");
		e.printStackTrace();
		
	}
}
