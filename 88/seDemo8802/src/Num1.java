/**
 * 算术运算符
 * @author djy QQ:523906275
 * @2020年7月1日
 *
 */
public class Num1 {

	public static void main(String[] args) {
		//+,-,*,/,%,++,--
		/*multiplication(80, 9);
		remainder(20, 10);*/
		//selfAdd();
		//selfDel();
		selfOther();
		
		
	}
	
	//静态方法
	public static void selfOther() {
		int a = 3;
		int b = 6;
		
		//System.out.println(a+(++b));
		System.out.println((a++)+(++b));
		
		a += 8;//a = a+8
		System.out.println(a);
	}
	
	// --
	public static void selfDel() {
		int a = 10;
		System.out.println(a--);// 10
		System.out.println(a);// 9
		//System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);

	}
	
	//++
	public static void selfAdd() {
		int a = 10;
		a++;//后++
		System.out.println(a);
		
		//++a;//前++
		//System.out.println(++a);前加1,是12
		System.out.println(a++);//后加1,是11
		System.out.println(a);
	}
	
	
	
	//做乘法运算
	public static void multiplication(int a,int b) {
		System.out.println(a*b);
	}
	
	public static void remainder(int a,int b) {
		System.out.println("余数:"+a%b);
	}
	
	

}
