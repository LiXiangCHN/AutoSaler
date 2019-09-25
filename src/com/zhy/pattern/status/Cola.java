package com.zhy.pattern.status;

public class Cola implements Juice{
	
	public static int Colanum =20;
	private static VendingMachine juiceone;
	private Juicenum juicenum;
	
	    
	   
	
	//private VendingMachine machine; 

	@Override
	public void JuiceSelect() {
		// TODO Auto-generated method stub
		
		System.out.println("你选择了橙汁");
		//juiceone = new VendingMachine(Colanum,"Cola");
		//return juiceone;
		
		
	}




	@Override
	public Juicenum Jav() {
		// TODO Auto-generated method stub
		juicenum=new Juicenum();
		juicenum.Juicenumname="Cola";
		juicenum.num=Colanum;
		return juicenum;
	}

	


	

}
