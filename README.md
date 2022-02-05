# HowToProgramEarlyObjects
Repo consists of End of Chapter problems from the Textbook: Java How to Program, 11/e, Early Objects Version which can be found following this link: https://amzn.to/30ZQVw0

Will update the README with which chapter problems I've completed as I complete them. 

Chapter 03: 

3.12 (Class PetrolPurchase) 
    Create a class called PetrolPurchase to represent information about the petrol you purchase. The class should include five pieces of information in the form of
    instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount (double). Your class should have a constructor that initializes the five instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getPurchase- Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter) minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.

3.13 (Car Class) 
     Create a class called Car that includes three instance variables—a model (type String), a year (type String), and a price (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the price is not positive, do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
     
3.16 (Target-Heart-Rate Calculator)
    While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested by your trainers and doctors. According to
    The American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health-care professional before beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and returns the per- son’s maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a Java app that prompts for the person’s information, instantiates an object of class Heart- Rates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target- heart-rate range.

Chapter 04:

4.17: (Gas Mileage)
    Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by recording the miles driven and gallons used for each tank-full. Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data from the user.

4.21: (Find the Largest Number)
	The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables:
	
	a) counter: A counter to count to 10 (i.e., to keep track of how many numbers 
	   have been input and to determine when all 10 numbers have been processed).
	b) number:Theintegermostrecentlyinputbytheuser. 
	c) largest: The largest number found so far.
4.19: (Sales Commission Calculator)
	A large company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
	
	(I Took a different approach and made the getters and setters fetch the input prices while asking the user to input the amount of items
	sold via a Scanner object) 
4.22: (Tabular Output)
	Write a Java application that uses looping to print the following table of values:
	
	N 	N2 	N3 	N4
	1	1	1	1
	2 	4 	8 	16 
	3 	9 	27 	81 
	4 	16 	64 	256 
	5 	25 	125 	625

4.23: (Find the Two Largest Numbers)
	Using an approach similar to that for Exercise 4.21, find the two largest values of the 10 values entered. [Note: You may input each number only once.]	
	

Chapter 05:

5.11 (Extremes)
	Write an application that finds the minimum and maximum amongst several integers and then computes the sum of the two extremes. The user will be prompted to input how many values the application should ask the user to input.


	
    

