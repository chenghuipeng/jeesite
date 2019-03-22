package com.thinkgem.jeesite.test;

import com.thinkgem.jeesite.modules.sys.entity.Office;

import java.util.Date;
import java.util.HashSet;

public class Test2 {

	private transient Office company;	// 归属公司
	private transient Office office;	// 归属部门
	private String loginName;// 登录名
	private String password;// 密码
	private String no;		// 工号
	private String name;	// 姓名
	private String email;	// 邮箱
	private String phone;	// 电话
	private String mobile;	// 手机
	private String userType;// 用户类型
	private String loginIp;	// 最后登陆IP
	private Date loginDate;	// 最后登陆日期
	private String loginFlag;	// 是否允许登陆
	private String photo;	// 头像


	public static void main(String[] args) {
		//测试文件
		String a = new String("ab"); // a 为一个引用
		String b = new String("ab"); // b为另一个引用,对象的内容一样
		String aa = "ab"; // 放在常量池中
		String bb = "ab"; // 从常量池中查找

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		if (aa == bb) // true
			System.out.println("aa==bb");
		if (a == b) // false，非同一对象
			System.out.println("a==b");
		if (a.equals(b)) // true
			System.out.println("aEQb");
		if (42 == 42.0) { // true
			System.out.println("true");
		}


		HashSet hs ;








	}
}
