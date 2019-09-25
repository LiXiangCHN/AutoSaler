package com.zhy.pattern.status;

public class Coffee implements Juice{

	public int coffeenum =20;
//	private static VendingMachine juiceone;
//	private Juicenum juicenum;
	private String name;

	public void setCoffeenum(int coffeenum) {
		coffeenum = coffeenum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoffeenum() {
		return coffeenum;
	}

	public String getName() {
		return name;
	}
	//private VendingMachine machine;

@Override
public void JuiceSelect() {
	// TODO Auto-generated method stub
	
	System.out.println("你选择了咖啡");
	//juiceone = new VendingMachine(Colanum,"Cola");
	//return juiceone;
	
	
}

//public Juicenum Jav() {
//	// TODO Auto-generated method stub
//	juicenum=new Juicenum();
//	juicenum.Juicenumname="Coffee";
//	juicenum.num=Coffeenum;
//	return juicenum;
//}


}
