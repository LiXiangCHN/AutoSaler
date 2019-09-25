package com.zhy.pattern.status;
  
  
/** 
 * 没钱的状态
 * @author xu 
 * 
 */  
public class NoMoneyState implements State  
{  
  
    private VendingMachine machine;  
  
    public NoMoneyState(VendingMachine machine)  
    {  
        this.machine = machine;  
          
    }  
      
    @Override  
    public void insertMoney()  
    {  
        System.out.println("投币成功");
        machine.setState(machine.getHasMoneyState());  
    }  
  
    @Override  
    public void backMoney()  
    {  
        System.out.println("您未投币，退钱吗");
    }  
  
    @Override  
    public void turnCrank()  
    {  
        System.out.println("您未投币，想拿东西吗");
    }  
  
    @Override  
    public void dispense()  
    {  
        throw new IllegalStateException("非法状态！");
    }  
  
} 