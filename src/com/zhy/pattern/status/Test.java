package com.zhy.pattern.status;


import java.util.Scanner;

public class Test
{  
	//public static VendingMachine machine;
	public static void main(String[] args)
    {
        while(true) {
            System.out.println("1.选择可乐------2.选择茶-------3.选择咖啡");
            Scanner input = new Scanner(System.in);
            switch (input.nextLine()) {
                case "1":
                    JuiceMethod("Cola");
                    break;
                case "2":
                    JuiceMethod("Tea");
                    break;
                case "3":
                    JuiceMethod("Coffee");
                    break;

            }
        }

          
  
    }  
	
	public static void JuiceMethod(String juicetype) {
        JuiceManager jmanager =new JuiceManager();
        Juice juice= jmanager.factory(juicetype);

		VendingMachine machine=new VendingMachine(5,juicetype);
//		System.out.println("您选择的饮料是"+ juicetype+"-------");
		machine.insertMoney(); //投币
		machine.backMoney();  //退钱
        System.out.println("我要抽奖----------");
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        machine.insertMoney(); //投币
        machine.turnCrank();   //转动手柄
        System.out.println("测试---------");
        machine.insertMoney(); //投币
        machine.backMoney();   //退钱
        machine.backMoney();   //退钱
        machine.turnCrank();   //转动手柄
        machine.turnCrank();   //转动手柄
        machine.backMoney();   //退钱
       
       
	}
} 
