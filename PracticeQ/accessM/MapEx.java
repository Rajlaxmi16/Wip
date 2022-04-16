package com.simpli.accessM;

import java.util.*;
public class MapEx {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(11, "abc");
		hm.put(22, "raj");
		hm.put(33, "max");
		hm.put(44, "sam");
		
		System.out.println(hm);
		
		String name=hm.get(11);
		System.out.println(name);
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		//TreeMap
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(11, "abc");
		tm.put(22, "raj");
		tm.put(33, "max");
		tm.put(44, "sam");
		
		System.out.println(tm);
		
		String name1=tm.get(11);
		System.out.println(name1);
		
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
	}

}
