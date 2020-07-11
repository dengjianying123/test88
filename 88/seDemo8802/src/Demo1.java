/**
 * 面向过程(创建方法)
 * @author djy QQ:523906275
 * @2020年7月1日
 *
 */
public class Demo1 {

	//void不返回，main方法名称，参数类型String,参数名称：args
	public static void main(String[] args) {
		Game game = new Game();
		//此对象game不可以调用私有方法(private),protect受保护的方法是可以调用
		//game.downloadApp();
		System.out.println("开始...");
		//main的{}都属于方法体
		
		//调用求和的方法
		//sum();
		
		/*int sal = 8000;
		int sal2 = 9000;*/
		//sum2(8000, 9000);
		
		int result=sum3(10000, 20000);
		System.out.println(result);
		
		System.out.println("结束");
	}
	
	//创建一个求和的方法，给main方法调用
	public static void sum(){
		int sal = 5000;
		int sal2 = 6000;
		System.out.println(sal+sal2);
	}
	
	public static void sum2(int sal,int sal2){
		System.out.println(sal+sal2);
	}
	
	public static int sum3(int sal,int sal2){
		/*int sum = sal+sal2;
		return sum;*/
		return sal+sal2;
	}
	
	

}
