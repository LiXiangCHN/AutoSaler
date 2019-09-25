package com.zhy.pattern.status;  
  
/** 
 * 自动售货机
 *  
 * @author xu 
 *  
 */  
public class VendingMachine  
{  
    public static int Juicenum;
    public static String Juicename;
	private State noMoneyState;  
    private State hasMoneyState;  
    private State soldState;  
    private State soldOutState;  
    private State winnerState ;   
  
    private int count = 0;  
    private String name;
    private State currentState = noMoneyState;  
  
    public VendingMachine(int count,String name)  
    {  
        noMoneyState = new NoMoneyState(this);  
        hasMoneyState = new HasMoneyState(this);  
        soldState = new SoldState(this);  
        soldOutState = new SoldOutState(this);  
        winnerState = new WinnerState(this);
        this.name=name;
  
        if (count > 0)  
        {  
            this.count = count;  
            currentState = noMoneyState;  
        }  
    }  
  
    public void insertMoney()  
    {  
        currentState.insertMoney();  
    }  
  
    public void backMoney()  
    {  
        currentState.backMoney();  
    }  
  
    public void turnCrank()  
    {  
        currentState.turnCrank();  
        if (currentState == soldState || currentState == winnerState)  
            currentState.dispense();  
    }  
  
    public void dispense()  
    {  
        System.out.println("发送一瓶商品");
        if (count != 0)  
        {  
            count -= 1;  
        }  
        
        switch(name) {
        case "Cola":
        	Cola.Colanum=count;
        	break;
        case "Tea":
        	Tea.Teanum=count;
        	break;
        case "Coffee":
        	Coffee.Coffeenum=count;
        	break;
        }
    }  
  
    public void setState(State state)  
    {  
        this.currentState = state;  
    }  
  
    //getter setter omitted ....
    

	public State getNoMoneyState() {
		// TODO Auto-generated method stub
		return  noMoneyState;
	}

	public State getWinnerState() {
		// TODO Auto-generated method stub
		return winnerState;
	}

	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}



	public State getHasMoneyState() {
		// TODO Auto-generated method stub
		return hasMoneyState;
	}

	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}


	
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	

	
	
	
	

	

	
}  