
public class TestCountry {

	public static void main(String[] args) {
		
		System.out.println("Fun with Facts About Countries!");
		
		Country c1 = new Country();
		System.out.println(c1.toString());
		
		Country c2 = new Country("Jameica");
		System.out.println(c2.toString());
		
		//create these 3 countries
		
		Country c3 = new Country("Canada", 38654748l, 22370000000000.00, true);
		System.out.println(c3.toString());
		
		Country c4 = new Country("Greece", 10432481l, 378693000000.00, true);
		System.out.println(c4.toString());

		Country c5 = new Country("South Korea", 51744816l, 27350000000000.00, true);
		System.out.println(c4.toString());
		

		//Canada pop: 38,654,738 GDP: $2.237 trillion DriveRightSide:true
		//Greece pop: 10,432,481 GDP: $378.693 billion DriveRightSide: true
		//Nigeria pop: 218,541,212 GDP: $1.268 trillion DriveRightSide: true
		//Add either the country you were born (find stats Wikipedia) or if already done, the country you want to visit most
		
		//print the 4 countries using the ToString method
		
		//use a setter and getter to increase the population of each country by 1 person
		//ie. if it was 38,654,738 before, make it 38,654,739 DO NOT HARD CODE IT
		long pop = c3.getPopulation();
		pop += 1;
		c3.setPopulation(pop);
		
		c4.setPopulation(c4.getPopulation()+1);
		
		//print the 4 countries using the ToString method
		
	    //print the GDP per capita of each country
		c3.printGDPper();
		c4.printGDPper();
		c5.printGDPper();

	}

}
