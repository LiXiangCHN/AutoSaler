package com.zhy.pattern.status;

public class Tea implements Juice{


	public  int teanum =10;
//	private static VendingMachine juiceone;
//	private Juicenum juicenum;
private String name;

	public  int getTeanum() {
		return teanum;
	}

	public  void setTeanum(int teanum) {
		teanum = teanum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//private VendingMachine machine;

@Override
public void JuiceSelect() {
	// TODO Auto-generated method stub
	
	System.out.println("你选择的是茶");
	//juiceone = new VendingMachine(Colanum,"Cola");
	//return juiceone;
	
	
}


//@Override
//public Juicenum Jav() {
//	// TODO Auto-generated method stub
//	juicenum=new Juicenum();
//	juicenum.Juicenumname="Tea";
//	juicenum.num=Teanum;
//	return juicenum;
//}



}