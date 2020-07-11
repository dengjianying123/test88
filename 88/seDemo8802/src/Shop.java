import com.fy.until.DB;

public class Shop {

	public static void main(String[] args) {
		/*DB db = new DB();
		db.username = "999";*/
		//类名称.定义的static的成员变量DB.password
		System.out.println(DB.PASSWORD);
		//DB.PASSWORD = "8888";//提示:The final field DB.PASSWORD cannot be assigned
	}

}
