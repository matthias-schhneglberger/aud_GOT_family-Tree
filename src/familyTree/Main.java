/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.List;
import java.util.Map;

/**
 *
 * @author matth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public boolean isParent(Person parent, Person child){
        return true;
    }
    
    public boolean isFemale(Person person){
        return true;
    }
    
    public boolean isGrandparent(Person grandparent, Person grandchild){
        return true;
    }
    
    public List<Person> getAllGrandparents(Person grandchild){
        return null;
        
    }
    
    public List<Person> getAllGrandchildren(Person grandparent){
        return null;
        
    }
    
    public Map<Person, List<Person>> getAllSiblings(Person root){
        return null;
        
    }
    
    public List<Person> getAllGrandmas(Person root){
        return null;
        
    }
    
}
