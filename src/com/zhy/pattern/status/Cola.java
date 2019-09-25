package com.zhy.pattern.status;

public class Cola implements Juice{
	
	public int colanum =20;
	private String name;

	public  int getColanum() {
		return colanum;
	}

	public  void setColanum(int colanum) {
		colanum = colanum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	private static VendingMachine juiceone;
//	private Juicenum juicenum;

	
	    
	   
	
	//private VendingMachine machine; 

	@Override
	public void JuiceSelect() {
		// TODO Auto-generated method stub
		
		System.out.println("你选择了可乐-------");
		//juiceone = new VendingMachine(Colanum,"Cola");
		//return juiceone;
		
		
	}




//	@Override
//	public Juicenum Jav() {
//		// TODO Auto-generated method stub
//		juicenum=new Juicenum();
//		juicenum.Juicenumname="Cola";
//		juicenum.num=Colanum;
//		return juicenum;
//	}

	


	

}
