package com.zhy.pattern.status;

  

public class Test  
{  
	//public static VendingMachine machine1; 
	public static void main(String[] args)  
    {  
      JuiceMethod("Cola");
      JuiceMethod("Tea");
      JuiceMethod("Coffee");
      JuiceMethod("abc");
          
  
    }  
	
	public static void JuiceMethod(String juicetype) {
		
		Juicenum content=JuiceManger.factory(juicetype).Jav();
		VendingMachine machine1=new VendingMachine(content.num,content.Juicenumname);
		System.out.println("您选择的饮料是"+ content.Juicenumname+"-------");
		machine1.insertMoney();  
		machine1.backMoney();  
  
        System.out.println("我要中奖");
  
        machine1.insertMoney(); 
        machine1.turnCrank();  
        machine1.insertMoney();  
        machine1.turnCrank();  
        machine1.insertMoney();  
        machine1.turnCrank();  
        machine1.insertMoney();  
        machine1.turnCrank();  
        machine1.insertMoney();  
        machine1.turnCrank();  
        machine1.insertMoney();  
        machine1.turnCrank();  
        machine1.insertMoney();  
        machine1.turnCrank();  
  
        System.out.println("压力测试");
  
        machine1.insertMoney();  
        machine1.backMoney();  
        machine1.backMoney();  
        machine1.turnCrank();// 无效操作
        machine1.turnCrank();// 无效操作
        machine1.backMoney(); 
       
       
	}
} 
