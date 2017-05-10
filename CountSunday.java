package project_Euler;
/**
 * 
*  QUUESTION
*  You are given the following information, but you may prefer to do some research for yourself.
*  
*   1 Jan 1900 was a Monday.
*    Thirty days has September,
*    April, June and November.
*    All the rest have thirty-one,
*    Saving February alone,
*    Which has twenty-eight, rain or shine.
*    And on leap years, twenty-nine.
*    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

*    How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

*    Leap Years
*    1896,	1904	1908	1912	1916	1920	1924	1928	1932	1936
*    1940	1944	1948	1952	1956	1960	1964	1968	1972	1976
*    1980	1984	1988	1992	1996	2000

 * @author jonathanasante
 *
 */
public class CountSunday {
/**
 * This method initializes all the global variables 
 * @param args
 */
public static void main(String[] args) {
		
		
		int imonths[] = {31,28,31,30,31,30,31,31,30,31,30,31};			//List total days for each month of a year
		String imydays = "SUNDAY";										//set the day we are looking for
		String idays[] = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};		//List names of the week
		
		countDays(imonths,imydays,idays);		
		
	}
/**
 * This method finds the number of sundays that occur on the first day of the month between the year 1901 and 2000
 * @param months
 * @param mydays
 * @param days
 */
public static void countDays(int months[], String mydays, String days[]){
	
	//Declarations
	int count = 0, j=0, sevencount = 0;
	
	//Set scope for the years
			for (int year = 1900; year<=2000; year++){	
				if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))	//Check if leap year and modify days in month of April accordingly
					months[1] = 29;
				else
					months[1] = 28;
				
				//Run for all months in the year
				for(int month = 0; month<12; month++){							
				   
					//check for the number of Sunday in a month
					for(int i = 0; i<months[month]; i++){
						if(sevencount == 7)
							   sevencount = 0;
						
						//check for number of Sunday in a week
						for(j = sevencount; j<days.length && i< months[month]; j++){
							if((days[j]== mydays)&&(year>=1901)&&(i == 1))
								count++;
								i++;
							
							
								System.out.println("The current day is : " + days[j] + " , year is " + year + " and number of days for month " + (month + 1) + " is : " + i);
						}
								i--;	
								sevencount = j;
					}
					
			}
			}
			System.out.println("The number of Sundays in this year is : " + count);
}
}

