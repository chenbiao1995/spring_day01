package cn.itcast.ioc;

/**
 * title:
 * Description:
 * @author: 
 * @date:2018年1月29日
 * @time:上午9:50:42
 */
public class UserService {
	//1.定义dao类型属性
	private UserDao userDao;
	//2.生成set方法
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//3.在配置文件中配置set方法注入
	public void add() {
		System.out.println("service..");
		//在service里面得到dao对象，才能调用dao中的方法
//		UserDao dao = new UserDao();
//		dao.add();
		userDao.add();
	}


}
