package nl.sogyo.quotes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class DatePrinter {

	String dateString;
	LocalDate localDate;

	public DatePrinter() {
		
		localDate = LocalDate.now();
	}

	public String getDateString(){
		
		dateString = getNameOfDay(localDate.getDayOfWeek());
		dateString += " the ";
		dateString += localDate.getDayOfMonth();
		dateString += getDateSuffix();
		dateString += " of ";
		dateString += getMonthName(localDate.getMonth());
		dateString += ":";
		
		return dateString;
	}

	public Integer getToBePrintedLine() {
		
		return (localDate.getDayOfYear() % 6);
	}

	private String getNameOfDay(DayOfWeek dayOfWeek){
		
		return (dayOfWeek.toString().substring(0,1) + dayOfWeek.toString().substring(1).toLowerCase());
	}

	private String getDateSuffix(){
		
		if (localDate.getDayOfMonth() == 1 || localDate.getDayOfMonth() == 11 || localDate.getDayOfMonth() == 21 || localDate.getDayOfMonth() == 31){
			return "st";
		} else if (localDate.getDayOfMonth() == 2 || localDate.getDayOfMonth() == 12 || localDate.getDayOfMonth() == 22){
			return "nd";
		} else if (localDate.getDayOfMonth() == 3 || localDate.getDayOfMonth() == 13 || localDate.getDayOfMonth() == 23){
			return "rd";
		} else {
			return "th";
		}
	}

	private String getMonthName(Month monthName){
		return (monthName.toString().substring(0,1) + monthName.toString().substring(1).toLowerCase());
	}
}
