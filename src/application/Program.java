package application;

import services.MGDeductionService;
import services.PayService;

public class Program {

	public static void main(String[] args) {

		PayService payService = new PayService(new MGDeductionService());

		double tax = payService.tax(1000.0);

		System.out.println(tax);

	}

}
