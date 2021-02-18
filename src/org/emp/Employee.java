package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Emp ID:001");
	}
		public void phoneInfo(String phname,int phnprice) {
			
			System.out.println("Phone name is:"+phname+"\t"+"Phone price is:"+phnprice);
			
		}
		
	public void phoneInfo(int camerapixel,String imeino ) {
			
			System.out.println("Phone camera Pixel is:"+camerapixel+"\n"+"Phone price is:"+imeino);
			
		}
	
	
	public static void main(String[] args) {
		Employee c =new Employee();
		
	}
	
	
	
}
