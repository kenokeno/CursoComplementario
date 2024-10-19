package parentclassoutside;

import parentclass.ParentClassDefault;
import parentclass.ParentClassPublic;

public class AccessByClassInOtherPackage {
	final static float PI=3.14f;
	public AccessByClassInOtherPackage() {
	}
	public void getInfo() {
		System.out.println(PI);
		//ParentClassDefault parentClassDefault = new ParentClassDefault();
		ParentClassPublic parentClassPublic = new ParentClassPublic("michi", 14,true,"black");
		System.out.println("Public: " + parentClassPublic.name);
		//System.out.println("Private: " + parentClassPublic.edad);
		//System.out.println("Protected: " + parentClassPublic.vivo);
		//System.out.println("Default: " + parentClassPublic.color);
	}
	public static void main(String args[]) {
		//AccessByClassInOtherPackage var = new AccessByClassInOtherPackage();
		System.out.println(AccessByClassInOtherPackage.PI);
		//var.getInfo();
	}
}
