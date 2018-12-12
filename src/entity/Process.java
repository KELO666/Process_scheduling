package entity;

import java.util.Date;

public class Process implements Comparable<Process>{
	String name;  //进程名
	Date arriveTime; //到达时间
	int serverTime; //服务时间
	int priorityNum; //优先数
	int neededTime; //需要时间
	String status; //进程状态(Wait-就绪  Run-运行 Finish-完成)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	public int getServerTime() {
		return serverTime;
	}
	public void setServerTime(int serverTime) {
		this.serverTime = serverTime;
	}
	public int getPriorityNum() {
		return priorityNum;
	}
	public void setPriorityNum(int priorityNum) {
		this.priorityNum = priorityNum;
	}
	public int getNeededTime() {
		return neededTime;
	}
	public void setNeededTime(int neededTime) {
		this.neededTime = neededTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "process [name=" + name + ", arriveTime=" + arriveTime + ", serverTime=" + serverTime + ", priorityNum="
				+ priorityNum + ", neededTime=" + neededTime + ", status=" + status + "]";
	}
	@Override
	public int compareTo(Process p) {
	//自定义比较方法，如果认为此实体本身大则返回1，否则返回-1
		if(this.arriveTime.compareTo(p.arriveTime)==1){
			return 1;
		}
			return -1;
	}

}
