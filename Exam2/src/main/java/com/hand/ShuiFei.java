package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ShuiFei 
{
	public static void main( String[] args )
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入工资：");
		int sal=scan.nextInt();
		double sum=0;
		if(sal>3500&&sal<4500){
			double sal1=(sal-3500)*0.1;
			sum=sum+sal1;
			System.out.println("所需要缴纳的税费为："+sum);
		}else 
			if(sal>4500&&sal<9000){
				double sal2=(sal-4500)*0.2;
				sum=sum+sal2;
				System.out.println("所需要缴纳的税费为："+sum);
			}else 
				if(sal>9000&&sal<35000){
					double sal3=(sal-9000)*0.25;
					sum=sum+sal3;
					System.out.println("所需要缴纳的税费为："+sum);
				}else 
					if(sal>35000&&sal<55000){
						double sal4=(sal-35000)*0.3;
						sum=sum+sal4;
						System.out.println("所需要缴纳的税费为："+sum);
					}else 
						if(sal>55000&&sal<80000){
							double sal5=(sal-55000)*0.35;
							sum=sum+sal5;
							System.out.println("所需要缴纳的税费为："+sum);
						}else 
							if(sal>80000){
								double sal6=(sal-80000)*0.45;
								sum=sum+sal6;
								System.out.println("所需要缴纳的税费为："+sum);
							}
	}
}
