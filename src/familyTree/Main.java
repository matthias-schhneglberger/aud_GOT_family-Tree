/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.ArrayList;
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

    public boolean isParent(Person parent, Person child) {
        if ((child.getMom().equals(child) || child.getDad().equals(child)) && parent.getChildren().contains(child)) {
            return true;
        }
        return false;
    }

    public boolean isFemale(Person person) {
        return !person.getMale();
    }

    public boolean isGrandparent(Person grandparent, Person grandchild) {
        List<Person> grandParents = getAllGrandmas(grandchild);
        return grandParents.contains(grandParents);
    }

    public List<Person> getAllGrandparents(Person grandchild) {
        List<Person> toReturn = new ArrayList<>();
        toReturn.add(grandchild.getDad().getDad());
        toReturn.add(grandchild.getDad().getMom());
        toReturn.add(grandchild.getMom().getDad());
        toReturn.add(grandchild.getMom().getMom());
        toReturn.stream().filter(p -> p == null);
        return toReturn;

    }

    public List<Person> getAllGrandchildren(Person grandparent) {
        List<Person> toReturn = new ArrayList<>();
        grandparent.getChildren().stream().map(l -> l.getChildren().stream().map(p -> toReturn.add(p)));
        return toReturn;

    }

    public Map<Person, List<Person>> getAllSiblings(Person root) {
        return null;

    }

    public List<Person> getAllGrandmas(Person root) {
        return getAllGrandparents(root).stream().filter(a -> !a.getMale()).collect(Collectors.toList());

    }

}
