
public class LoginTest {

	public static void main(String[] args) {
		boolean re = Demo5.login("祝越", "祝越1", "888", "888");
		//System.out.println(re);
		System.out.println(re == true ? "登录成功" : "登录失败");

	}

}
