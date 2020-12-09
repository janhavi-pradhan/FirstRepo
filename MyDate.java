package com.pk;

public class MyDate {
	private int day, month, year;
	public MyDate(){
		day=17;
		month=11;
		year=2020;
	}
	public MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public void display() {
		System.out.println("\nDate : "+day+"/"+month+"/"+year);
	}
	int getDay() {
		return day;
	}
	int getMonth() {
		return month;
	}
	int getYear() {
		return year;
	}
	void setDay(int d) {
		day=d;
	}
	void setMonth(int m) {
		month=m;
	}
	void setYear(int y) {
		year=y;
	}
	public static void main(String[] args) {
		MyDate m1=new MyDate();
		m1.display();
		System.out.println("Memory Location : "+m1.hashCode());
		MyDate m2=new MyDate(18,11,2020);
		m2.display();
		System.out.println("Memory Location : "+m2.hashCode());
		System.out.println("Day : "+m2.getDay());
		m2.setDay(19);
		System.out.println("Object : "+m2);
	}

}
