package Scheduling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Algorithm.fcfs;
import Algorithm.rotation;
import entity.Process;

public class Main {
	
	public static void main(String[] args) {
		while(true){
			System.out.println("******************************");
			System.out.println("1、先来先服务");
			System.out.println("2、简单轮转法");
			System.out.println("3、多级反馈队列");
			System.out.println("3、退出");
			System.out.println("******************************");
			System.out.println("请选择你想要的调度算法：");
			Scanner input = new Scanner(System.in);
			int key = input.nextInt();
			List<Process> list = new ArrayList<Process>();
			switch(key){
				case 1: 
						Util.init(list);
						fcfs.fcfs(list);
						fcfs.input(list);
						break;
				case 2: 
						Util.init(list);
						rotation.rotation(list);
						break;
				case 3: 
				case 4: break;
			}
			if(key == 3){
				break;
			}
		}

	}

}
