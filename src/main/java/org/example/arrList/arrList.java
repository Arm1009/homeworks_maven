package org.example.arrList;

import java.util.*;

class arrayList {
    public String arrList() {
        List<String> list = new ArrayList<String>();
        String s = null;
        list.add("Green");
        list.add("Red");
        list.add("Silver");
        list.add("Purple");
        list.add("Blue");
        for (String elements : list) {
            System.out.println(elements);
        }
        return s;
    }


    public String addArrList() {
        List<String> list1 = new ArrayList<String>();
        String s = null;
        list1.add("Green");
        list1.add("Red");
        list1.add("Silver");
        list1.add("Purple");
        list1.add("Blue");

        list1.add(0, "Pink");
        list1.add(1, "Gray");
        for (String elements : list1) {
            System.out.println(elements);
        }
        return s;
    }

    public String updateArr(int index, String color) {
        List<String> listAr = new ArrayList<String>();
        String s = null;
        listAr.add("Green");
        listAr.add("Red");
        listAr.add("Silver");
        listAr.add("Purple");
        listAr.add("Blue");

        listAr.set(index, color);
        listAr.set(index, color);
        for (String elem : listAr) {
            System.out.println(elem);
        }
        return s;
    }

    public String searchArrList(String el) {
        List<String> listAr = new ArrayList<String>();
        String s = null;
        listAr.add("Green");
        listAr.add("Red");
        listAr.add("Silver");
        listAr.add("Purple");
        listAr.add("Blue");

        if (listAr.contains(el)) {
            System.out.println("This color is element of List");
        } else {
            System.out.println("This color is not in this List");
        }
        return s;
    }

    public String copyList() {
        List<String> list1 = new ArrayList<String>();
        String s = null;
        list1.add("Green");
        list1.add("Red");
        list1.add("Silver");
        list1.add("Purple");
        list1.add("Blue");

        List<String> list2 = new ArrayList<String>();
        list2.add("0");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");

        Collections.copy(list2, list1);
        System.out.println("copied list:" + list1);
        System.out.println("original list" + list2);
        return s;
    }

    public String reverseList() {
        List<String> listed = new ArrayList<String>();
        String s = null;
        listed.add("Green");
        listed.add("Red");
        listed.add("Silver");
        listed.add("Purple");
        listed.add("Blue");
        System.out.println("first list:" + listed);

        Collections.reverse(listed);
        System.out.println("reversed list:" + listed);
        return s;
    }

    public String swapList(int i, int j) {
        List<String> listsw = new ArrayList<String>();
        String s = null;
        listsw.add("Green");
        listsw.add("Red");
        listsw.add("Silver");
        listsw.add("Purple");
        listsw.add("Blue");

        for (String a : listsw) {
            System.out.println("Before swap:" + a + "\n");
        }
        try {
            Collections.swap(listsw, i, j);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        for (String b : listsw) {
            System.out.println("After swap:" + b);

        }
        return s;
    }

    public Boolean orEmpOrNot() {
        List<String> listEm = new ArrayList<String>();
        Boolean s = false;
        listEm.add("Green");
        listEm.add("Red");
        listEm.add("Silver");
        listEm.add("Purple");
        listEm.add("Blue");
        System.out.println("Original arrayList:" + listEm);
        System.out.println("Now we are checked this arrayList is empty or not:" + listEm.isEmpty());

        listEm.removeAll(listEm);
        System.out.println("List after remove all elements:" + listEm);
        System.out.println("And now it`s time for a checked is empty or not:" + listEm.isEmpty());

        return s;
    }

    public void ensCapList() {
        List<String> a1 = new ArrayList<String>(3);
        String s = null;

        a1.add("Green");
        a1.add("Red");
        a1.add("Silver");

        System.out.println("Original list:" + a1);
        ((ArrayList) a1).ensureCapacity(6);
        a1.add("Black");
        a1.add("Yellow");
        a1.add("White");
        System.out.println("Extended list:" + a1);

    }

    public void linkPos() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("White");
        linkedList.add("Black");
        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Rose");

        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void revLink() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("White");
        linkedList.add("Black");
        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Rose");

        Iterator it = linkedList.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }

    public void firsLastLink() {
        LinkedList<String> link = new LinkedList<String>();

        link.add("White");
        link.add("Black");
        link.add("Red");
        link.add("Blue");
        link.add("Rose");

        link.addFirst("Silver");
        link.addLast("Purple");
        System.out.println(link);
    }

    public void lastLink(String a) {
        LinkedList<String> link = new LinkedList<String>();

        link.add("White");
        link.add("Black");
        link.add("Red");
        link.add("Blue");
        link.add("Rose");

        link.addLast(a);
        System.out.println(link);
    }

    public void removeLFList() {
        LinkedList<String> link = new LinkedList<String>();

        link.add("White");
        link.add("Black");
        link.add("Red");
        link.add("Blue");
        link.add("Rose");

        System.out.println("This is linked list" + link);
        link.removeFirst();
        link.removeLast();
        System.out.println("We removed last and first element in this list:" + link);
    }

    public void cloneList() {
        LinkedList<String> link = new LinkedList<String>();

        link.add("White");
        link.add("Black");
        link.add("Red");
        link.add("Blue");
        link.add("Rose");
        System.out.println("Origin linkedList" + link);
        LinkedList<String> clonedLink = new LinkedList<String>();
        clonedLink = (LinkedList) link.clone();
        System.out.println("Cloned linkedList" + clonedLink);
    }

    public void isEmptyList() {
        LinkedList<String> link = new LinkedList<String>();

        link.add("White");
        link.add("Black");
        link.add("Red");
        link.add("Blue");
        link.add("Rose");
        System.out.println(link.isEmpty());
        link.removeAll(link);
        System.out.println(link.isEmpty());

    }

    public void sumArrays() {
        List<Integer> sumAverage = Arrays.asList(12,45);
        int aver = 0;
        for (int i : sumAverage) {
            aver = aver + i;
        }
        int sum = sumAverage.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list is:"+sum);
        if (sumAverage.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("The average of list:" + aver / (float) sumAverage.size());


        }

    }
}

















