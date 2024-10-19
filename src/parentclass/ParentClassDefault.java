package parentclass;

public abstract class ParentClassDefault {
	
	public ParentClassDefault(){}
	private ParentClassDefault(int x){}
	protected ParentClassDefault(boolean vivo){}
	ParentClassDefault(String color){}
	
	public void getInfo() {
		ParentClassPublic parentClassPublic = new ParentClassPublic();
		System.out.println("Public: "+ parentClassPublic.name);
		//System.out.println("Private: "+ parentClassPublic.edad);
		System.out.println("Protected: "+ parentClassPublic.vivo);
		System.out.println("Default: "+ parentClassPublic.color);
		
	}
}
