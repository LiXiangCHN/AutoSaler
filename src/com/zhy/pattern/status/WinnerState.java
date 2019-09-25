package com.zhy.pattern.status;  
  
/** 
 * 中奖状态，该状态下不会有任何用户的操作
 *  
 * @author xu 
 *  
 */  
public class WinnerState implements State  
{  
  
    private VendingMachine machine;  
  
    public WinnerState(VendingMachine machine)  
    {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertMoney()  
    {  
        throw new IllegalStateException("非法状态！");
    }  
  
    @Override  
    public void backMoney()  
    {  
        throw new IllegalStateException("非法状态！");
    }  
  
    @Override  
    public void turnCrank()  
    {  
        throw new IllegalStateException("非法状态！");
    }  
  
    @Override  
    public void dispense()  
    {  
        System.out.println("恭喜你，你中奖了，将得到两件商品");
        machine.dispense();  
  
        if (machine.getCount() == 0)  
        {  
            System.out.println("商品已售罄");
            machine.setState(machine.getSoldOutState());  
        } else  
        {  
            machine.dispense();  
            if (machine.getCount() > 0)  
            {  
                machine.setState(machine.getNoMoneyState());  
            } else  
            {  
                System.out.println("商品已售罄");
                machine.setState(machine.getSoldOutState());  
            }  
              
        }  
  
    }  
  
} 