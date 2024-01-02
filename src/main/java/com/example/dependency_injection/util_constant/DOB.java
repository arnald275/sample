package com.example.dependency_injection.util_constant;

class DOB {
	
	private Week week;
	private Month month;
	private int date;
	
	public DOB(int date,Week week,Month month) {
		this.date=date;
		this.week=week;
		this.month=month;
	}
	
	

	public void setWeek(Week week) {
		this.week = week;
	}



	public void setMonth(Month month) {
		this.month = month;
	}



	public void setDate(int date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "DOB [week=" + week + ", month=" + month + ", date=" + date + "]";
	}
	

}
