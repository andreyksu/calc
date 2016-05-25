package com.gmail.andreyksu.initpack;

import java.util.Scanner;

import com.gmail.andreyksu.modelpack.CalcModel;
import com.gmail.andreyksu.modelpack.pefrormcalc.polishreversenotation.CalculatorWithRPN;

public class ClassForTestModel {

	static Scanner in = new Scanner(System.in);;

	public static void main(String[] args) {
		CalcModel cm = new CalcModel();
//		cm.setPerformCalc(new CalculatorWithRPN());
		System.out.println(cm.performCalc("-(2*(-08.0+2.0*(-5))/(-1+3*(-2)-(-4)))+4*2.0^2"));
		System.out.println(cm.performCalc("-(22*(-08.0+2.0*(-5))/(-1+3*(-2)-(-4^3)))"));
	
	}

}
