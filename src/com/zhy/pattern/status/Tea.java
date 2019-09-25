package com.zhy.pattern.status;

public class Tea implements Juice{


	public static int Teanum =10;
	private static VendingMachine juiceone;
	private Juicenum juicenum;
	
	
	
//private VendingMachine machine; 

@Override
public void JuiceSelect() {
	// TODO Auto-generated method stub
	
	System.out.println("你选择的是茶");
	//juiceone = new VendingMachine(Colanum,"Cola");
	//return juiceone;
	
	
}


@Override
public Juicenum Jav() {
	// TODO Auto-generated method stub
	juicenum=new Juicenum();
	juicenum.Juicenumname="Tea";
	juicenum.num=Teanum;
	return juicenum;
}



}