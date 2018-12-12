package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Scheduling.Util;
import entity.Process;

/*
 * 简单轮转法
 */ 
public class rotation {
	/**
	 * 算法
	 */
	public static void rotation(List<Process> list){
		//先来先服务
		String[] Status = new String[1024] ;
		for (int i = 0; i < list.size(); i++) {
			Status[i] = list.get(i).getStatus();
		}
		if(list.size()!=0 && Arrays.asList(Status).contains("Wait")){
			list.sort(Comparator.naturalOrder());//按照到达时间排序
		}	
		run(list);
	}
	
	/**
	 * 程序运行
	 * @param list
	 */
	public static void run(List<Process> list){
		String[] Status = new String[1024] ;
		for (int i = 0; i < list.size(); i++) {
			Status[i] = list.get(i).getStatus();
		}
		int i = 0;
		while(Arrays.asList(Status).contains("Wait")){
			int serverTime = list.get(0).getServerTime();
			int size = list.size();
			
			if(list.get(0).getStatus().equals("Wait")){//仅就绪状态的进程运行
				serverTime++;
				list.get(0).setServerTime(serverTime);
				if(list.get(0).getServerTime() == list.get(0).getNeededTime()){
					list.get(0).setStatus("Finish");//运行完了
				}				
				list.add(size, list.get(0));//把头部插入尾部
				list.remove(0);	
				i++;
				System.out.println("第"+i+"次调度之后");
				Util.print(list);	
				System.out.println("********************************************");
			}else{
				list.add(size, list.get(0));//把头部插入尾部
				list.remove(0);	
			}
		}	
	
		}
	

}

