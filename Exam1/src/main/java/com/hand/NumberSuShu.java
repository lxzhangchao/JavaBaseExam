package com.hand;

/**
 * �ж�101-200 ��������Ŀ
 *
 */
public class NumberSuShu 
{
	public static void main( String[] args )
	{
		int count=0;
		int[] score=null;
		score=new int[100];
		int m=0;
		for(int j=101;j<=200;j++){
			int i=0;
			for( i=2;i<j;i++){
				if(j%i==0){
					break;
				}else{
					continue;
				}
			} if(i>j-1){
				count++;
				score[m]=j;
				m++;
			}else{
				count=count;
			}
		}
		System.out.println("101-200֮����"+count+"������,");
		System.out.print("�ֱ��ǣ�");
		for(m=0;m<count;m++){
			System.out.print(score[m]+",");	
		}
	}
}
