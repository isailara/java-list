package uaslp.objetos.list;

import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        List team1 = new ArrayList();
        List team2 = new ArrayList();
        List team3 = new ArrayList();

        List team4 = new LinkedList();
        List team5 = new LinkedList();
        List team6 = new LinkedList();

        exercise(team1,team2,team3);
        exercise2(team4,team5,team6);
    }

    public static void exercise(List team1, List team2, List team3)
    {
        System.out.println();
        System.out.println("---------------------ArrayList---------------------");
        System.out.println();

        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        Iterator iterator;

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Jesús
        // Salomón
        // Yael
        System.out.println();
        iterator = team2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Cristian

        System.out.println();
        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Rebeca
        // Salomón
        // Yael
        System.out.println();
        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes"); // debe imprimir "Team 2 tiene 3 integrantes"

        iterator = team2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Rita

        System.out.println();
        team3.remove(0);
        team3.remove(0); // El elemento no existe pero el programa no debe cerrarse por algún error

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes"); // debe imprimir "Team 3 tiene 2 integrantes"

        iterator = team3.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Tadeo
        // Isai

        if(team1.getAt(1).equals("Salomón")){
            team1.setAt(1, "Luis");
        }

        System.out.println();
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    public static void exercise2(List team4, List team5, List team6)
    {
        System.out.println();
        System.out.println("---------------------LinkedList---------------------");
        System.out.println();

        team4.addAtTail("Sofia");
        team4.addAtTail("Romina");
        team4.addAtTail("Deni");

        team5.addAtFront("Paulina");
        team5.addAtFront("Andrea");
        team5.addAtFront("Camila");

        team6.addAtFront("Alejandra");

        Iterator iterator;

        iterator = team4.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Sofia
        // Romina
        // Deni
        System.out.println();
        iterator = team5.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Camila
        // Andrea
        // Paulina

        System.out.println();
        team4.remove(0);
        team4.addAtFront("Quenira");
        System.out.println("Team 4 tiene: " + team4.getSize() + " integrantes");

        iterator = team4.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Quenira
        // Romina
        // Deni
        System.out.println();
        team5.remove(2);
        team5.addAtTail("Rita");
        System.out.println("Team 5 tiene: " + team5.getSize() + " integrantes");

        iterator = team5.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Camila
        // Andrea
        // Rita

        System.out.println();
        team6.remove(0);
        team6.remove(0); // El elemento no existe pero el programa no debe cerrarse por algún error

        team6.addAtTail("Elian");
        team6.addAtFront("Isai");

        System.out.println("Team 6 tiene: " + team6.getSize() + " integrantes");

        iterator = team6.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Elian
        // Isai

        if(team4.getAt(1).equals("Romina")){
            team4.setAt(1, "Pedro");
        }

        System.out.println();
        System.out.println("Team 4 tiene: " + team4.getSize() + " integrantes");

        iterator = team4.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
