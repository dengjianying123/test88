/**
 * ==与equals
 * @author djy QQ:523906275
 * @2020年7月1日
 *
 */
public class Demo3equals {

	public static void main(String[] args) {
		Demo3equals demo3equals1 =new Demo3equals();
		System.out.println(demo3equals1);
		Demo3equals demo3equals2 =new Demo3equals();
		System.out.println(demo3equals2);
		
		//int num = 9/0;//如出错误异常：后面的代码都无法执行
		
		String s1 = new String("顾俊琪");
		System.out.println(s1.getBytes());
		System.out.println(System.identityHashCode(s1));//内存地址输出
		String s2 = new String("顾俊琪");
		System.out.println(System.identityHashCode(s2));//内存地址输出
		System.out.println(s2.getBytes());
		String s3 = "顾俊琪";
		System.out.println(System.identityHashCode(s3));//s3与s4都是成员变量:内存地址输出是一样
		String s4 = "顾俊琪";
		System.out.println(System.identityHashCode(s4));
		
		System.out.println("==:"+(s1 == s2));//false:==比较的是内存的址址，然后经较值
		System.out.println("equals:"+s1.equals(s2));//true:只是比较值
		System.out.println("== s1与s3:"+(s1 == s3));
		System.out.println("equals s1与s3:"+(s1.equals(s3)));
		System.out.println("== s3与s4:"+(s3 == s4));
		
		//String 与int型做比较
		String password = "11";
		//= null;
		System.out.println(password.toString());//当内容为空时调用toString()方法,则会报NullPointerException空指针
				//"11";
		int rePassword = 11;
		//= 11;
		System.out.println(password.equals(rePassword));//password如为null,调用equlas方法也会报空指针错误NullPointerException
		//如果要转换，则需把password转换成int类型(了解)
		System.out.println(Integer.parseInt(password) == rePassword);//java.lang.NumberFormatException: For input string: "中"或""
		System.out.println(Integer.valueOf(password) == rePassword);
		
		String str2 = String.valueOf(rePassword);
		
		System.out.println(password.equals(str2));
		
		//int num = 9/0;//计算时被除数不能为零：ArithmeticException: / by zero
		//System.out.println(num);
		

	}

}
