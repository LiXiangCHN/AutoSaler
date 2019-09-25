package com.zhy.pattern.status;

public class JuiceManager {
	public Juice factory(String juice) {
		if(juice.equals("Cola")) {
//			System.out.println("Cola已创建------");
			Cola cola =new Cola();
			cola.JuiceSelect();
			return cola;

		}
		else if (juice.equals("Tea")) {
//			System.out.println("Tea已创建------");
//			return new Tea();
			Tea tea =new Tea();
			tea.JuiceSelect();
			return tea;
		}
		else if (juice.equals("Coffee")){
//			System.out.println("Coffee已创建-----");
			Coffee coffee = new Coffee();
			coffee.JuiceSelect();
			return coffee;
		}
		else {
			throw new RuntimeException("没有找到该饮料，请您再次选择");
		}
		
		
	}

}
