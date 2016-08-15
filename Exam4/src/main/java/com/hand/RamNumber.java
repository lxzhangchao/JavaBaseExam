package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.math.*;
/**
 * Hello world!
 *
 */
public class RamNumber 
{
	public  void main( String[] args )
	{
		public void nextInteger(int[] Integer) {
			   for (int i = 0; i < Integer.length; )
			     for (int rnd = nextInt(), n = Math.min(Integer.length - i, 4);
			          n-- > 0; rnd >>= 8)
			       Integer[i++] = (int)rnd;
			 }
		int[] key=null;
		key=new int[50];
		int[] em=null;
		em=new int[50];
		int j=0;
		List<Integer> lists=null;
		lists =new ArrayList<Integer>();
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(int i=0;i<50;i++){
			int em=round();
			lists.add(em[i]);
			key[j]=(int) em[i]/10;
			
		}
		for(int m=0;m<key.length-1;m++){
			for(int n=0;n<key.length-m-1;n++){
				if(key[n]>key[n+1]){
					int t = key[n];
					key[n]=key[n+1];
					key[n+1]=t;
				}
			}
		}
		for(int m=0;m<em.length-1;m++){
			for(int n=0;n<em.length-m-1;n++){
				if(em[n]>em[n+1]){
					int t = em[n];
					em[n]=em[n+1];
					em[n+1]=t;
				}
			}
		}
		for(int q=0;q<50;q++){
			map.put(key[q], key[q]+"=>["+em[q]+","+em[q]+","+em[q]+"}");
	}
	//System.out.println( "Hello World!" );
}
}
