package interfaces;

import parentclass.ChildClassPublicInside;
import parentclass.ParentClassPublic;
import parentclassoutside.ChildClassOutside;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenguage language = new EnglishLanguage();
		language.sayHi();
		language = new ProgrammingLanguage();
		language.sayHi();
		ParentClassPublic parent = new ChildClassPublicInside();
		parent.getInfo();
		parent = new ChildClassOutside();
		parent.getInfo();
		
		FunctionInterfaceApp funcInterApp = new FunctionInterfaceApp();
		double valor = funcInterApp.operacion(2,3);
		System.out.println(valor);
	}

}
