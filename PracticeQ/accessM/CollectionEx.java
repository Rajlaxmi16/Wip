package com.simpli.accessM;

import java.util.*;
public class CollectionEx {

	public static void main(String[] args) {
		
		//non-generic arraylist
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("raj");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		//generic arraylist
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(111);
		al1.add(222);
		al1.add(333);
		
		System.out.println(al1);
		
		al.addAll(al1);
		System.out.println("updated"+al);
		
		//Linkedlist
		LinkedList l=new LinkedList();
		l.add(111);
		l.add(222);
		System.out.println("Linkedlist"+l);
		l.remove(1);
		System.out.println("Updated List:"+l);
		
		//Priority queue
		PriorityQueue q=new PriorityQueue();
		q.add("a");
		q.add("b");
		q.add("c");
		System.out.println("Queue"+q);
		q.remove();
		q.remove();
		System.out.println("Updated Queue"+q);
		
		
		//TreeSet
		TreeSet t=new TreeSet();
		t.add(11);
		t.add(22);
		t.addAll(l);
		System.out.println("TreeSet:"+t);
		System.out.println("First:"+t.first());
		System.out.println("Last:"+t.last());
		System.out.println("Size:"+t.size());
		System.out.println(t.contains(11));
		t.clear();
		System.out.println("TreeSet:"+t);
		System.out.println(t.isEmpty());
		
		
		//Vector
		int n = 5;
        Vector<Integer> v = new Vector<Integer>(n);
 
        for (int i = 1; i <= n; i++)
            v.add(i);
        System.out.println(v);
 
        v.remove(2);
        System.out.println(v);
        v.add(2, 33);
        System.out.println(v);
        v.set(4,55);
        System.out.println(v);
        System.out.println(v.get(3));
        
        
		//HashSet
		
		
		//LinkedHashSet

	}

}
