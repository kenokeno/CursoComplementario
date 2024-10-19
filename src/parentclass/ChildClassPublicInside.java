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
public class ChildClassPublicInside extends ParentClassPublic{
    void accessInfo(){
        System.out.println("Inside ParentClass");
        System.out.println("Public = " + name);
        //System.out.println("Private = " + edad);
        System.out.println("Protected = " + vivo);
        System.out.println("Default = " + color);
    }
}
