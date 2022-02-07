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

5.21 (Pythagorean Triples) 
	A right triangle can have sides whose lengths are all integers. The set of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple. The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the sides is equal to the square of the hypotenuse. Write an application that displays a table of the Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll learn in more advanced computer-science courses that for many interesting problems there’s no known algorithmic approach other than using sheer brute force.
	
Chapter 06:
6.14 (Floor and Ceil) 
	Write two methods myFloor and myCeil that take a positive double num variable int myFloor(double num) and int myCeil(double num). The myFloor method takes num and returns the largest integer number that is less than or equal to x. The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do not use any Math class methods. Incorporate this method into an application that sends a double value to the functions and tests their ability to calculate the required output.

6.16 (Multiples) 
	Write a method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of the first. The method should take two integer arguments and return true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.] Incorporate this method into an application that inputs a series of pairs of integers (one pair at a time) and determines whether the second value in each pair is a multiple of the first.

6.23 (Palindrome Numbers) 
	A positive integer is a palindrome if its value is the same after reversing the order of the digits in the number. For example, 12321 is a palindrome, but 12563 is not. Write a method that determines whether a number is a palindrome. Use this method in an application that determines whether a number entered by the user is a palindrome or not and prints the result to the console.

6.26 (Calculating the Sum of Digits) 
	Write a method that takes a four-digit integer value and returns the sum of the digits. For example, given the number 7631, the method should return 17. Incorporate the method into an application that reads a value from the user and displays the result.
