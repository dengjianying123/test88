/**
 * 比较运算方式(判定)
 * @author djy QQ:523906275
 * @2020年7月1日
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		//System.out.println(a = b);//b的值给a
		//System.out.println(a == b);//判定a是否等于b,如相等则为true,如不相等，则为false
		
		
		//两个字符串的值进行比较
		String loginName = "刘珊";
		//String loginName2 = "史佳铭";
		String loginName2 = "刘珊";
		//System.out.println(loginName == (loginName2+""));//false
		System.out.println(loginName == loginName2);
		//后面做登录功能时,使用equals方法比较
		System.out.println(loginName.equals(loginName2));//只会比较输出的值
		
	}

}
