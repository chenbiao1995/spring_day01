package cn.itcast.ioc;

/**
 * title:
 * Description:
 * @author: 
 * @date:2018年1月29日
 */
public class User {
	private String username;
	
	public User(String username) {
		this.username = username;
	}
	public void add() {
		System.out.println("add");
	}
	public static void main(String[] args) {
		//原始方法
//		User user = new User();
//		user.add();
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
