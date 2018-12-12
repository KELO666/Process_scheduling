package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Scheduling.Util;
import entity.Process;

/*
 * 
 * 先来先服务
 */
public class fcfs {
	/**
	 * 算法
	 */
	public static void fcfs(List<Process> list) {
		String[] Status = new String[1024] ;
		for (int i = 0; i < list.size(); i++) {
			Status[i] = list.get(i).getStatus();//这里空指针异常，主要是数组的问题
		}
		
		if(list.size()!=0 && Arrays.asList(Status).contains("Wait")){
			list.sort(Comparator.naturalOrder());//按照到达时间排序
			for (int i = 0; i < list.size(); i++) {
				Util.run(list.get(i));
			}
		}
		
	}
	
	/**
	 * 进程执行过程
	 */
	public static void input(List<Process> list){
		
		System.out.println("***********************************************************************");
		System.out.println("执行顺序为：");
		Util.print(list);
		System.out.println("***********************************************************************");
	}

}
