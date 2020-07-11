/**
 * 逻辑比较:
 *  ! 取反，非
 *  &&　且　与
 *  ||　或
 * @author djy QQ:523906275
 * @2020年7月2日
 *
 */
public class Demo4 {

	public static void main(String[] args) {
		String logname = "高雨生";//登录名称
		String dataLoginname = "高雨生";
				//"谢嘉愈";//存储姓名
		//System.out.println(logname.equals(dataLoginname));
		
		String pwd = "d999999";
		String dataPwd = "d999999";
		
		//登录要求登录姓名与密码都要正确
		//System.out.println(!logname.equals(dataLoginname));
		System.out.println(logname.equals(dataLoginname) && false);//只要有一个不为true，则结果输出为false
		System.out.println("============且&&======================");
		System.out.println((logname.equals(dataLoginname)) && (pwd.equals(dataPwd)));
		System.out.println("============或||======================");
		System.out.println((logname.equals(dataLoginname)) || (pwd.equals(dataPwd)));
		System.out.println("============if条件判定======================");
		if((logname.equals(dataLoginname)) && (pwd.equals(dataPwd))){//条件成立之下，进入执行{}方法体
			System.out.println("登录成功");
		}else {//否则
			System.out.println("用户名或密码不正确");
		}

	}

}
