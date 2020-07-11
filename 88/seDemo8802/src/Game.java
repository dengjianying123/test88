/**
 * 操作游戏类
 * @author djy QQ:523906275
 * @2020年7月1日
 *
 */
public class Game {

	public static void main(String[] args) {
		//编写游戏操作过程(有序),进行调用操作的方法
		downloadApp();
		installApp();
		openGame();
		registeredAccount();
		loginAccount();
		choiceServer();
		createRole();
		pay();
		uninstallApp();	
	}
	
	//方法编写
	
	//1.下载app
	protected static void downloadApp(){
		System.out.println("下载app...");
	}

	//2.安装app
	public static void installApp(){
		System.out.println("安装app...");
	}
	
	//3.打开游戏 
	public static void openGame() {
		System.out.println("打开游戏 ");
	}
	
	//4.注册账号
	public static void registeredAccount(){
		System.out.println("注册账号");
	}
	
	//5.登录账号 
	public static void loginAccount(){
		System.out.println("登录账号");
	}
	
	//6.选择服务器
	public static void choiceServer(){
		System.out.println("选择服务器");
	}

	//7.创建角色
	public static void createRole(){
		System.out.println("创建角色");
	}
	
	//8.充值
	public static void pay(){
		System.out.println("首充6元");
	}
	
	//9.卸载app
	public static void uninstallApp(){
		System.out.println("卸载app...");
	}
}
