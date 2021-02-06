package org.phone;
//processorName(),ramSize()
public class InternalStorage {
	private void processorName() {
System.out.println("processorName");
	}
	private void ramSize() {
System.out.println("ramSize");
	}
	public static void main(String[] args) {
		InternalStorage i=new InternalStorage();
		i.processorName();
		i.ramSize();
	ExternalStorage e=new ExternalStorage();
		e.size1();
	}
}
