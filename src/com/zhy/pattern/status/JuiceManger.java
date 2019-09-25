package com.zhy.pattern.status;

public class JuiceManger {
	public static Juice factory(String juice) {
		if(juice.equals("Cola")) {
			return new Cola();
			
		}
		else if (juice.equals("Tea")) {
			return new Tea();
		}
		else if (juice.equals("Coffee")){
			return new Coffee();
		}
		else {
			throw new RuntimeException("没有找到该饮料，请您再次选择");
		}
		
		
	}

}
