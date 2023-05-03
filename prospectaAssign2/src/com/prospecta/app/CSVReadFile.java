package com.prospecta.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CSVReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		String file = "src/sample.csv";
		
		Set<Character> set = new HashSet<>();
		for(int i=0;i<=9;i++) {
			char c = (char)(i+'0');
			set.add(c);
		}
		
		Map<String,Integer> map = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
	     try {
			String currentLine = br.readLine();
			
			String[] strArr = currentLine.split(",");
			
			for(String s : strArr) {
				
				try {
				String[] sArr = s.split(": ");
				
				if(map.containsKey(sArr[0])) {
					continue;
				}
				else {
					int a1 = 0,a2=0,a3=0;
					
					if(sArr[1].length() >1) {
					
						for(int i=0;i<sArr[1].length();i++) {
							char ch = sArr[1].charAt(i);
							if(ch == '=') {
								int k = i+1;
								a1 = Character.getNumericValue(strArr[i].charAt(k));
							}
							
							else if(ch == '+') {
								String bb = "";
								bb += sArr[1].charAt(i+1);
								
								if(map.containsKey(bb)) {
									a2 = map.get(bb);
								}
								else {
								a2 = Integer.parseInt(bb);
								}
							}
								
							
							
						}
						
						if(a3 != 0)
							a3 = a1+a2;
						
					}
					else {
							a3 = Character.getNumericValue(strArr[1].charAt(0)); 
			
					}
					
					map.put(sArr[0],a3);
				}
				
				System.out.println(s);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     finally {
	    	 try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	     
	     System.out.println(map);
	     System.out.println("End program");
		
	}
}
