package Scheduling;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entity.Process;

/*
 * 通用的方法
 * 
 */
public class Util {
	/**
	 * 初始化
	 */
	public static void init(List<Process> list) {
		System.out.println("请输入进程数量：");
		Scanner input3 = new Scanner(System.in);
		int num = input3.nextInt();
		
		for (int i = 0; i < num; i++) {
			Process process = new Process();
			System.out.println("请输入进程名字：");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			process.setName(name);
			
			System.out.println("请输入进程需要时间：");
			Scanner input1 = new Scanner(System.in);
			int neededTime = input1.nextInt();
			process.setNeededTime(neededTime);
			
			Date arriveTime = new Date();
			process.setArriveTime(arriveTime);
			process.setServerTime(0);
			process.setStatus("Wait");
			
			list.add(process);
		}
		
	}
	
	/**
	 * 进程执行
	 */
	public static void run(Process process){
		if(process.getStatus().equals("Wait")){
			int sTime = process.getServerTime();
			while(sTime != process.getNeededTime()){
				sTime++;
			}
			process.setStatus("Finish");
		}

	}
	
	/**
	 * 输出
	 * @param list
	 */
	public static void print(List<Process> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+" :"+list.get(i));
		}
	}
}
