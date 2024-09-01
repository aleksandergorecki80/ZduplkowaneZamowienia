package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ZduplkowaneZamowieniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZduplkowaneZamowieniaApplication.class, args);

		Set<String> orders = new HashSet<>();
		orders.add("R_D_#__01");
		orders.add("R_D_#__02");
		orders.add("R_D_#__03");
		orders.add("R_D_#__03");
		orders.add("R_D_#__03");
		orders.add("R_D_#__04");

		Iterator<String> iterator = orders.iterator();
		while (iterator.hasNext()) {
			String order = iterator.next();
			iterator.remove();
			System.out.println("Order:" + order + " completed.");
		}
		System.out.println(orders.size());
	}

}
