package com.system2;

public class DevopsFactory {
	public final static CICD cicd =new CICD();
	public final static SCM scm =new SCM();
	public final static Docker docker =new Docker();
	
	public static  DevopsActivity getInstance(String activity) {
		switch(activity) {
		case "CICD":
			    return cicd;
		case "SCM":
			    return scm;
		case "DOCKER":
			    return docker;
		default:
			    return null;
		}
	}

}
