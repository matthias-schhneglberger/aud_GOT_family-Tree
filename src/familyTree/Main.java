/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        if((child.getMom().equals(child) || child.getDad().equals(child))&& parent.getChildren().contains(child)){
            return true;
        }
        return false;
    }
    
    public boolean isFemale(Person person){
        return !person.getMale();
    }
    
    public boolean isGrandparent(Person grandparent, Person grandchild){
        List<Person> grandParents = getAllGrandmas(grandchild);
        return grandParents.contains(grandParents);
    }
    
    public List<Person> getAllGrandparents(Person grandchild){
        return null;
//        return List<Person> list = grandchild.getParents().stream().getParents().collect(Collectors.toList());

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
