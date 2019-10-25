/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
        List<Person> thirdgen = new ArrayList<>();
        Person robb = new Person(true, null, null);
        thirdgen.add(robb);
        Person sansa = new Person(false, null, null);
        thirdgen.add(sansa);
        Person arya = new Person(false, null, null);
        thirdgen.add(arya);
        Person bran = new Person(true, null, null);
        thirdgen.add(bran);
        Person rickon = new Person(true, null, null);
        thirdgen.add(rickon);
        Person jon = new Person(true, null, null);
        List<Person> secondgen = new ArrayList<>();
        Person catelyn = new Person(false, null, thirdgen);
        secondgen.add(catelyn);
        Person eddard = new Person(true, null, thirdgen);
        secondgen.add(eddard);
        Person brandon = new Person(true, null, null);
        secondgen.add(brandon);
        Person benjen = new Person(true, null, null);
        secondgen.add(benjen);
        List<Person> dead = new ArrayList<>();
        dead.add(jon);
        Person lyanna = new Person(true, null, dead);
        Person rickard = new Person(true, null, secondgen);
        Person lyarra = new Person(false, null, secondgen);
        robb.setDad(eddard);
        robb.setMom(catelyn);
        sansa.setDad(eddard);
        sansa.setMom(catelyn);
        arya.setDad(eddard);
        arya.setMom(catelyn);
        bran.setDad(eddard);
        bran.setMom(catelyn);
        rickon.setDad(eddard);
        rickon.setMom(catelyn);
        jon.setMom(lyanna);
        eddard.setDad(rickard);
        eddard.setMom(lyarra);
        brandon.setDad(rickard);
        brandon.setMom(lyarra);
        benjen.setDad(rickard);
        benjen.setMom(lyarra);
        lyanna.setDad(rickard);
        lyanna.setMom(lyarra);
    }
    
//unUsed
//    public boolean isParent(Person parent, Person child) {
//        if ((child.getMom().equals(child) || child.getDad().equals(child)) && parent.getChildren().contains(child)) {
//            return true;
//        }
//        return false;
//    }

    public boolean isFemale(Person person) {//fertig
        return !person.getMale();
    }

    public boolean isParent(Person parent, Person child) {//fertig
        return child.getParents().contains(parent);
    }

    public boolean isGrandparent(Person grandparent, Person grandchild) {//fertig
        List<Person> grandParents = getAllGrandparents(grandchild);
        return grandParents.contains(grandparent);
    }

    public List<Person> getAllGrandparents(Person grandchild) {
        List<Person> toReturn = new ArrayList<>();
        List<Person> parents = Arrays.asList(grandchild.getDad(), grandchild.getMom());
        parents = parents.stream().filter(a -> a != null).collect(Collectors.toList());
        for (Person parent : parents) {
            toReturn.add(parent.getDad());
            toReturn.add(parent.getMom());
        }
        toReturn = toReturn.stream().filter(p -> p != null).collect(Collectors.toList());
        return toReturn;

    }

    public List<Person> getAllGrandchildren(Person grandparent) {
        List<Person> children = grandparent.getChildren();
        List<Person> toReturn = new ArrayList<>();
        for (Person person : children) {
            toReturn.addAll(person.getChildren());
        }
        toReturn = toReturn.stream().distinct().collect(Collectors.toList());
        return toReturn;

    }

    private List<Person> getAllChildren(List<Person> parents){
        List<Person> toReturn = new ArrayList<>();
        for (Person person : parents) {
            parents.addAll(person.getChildren());
        }
        return toReturn;
    }
    
    public Map<Person, List<Person>> getAllSiblings(Person root) {
        Map<Person, List<Person>> siblings = new HashMap<>();
        List<Person> eineGeneration = new ArrayList<>();
        eineGeneration.add(root);
        eineGeneration = getAllChildren(eineGeneration);
        while(eineGeneration.size() != 0){
            for (Person person : eineGeneration) {
                List<Person> siblingsOfPerson = new ArrayList<>(eineGeneration.size());
                Collections.copy(eineGeneration, siblingsOfPerson);
                siblingsOfPerson.remove(person);
                siblings.put(person, siblingsOfPerson);
            }
            eineGeneration = getAllChildren(eineGeneration);
        }
        return siblings;
    }

    public List<Person> getAllGrandmas(Person root) {
        return getAllGrandparents(root).stream().filter(a -> !a.getMale()).collect(Collectors.toList());
    }

}
