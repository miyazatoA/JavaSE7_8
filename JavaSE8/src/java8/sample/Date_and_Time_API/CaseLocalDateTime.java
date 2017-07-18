package java8.sample.Date_and_Time_API;

import java.time.LocalDateTime;

public class CaseLocalDateTime {
		public static void main(String[] args){
		System.out.println("-----LocalDateTime-----");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonthValue());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getMonth());
	}
}
