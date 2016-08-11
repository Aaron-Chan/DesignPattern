package com.aaronchan.chain;

public class App {

	public static void main(String[] args) {
		RequestHandler boss = new Boss(null);
		RequestHandler mangaer = new Manager(boss);
		RequestHandler employee = new Employee(mangaer);
		Request request1 = new Request(RequestType.DISTRIBUTION_LEVEL_A, "A");
		Request request2 = new Request(RequestType.DISTRIBUTION_LEVEL_B, "B");
		Request request3 = new Request(RequestType.DISTRIBUTION_LEVEL_C, "C");
		employee.handleRequest(request1);
		employee.handleRequest(request2);
		employee.handleRequest(request3);
	}

}
