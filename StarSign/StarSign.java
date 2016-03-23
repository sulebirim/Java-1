/*
*StarSign.java
*Vladislavs Vasiljevs
*23/03/16
*/

public class StarSign{

	//var
	private String month, sign;
	private int date;

	//con
	public StarSign(){
		month = new String();
		sign = new String();
		date = 0;
	}

	//set method
	public void setMonth(String month){
		this.month = month;
	}

	public void setDate(int date){
		this.date = date;
	}

	//compute
	public void compute(){
		if(month.equalsIgnoreCase("January") && (date >= 1 && date <= 19)){
			sign = "Capricorn";
		}
		else if(month.equalsIgnoreCase("January") && (date >= 20 && date <= 31)){
			sign = "Aquarius";
		}
		if(month.equalsIgnoreCase("February") && (date >= 1 && date <= 18)){
			sign = "Aquarius";
		}
		else if(month.equalsIgnoreCase("February") && (date >= 19 && date <= 28)){
			sign = "Pisces";
		}
		if(month.equalsIgnoreCase("March") && (date >= 1 && date <= 20)){
			sign = "Pisces";
		}
		else if(month.equalsIgnoreCase("March") && (date >= 21 && date <= 31)){
			sign = "Aries";
		}
		if(month.equalsIgnoreCase("April") && (date >= 1 && date <= 19)){
			sign = "Aries";
		}
		else if(month.equalsIgnoreCase("April") && (date >= 20 && date <= 30)){
			sign = "Taurus";
		}
		if(month.equalsIgnoreCase("May") && (date >= 1 && date <= 20)){
			sign = "Taurus";
		}
		else if(month.equalsIgnoreCase("May") && (date >= 21 && date <= 31)){
			sign= "Gemini";
		}
		if(month.equalsIgnoreCase("June") && (date >= 1 && date <= 20)){
			sign = "Gemini";
		}
		else if(month.equalsIgnoreCase("June") && (date >= 21 && date <= 30)){
			sign = "Cancer";
		}
		if(month.equalsIgnoreCase("July") && (date >= 1 && date <= 22)){
			sign = "Cancer";
		}
		else if(month.equalsIgnoreCase("July") && (date >= 23 && date <= 31)){
			sign ="Leo";
		}
		if(month.equalsIgnoreCase("August") && (date >= 1 || date <= 22)){
			sign = "Leo";
		}
		else if(month.equalsIgnoreCase("August") && (date >= 23 && date <= 31)){
			sign = "Virgo";
		}
		if(month.equalsIgnoreCase("September") && (date >= 1 && date <= 22)){
			sign = "Virgo";
		}
		else if(month.equalsIgnoreCase("September") && (date >= 23 && date <= 30)){
			sign = "Libra";
		}
		if(month.equalsIgnoreCase("October") && (date >= 1 && date <= 22)){
			sign = "Libra";
		}
		else if(month.equalsIgnoreCase("October") && (date >= 23 && date <= 31)){
			sign = "Scorpio";
		}
		if(month.equalsIgnoreCase("November") && (date >= 1 && date <= 21)){
			sign = "Scorpio";
		}
		else if(month.equalsIgnoreCase("November") && (date >= 22 && date <= 30)){
			sign = "Sagittarius";
		}
		if(month.equalsIgnoreCase("December") && (date >= 1 && date <= 21)){
			sign = "Sagittarius";
		}
		else if(month.equalsIgnoreCase("December") && (date >= 22 && date <= 30)){
			sign = "Capricorn";
			}
		}

		//get method
		public String getSign(){
			return sign;
		}
		public String getMonth(){
			return month;
		}
	}








