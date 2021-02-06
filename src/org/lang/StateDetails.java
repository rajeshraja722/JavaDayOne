package org.lang;



//Q5 southIndia(),northIndia()
public class StateDetails {
	private void southIndia() {
System.out.println("southIndia");
	}


	private void northIndia() {
System.out.println("northIndia");
	}
public static void main(String[] args) {
	StateDetails s=new StateDetails();
	s.northIndia();
	s.southIndia();
	
	LanguageInfo l=new LanguageInfo();
	l.englishLanguage();
	l.hindiLanguage();
	l.tamilLanguage();
}
}




