package com.zhy.pattern.status;

public class JuiceManager {
	public Juice factory(String juice) {
		if(juice.equals("Cola")) {
			System.out.println("Cola已创建------");
			return new Cola();

		}
		else if (juice.equals("Tea")) {
			System.out.println("Tea已创建------");
			return new Tea();
		}
		else if (juice.equals("Coffee")){
			System.out.println("Coffee已创建-----");
			return new Coffee();
		}
		else {
			throw new RuntimeException("没有找到该饮料，请您再次选择");
		}
		
		
	}

}
