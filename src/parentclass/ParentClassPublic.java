/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentclass;

/**
 *
 * @author PC
 */
public class ParentClassPublic {
    public String name;
    private int edad;
    protected boolean vivo;
    String color;
    
    //scope
    
    public ParentClassPublic(){}
    
    public ParentClassPublic(String name, int edad, boolean vivo, String color) {
        this.name = name;
        this.edad = edad;
        this.vivo = vivo;
        this.color = color;
    }
    
    public void getInfo(){
        System.out.println("Imprimiendo informacion");
    }
    
    public void showInfo(){
        System.out.println("Inside ParentClass");
        System.out.println("Public = " + name);
        System.out.println("Private = " + edad);
        System.out.println("Protected = " + vivo);
        System.out.println("Default = " + color);
    }
}
