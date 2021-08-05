/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubledlink;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author zyoco
 */
public class DLLTest {

    /**
     * Test of addNext method, of class DLL.
     */
    @Test
    public void testAddNext() {
        System.out.println("##############################");
        System.out.println("addNext");
        String name = "Australia";
        String city = "Canberra";
        DLL instance = new DLL();
        instance.addNext(name, city);
        Assertions.assertFalse(instance.head.getName().isEmpty());
        Assertions.assertFalse(instance.head.getCity().isEmpty());
    }

    /**
     * Test of addFirst method, of class DLL.
     */
    @Test
    public void testAddFirst() {
        System.out.println("##############################");
        System.out.println("addFirst");
        String name = "Japan";
        String city = "Tokyo";
        DLL instance = new DLL();
        instance.addFirst(name, city);
        Assertions.assertFalse(instance.head.getName().isEmpty());
        Assertions.assertFalse(instance.head.getCity().isEmpty());

    }

    /**
     * Test of iterateForward method, of class DLL.
     */
    @Test
    public void testIterateForward() {
        System.out.println("##############################");
        System.out.println("iterateForward Add");
        String name = "Australia";
        String city = "Canberra";
        String name1 = "Japan";
        String city1 = "Tokyo";
        DLL instance = new DLL();
        instance.addFirst(name1, city1);
        instance.addNext(name, city);
        instance.iterateForward();
        Assertions.assertFalse(instance.head.getName().contains("Aus"));
        Assertions.assertFalse(instance.head.getCity().contains("Can"));
    }

    /**
     * Test of iterateBackward method, of class DLL.
     */
    @Test
    public void testIterateBackward() {
        System.out.println("##############################");
        System.out.println("iterateBackward Add");
        String name = "Japan";
        String city = "Tokyo";
        String name1 = "Australia";
        String city1 = "Canberra";
        DLL instance = new DLL();
        instance.addFirst(name1, city1);
        instance.addNext(name, city);
        instance.iterateBackward();
        Assertions.assertFalse(instance.head.getName().contains("Jap"));
        Assertions.assertFalse(instance.head.getCity().contains("Tok"));
    }

}
