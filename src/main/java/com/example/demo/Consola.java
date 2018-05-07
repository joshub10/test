package com.example.demo;

import java.util.Enumeration;


public class Consola {

	
	public static void mensaje(Object men) {
		String clas=Thread.currentThread().getStackTrace()[2].getClassName();
		String method=Thread.currentThread().getStackTrace()[2].getMethodName();
		
		System.out.println("["+clas+":"+method+"]\n\t"+men);
		
		
//		 ClassPool pool = ClassPool.getDefault();
//	        CtClass cc = pool.get("com.quaternion.demo.Widget");
//	        CtMethod methodX = cc.getDeclaredMethod("x");
//	        int xlineNumber = methodX.getMethodInfo().getLineNumber(0);
//	        System.out.println("method x is on line " + xlineNumber + "\n");
		
		
	}
	public static void errorMensaje(String men) {
		String clas=Thread.currentThread().getStackTrace()[2].getClassName();
		String method=Thread.currentThread().getStackTrace()[2].getMethodName();
		
		System.out.println("!!ERROR ["+clas+":"+method+"]\n\t"+men);
	}
	public static void errorMensaje(Exception e) {
		String clas=Thread.currentThread().getStackTrace()[2].getClassName();
		String method=Thread.currentThread().getStackTrace()[2].getMethodName();
		
		System.out.println("!!ERROR ["+clas+":"+method+"]\n\t"+e.toString());
		e.printStackTrace();
	}
	
}
