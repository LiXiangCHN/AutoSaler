package com.zhy.pattern.status;

public class Coffee implements Juice{

	public static int Coffeenum =20;
	private static VendingMachine juiceone;
	private Juicenum juicenum;
	
	
	
//private VendingMachine machine; 

@Override
public void JuiceSelect() {
	// TODO Auto-generated method stub
	
	System.out.println("你选择了咖啡");
	//juiceone = new VendingMachine(Colanum,"Cola");
	//return juiceone;
	
	
}

public Juicenum Jav() {
	// TODO Auto-generated method stub
	juicenum=new Juicenum();
	juicenum.Juicenumname="Coffee";
	juicenum.num=Coffeenum;
	return juicenum;
}


}
