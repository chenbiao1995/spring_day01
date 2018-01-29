package cn.itcast.property;

import java.util.Map;
import java.util.List;
import java.util.Properties;


/**
 * title:p-名称空间
 * Description:
 * @author: 
 * @date:2018年1月29日
 * @time:上午10:15:09
 */
public class Person {
	private String pname;
	private String[] arrs;
	private List<String> list;
	private Map<String,String> map;
	private Properties properties;
	
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void test1() {
		System.out.println("person..."+pname);
		System.out.println("arrs..."+arrs);

		System.out.println("list..."+list);

		System.out.println("map..."+map);

		System.out.println("properties..."+properties);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
