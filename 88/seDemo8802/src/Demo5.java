/**
 * 把if改造成三目运算符
 *  
 * @author djy QQ:523906275
 * @2020年7月2日
 *
 */
public class Demo5 {

	public static void main(String[] args) {
		String logname = "高雨生1高级大佬";//登录名称
		System.out.println("length:"+logname.length());
		System.out.println("indexOf:"+logname.indexOf("高"));//从索引位置从0开始
		System.out.println("lastIndexOf:"+logname.lastIndexOf("高"));
		
		String dataLoginname = "高雨生";
				//"谢嘉愈";//存储姓名
		//System.out.println(logname.equals(dataLoginname));
		
		String pwd = "d999999";
		String dataPwd = "d999999";
		System.out.println(login(logname, dataLoginname, pwd, dataPwd));
		System.out.println("=====0000000000000================");
		int day = 2;
		System.out.println(day == 2);//true
		System.out.println(day != 2);//false
		if(day == 2 ){//以判定的结果进行比较:true或false
			System.out.println("今天是周二");
		}else{
			System.out.println("今天不是周二");
		}
		
		System.out.println("========把前面的day == !=  2 修改成三目运算符=========");
		
		System.out.println(day == 2 ? "今天是周二" : "今天不是周二");
		
		System.out.println("========下面===============");
		
		
		
		//登录要求登录姓名与密码都要正确
		//System.out.println(!logname.equals(dataLoginname));
		System.out.println(logname.equals(dataLoginname) && false);//只要有一个不为true，则结果输出为false
		System.out.println("============且&&======================");
		System.out.println((logname.equals(dataLoginname)) && (pwd.equals(dataPwd)));
		System.out.println("============或||======================");
		System.out.println((logname.equals(dataLoginname)) || (pwd.equals(dataPwd)));
		System.out.println("============if条件判定======================");
		/*if((logname.equals(dataLoginname)) && (pwd.equals(dataPwd))){//条件成立之下，进入执行{}方法体
			System.out.println("登录成功");
		}else {//否则
			System.out.println("用户名或密码不正确");
		}*/
		
		boolean result = false;
		if((logname.equals(dataLoginname)) && (pwd.equals(dataPwd))){//条件成立之下，进入执行{}方法体
			result = true;
		}else {//否则
			result = false;
		}
		
		//System.out.println( 条件判定 ?　条件成立输出的结果 :条件失败输出的结果);
		System.out.println( (logname.equals(dataLoginname)) && (pwd.equals(dataPwd)) ? "登录成功" : "用户名或密码不正确");
	}
	
	public static boolean login(String logname,String dataLoginname,String pwd,String dataPwd) {
		boolean result = false;
		if((logname.equals(dataLoginname)) && (pwd.equals(dataPwd))){//条件成立之下，进入执行{}方法体
			result = true;
		}/*else {//否则
			result = false;
		}*/
		return result;
	}
	

}
