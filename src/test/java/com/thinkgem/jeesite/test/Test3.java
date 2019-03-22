package com.thinkgem.jeesite.test;

import java.io.IOException;

public class Test3 {


	public Test3()
	{
		System.out.print("默认构造方法！--");
	}

	{
		System.out.print("非静态代码块！！--");
	}

	static {
		System.out.println("静态代码块！");
	}

	public static void test() {
		System.out.print("静态方法中的内容! --");
		{
			System.out.print("静态方法中的代码块！--");
		}

	}



	public static void main(String[] args) throws IOException {

		Test3 test = new Test3();

		Test3.test();//静态代码块！--静态方法中的内容! --静态方法中的代码块！--


	}






}




