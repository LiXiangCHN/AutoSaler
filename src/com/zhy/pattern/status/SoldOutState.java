package com.zhy.pattern.status;  
  
/** 
 * 售罄状态
 *  
 * @author xu 
 *  
 */  
public class SoldOutState implements State  
{  
  
    private VendingMachine machine;  
  
    public SoldOutState(VendingMachine machine)  
    {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertMoney()  
    {  
        System.out.println("投币失败，商品已售罄");
    }  
  
    @Override  
    public void backMoney()  
    {  
        System.out.println("您未投币，想退钱吗");
    }  
  
    @Override  
    public void turnCrank()  
    {  
        System.out.println("商品已售罄，转动手柄无效");
    }  
  
    @Override  
    public void dispense()  
    {  
        throw new IllegalStateException("非法状态！");
    }  
  
} 