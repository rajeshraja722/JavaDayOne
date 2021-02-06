package org.phone;
//Q4 phoneName(),phoneMieiNum(),Camera(),storage(),osName()

public class PhoneInfo {
	private void phoneName() {
System.out.println("phoneName");
	}

	private void phoneMieiNum() {
System.out.println("phoneMieiNum");
	}

	private void Camera() {
System.out.println("Camera");
	}

	private void storage() {
System.out.println("storage");
	}
	
	private void osName() {
System.out.println("osName");
	}
	
	
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.Camera();
		p.osName();
		p.phoneMieiNum();
		p.phoneName();
		p.storage();
	
	}
	
	
}
