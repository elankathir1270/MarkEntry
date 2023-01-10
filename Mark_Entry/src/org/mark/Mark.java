package org.mark;

import java.util.Iterator;
import java.util.Scanner;

public class Mark {
	
	public static void main(String[] args) {
		int sid=0;
		int tc=0;
		for (int k = 0; k < 2; k++) {
			sid++;
			System.out.println("=========================");
			System.out.println("School id: "+"Aish00"+sid);
			System.out.println("=========================");
		
		int id=0;
		for (int j = 0; j < 3; j++) {
			id++;
			System.out.println("student id: "+"SRK00"+id+"\n"+"Enter the Marks (lan1,lan2,mat,sci,soc)");
			
			
		
		int marks[]=new int[5];
		String sub[]= {"lan1","lan2","mat","sci","soc"};
		String print[]=new String[sub.length];
		
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			
			 marks[i]=sc.nextInt();
			 
			print[i]=sub[i]+"-"+marks[i];
		}
		int total=0;
		int avg=0;
		int cnt=0;
		int pass=0;
		int fail=0;
		int ton=0;
		for (int i = 0; i < sub.length; i++) {
			cnt++;
			System.out.println(print[i]);
			if(marks[i]>40) {
				pass++;
			}
			if(marks[i]<40) {
				fail++;
			}
			if(marks[i]==100) {
				ton++;
			}
			
			total=total+marks[i];
			avg=total/cnt;
			tc++;
		}
		System.out.println();
		System.out.println("total: "+total+"/500");
		System.out.println("percentage %: "+avg);
		System.out.println("pass in: "+pass+" subjects"+"|"+"fail in: "+fail+" subjects"+"|"+"ton in: "+ton+" subjects");
		System.out.println();
		}
	}
		System.out.println(tc=tc/5);
	
			
		}
	
	}

