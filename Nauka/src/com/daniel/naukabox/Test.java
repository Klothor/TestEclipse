package com.daniel.naukabox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.synth.SynthSpinnerUI;






public class Test {

	public static void main(String[] args) throws IOException {
		
		
		
		int [] A = {1,1,2,3,4};
		System.out.println(A.toString());
		Arrays.sort(A);
		System.out.println(A);
		
		int s = 1;
		
		for (int i = 0; i < A.length; i++) {
			
			
			try{
				if(s == A[i] && s != A[i+1]){
					s++;
				} else{
					System.out.println(s);
				}
			} catch (Exception e){
				
			}
			
			
		}
		
		System.out.println(s);
		
		
	}
	
	

	public static boolean isIn(int[] A, int s){
		
		for(int i = 0; i<A.length; i++){
            
			if(s==A[i]){
				return true;
			}
        }
		
		return false;
		
	}
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//codility 1
		
		int N = 15;
		int count = 0;
		int i = 0;
		ArrayList<Integer> max = new ArrayList();
		max.add(0);
		String a = Integer.toBinaryString(N);
		System.out.println(a);
		
		char[] arr = a.toCharArray();
		
		if(arr.length != 0 ){
			
			for(i=0; i<arr.length; i++){
				
				if(arr[i] == '0'){
					count++;
				} else if (arr[i]=='1' && count>0){
					max.add(count);
					count=0;
				}
				
			}
		}
		
		max.sort(Comparator.naturalOrder());;
		System.out.println(max);
		System.out.println(max.get(max.size()-1));
		*/
		
		
		
		
		
		
		
		
//		File file = new File("src/test.txt");
//
//		try {
//			
//			FileReader reader = new FileReader(file);
//			BufferedReader buffer = new BufferedReader(reader);
//			String line = null;
//			
//			while((line = buffer.readLine()) != null){
//				System.out.println(line);
//			}
//			
//			
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			
//			FileWriter writer = new FileWriter(file);
//			FileReader reader = new FileReader(file);
//			
//			writer.write("dupa");
//			writer.close();
//			System.out.println("Zapisa³o!!\n");
//			
//			
//			
//			System.out.println("Odczyt: ");
//			
//			int content;
//			while((content = reader.read()) != -1){
//				System.out.print((char) content);
//			}
//			
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		File file = new File("src/test.txt");
//		
//		try (FileInputStream input = new FileInputStream(file)){
//			
//			System.out.println("Size: " + input.available());
//			
//			int content;
//			while((content = input.read()) != -1){
//				System.out.print((char) content);
//			}
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
		
		
//		byte[] data = new byte[5];
//		
//		System.out.println("Enter some chars: ");
//		System.in.read(data);
//		System.out.println("You entered: ");
//		
//		for (byte b : data) {
//			System.out.print( (char) b);
//		}
		
		
		
		
		
		
		
//		ArrayList<String> list = new ArrayList();
//		list.add("zero");
//		list.add("jeden");
//		list.add("dwa");
//		list.add("trzy");
//		list.add("cztery");
//		list.add(4, "dodany");
//		
//		//list.sort(Comparator.reverseOrder());
//		
//		
//		for (String object : list) {
//			System.out.println("Pozycja " + list.lastIndexOf(object) + ", wartoœæ: " + object);
//		}
		
		
		
		
		
//		HashMap<Integer, Integer> users = new HashMap();
//		
//		users.put(1, 1);
//		users.put(2, 2);
//		users.put(3, 3);
//		users.put(4, 4);
//		
//		Iterator it = users.entrySet().iterator();
//		
//		while(it.hasNext()){
//			
//			Map.Entry pair = (Map.Entry) it.next();
//			System.out.println(pair.getKey() + " = " + pair.getValue());
//		}
//		
//		System.out.println("------------");
//		
//		for (Integer i : users.keySet()) {
//			System.out.println(users.get(i));
//			
//		}
		



