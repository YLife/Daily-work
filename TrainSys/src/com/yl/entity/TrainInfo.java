package com.yl.entity;
/**
 * 封装车次信息
 * @author Mr.Yang
 *
 */
public class TrainInfo {
	private String trainNo;
	private String startStation;
	private String arrivalStation;
	private String startTime;
	private String arrivalTime;
	private String type;
	private String runtime;
	private double mile;
	
	public TrainInfo() {
		super();
	}
	public TrainInfo(String trainNo, String startStation,
			String arrivalStation, String startTime, String arrivalTime,
			String type, String runtime, double mile) {
		super();
		this.trainNo = trainNo;
		this.startStation = startStation;
		this.arrivalStation = arrivalStation;
		this.startTime = startTime;
		this.arrivalTime = arrivalTime;
		this.type = type;
		this.runtime = runtime;
		this.mile = mile;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getArrivalStation() {
		return arrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public double getMile() {
		return mile;
	}
	public void setMile(double mile) {
		this.mile = mile;
	}

}
