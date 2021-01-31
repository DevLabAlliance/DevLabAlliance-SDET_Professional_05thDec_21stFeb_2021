package com.devlabs.serviceNow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.devlabs.testng.base.ProjectGenericWrappers;

public class TC001_LoginLogOut extends ProjectGenericWrappers{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login using valid username and password";
		nodes = "Login";
		authors = "Devlabs";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogout(String uName, String pwd) {
				
	}


}





