package cn.itcast.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Bean2;
import cn.itcast.bean.Bean3;
import cn.itcast.property.Book;
import cn.itcast.property.Person;
import cn.itcast.property.PropertyDemo1;

public class TestIoc {
	@Test
	public void testUser() {
		//加载spring配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		//得到配置创建的对象
//		Bean3 bean3 = (Bean3) context.getBean("bean3");
//		User user1 = (User) context.getBean("user");
//		User user2 = (User) context.getBean("user");
//		System.out.println(user2);
//
//		System.out.println(user1);
//		PropertyDemo1 demo1 = (PropertyDemo1) context.getBean("demo1");
//		demo1.test1();
//		Book book = (Book) context.getBean("book");
//		book.demobook();
//		UserService userService = (UserService) context.getBean("userService");
//		userService.add();
		Person person = (Person) context.getBean("person");
		person.test1();
	}
}
