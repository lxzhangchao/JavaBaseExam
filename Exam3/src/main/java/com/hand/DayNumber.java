package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class DayNumber 
{
	public static void main( String[] args )
	{
		@SuppressWarnings("resource")
		int number = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入日期：");
		String date=scan.nextLine();
		int mouth=Integer.parseInt(date.substring(5,7));
		int day=Integer.parseInt(date.substring(8,date.length()));
		int year=Integer.parseInt(date.substring(0,3));
		
		if(mouth==1){
			number=day;
		}else
			if(mouth==2){
				number=31+day;
			}else
				if(mouth==3){
					number=31+29+day;
				}else
					if(mouth==4){
						number=31+31+29+day;
					}else
						if(mouth==5){
							number=30+31+31+29+day;
						}else
							if(mouth==6){
								number=31+30+31+31+29+day;
							}else
								if(mouth==7){
									number=30+31+30+31+31+29+day;
								}else
									if(mouth==8){
										number=31+30+31+30+31+31+29+day;
									}else
										if(mouth==9){
											number=31+31+30+31+30+31+31+29+day;
										}else
											if(mouth==10){
												number=30+31+31+30+31+30+31+31+29+day;
											}else
												if(mouth==11){
													number=31+30+31+31+30+31+30+31+31+29+day;
												}else
													if(mouth==12){
														number=30+31+30+31+31+30+31+30+31+31+29+day;
													}
		System.out.println("你输入的日期为当年的第"+number+"天");

	}
}
