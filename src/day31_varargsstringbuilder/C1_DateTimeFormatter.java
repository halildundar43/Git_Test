package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt); // 2021-03-21T17:26:27.806113700
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		/*
        yy : yilin son iki rakamini : 21
        yyyy: yilin tamamini : 2021
        M: ay sirasini verir mart icin : 3
        MM: ay sirasini verir mart icin : 03
        MMM : Ay isminin ilk uc harfini verir : Mar
        MMMM : Ay isminin tamamini verir : Mart
        */

		System.out.println(dtf.format(ldt)); // 21/Mart/21 05:30
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt)); //21/Mar/21
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm"); // HH : 24 saat'lik sisteme gore
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm"); // hh : pm/am sistemine gore
        System.out.println(dtf3.format(ldt)); // 17:22  24 saat'lik sisteme gore
        System.out.println(dtf4.format(ldt)); // 05:22  pm/am sistemine gore
        
        LocalDate dogumTarihi = LocalDate.of(1995, 1, 12);
        LocalDate bugun = LocalDate.now();
        
        Period benimYasim = Period.between(dogumTarihi, bugun);// P26Y2M9D
        System.out.println(benimYasim);
        
        int yas=Period.between(dogumTarihi, bugun).getYears();
        System.out.println(yas);


	}

}
