package com.sun.newproperty.test;

import com.sun.newproperty.util.Constructor;
import com.sun.newproperty.util.FunctionInterfaceTest;
import com.sun.newproperty.util.InstanceAndStaticVariable;
import com.sun.newproperty.util.ScopeAndPartVariable;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FunctionInterfaceTest.test();
		//Constructor.test();
		//ScopeAndPartVariable.testFir();
		//ScopeAndPartVariable.testSec();
		InstanceAndStaticVariable ins = new InstanceAndStaticVariable();
		ins.testScopes();
	}

}
