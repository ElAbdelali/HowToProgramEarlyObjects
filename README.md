# HowToProgramEarlyObjects
Repo consists of End of Chapter problems from the Textbook: Java How to Program, 11/e, Early Objects Version which can be found following this link: https://amzn.to/30ZQVw0

Will update the README with which chapter problems I've completed as I complete them. 

For those that come across this repository, please implement your own approach to the code and use the exercises I've completed as guidance. You gain nothing from copying! Try to understand what it is that you are implementing in order to excel in your learning.

Chapter 03: 

3.11 (Modified Account Class) 

Modify class Account (Fig. 3.8) to provide a method called with- draw that withdraws money from an Account. Ensure that the withdrawal amount does not 	exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest (Fig. 3.9) to test method withdraw.

3.12 (Class PetrolPurchase) 

Create a class called PetrolPurchase to represent information about the petrol you purchase. The class should include five pieces of information in the form of instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount (double). Your class should have a constructor that initializes the five instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getPurchase- Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter) minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.

3.13 (Car Class) 
     
Create a class called Car that includes three instance variables—a model (type String), a year (type String), and a price (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the price is not positive, do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
     
3.14 (Clock Class)
	
Create a class called Clock that includes three instance variables—an hour (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. The set method should set the value of all three variables to 0 if the value of hour is more than 23, the value of minute is more than 59, and the value of second is more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write a test app named ClockTest that demonstrates class Clock’s capabilities.

3.15 (Removing Duplicated Code in Method main) 

In the AccountTest class of Fig. 3.9, method main contains six statements (lines 11–12, 13–14, 26–27, 28–29, 38–39 and 40–41) that each display an Account object’s name and balance. Study these statements and you’ll notice that they differ only in 	the Account object being manipulated—account1 or account2. In this exercise, you’ll define a new displayAccount method that contains one copy of that output statement. The method’s parameter will be an Account object and the method will output the 	object’s name and balance. You’ll then replace the six duplicated statements in main with calls to displayAccount, passing as an argument the specific Account object to output.
Modify class AccountTest of Fig. 3.9 to declare method displayAccount (Fig. 3.20) after the closing right brace of main and before the closing right brace of class AccountTest. Replace the comment in the method’s body with a statement that displays accountToDisplay’s name and balance. Recall that main is a static method, so it can be called without first creating an object of the class in which main is declared. We also declared method displayAccount as a static method. When main needs to call another method in the same class without first creating an object of that class, the other method also must be declared static. Once you’ve completed displayAccount’s declaration, modify main to replace the statements that display each Account’s name and balance with calls to displayAccount—each receiving as its argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest class to ensure that it produces the same output as shown in Fig. 3.9. Recall that main is a static method, so it can be called without first creating an object of the class in which main is declared. We also declared method displayAccount as a static method. When main needs to call another method in the same class without first creating an object of that class, the other method also must be declared static. Once you’ve completed displayAccount’s declaration, modify main to replace the statements that display each Account’s name and balance with calls to displayAccount—each receiving as its argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest class to ensure that it produces the same output as shown in Fig. 3.9.
     
Chapter 04:

4.17: (Gas Mileage)

Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by recording the miles driven and gallons used for each tank-full. Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data from the user.

4.18 (Credit Limit Calculator) 

Develop a Java application that determines whether any of sev- eral department-store customers has exceeded the credit limit on a charge account. For each customer, the following facts are available: 

		a) account number
		b) balance at the beginning of the month
		c) total of all items charged by the customer this month
		d) total of all credits applied to the customer’s account this month
		e) allowed credit limit
		
The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits), display the new balance and determine whether the new balance exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis- play the message "Credit limit exceeded".

4.19: (Sales Commission Calculator)

A large company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
	
	(I Took a different approach and made the getters and setters fetch the input prices while asking the user to input the amount of items
	sold via a Scanner object) 

4.21: (Find the Largest Number)

The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables:
	
	a) counter: A counter to count to 10 (i.e., to keep track of how many numbers 
	   have been input and to determine when all 10 numbers have been processed).
	b) number:Theintegermostrecentlyinputbytheuser. 
	c) largest: The largest number found so far.
	
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

4.24: (Validating User Input) 

Modify the program in Fig. 4.12 to validate its inputs. For any input, if the value entered is other than 1 or 2, keep looping until the user enters a 	correct value.	

Chapter 05:

5.11 (Extremes)

Write an application that finds the minimum and maximum amongst several integers and then computes the sum of the two extremes. The user will be prompted to input how many values the application should ask the user to input.

5.12 (Integers Divisible by 3) 

Write an application that calculates the sum of those integers between 1 and 30 that are divisible by 3.

	
5.13 (The Sum of a Series) 

Find the summation of the sequence of numbers 1, 2, 3 ... n, where n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the corresponding sum. If this were a product instead of a sum, what difficulty might you encounter with the variable that accumulates the product?
	
5.15 (Triangle Printing Program) 

Write an application that displays the following patterns sep- arately, one below the other. Use for loops to generate the patterns. All asterisks (*) should be print- ed by a single statement of the form System.out.print('*'); which causes the asterisks to print side by side. A statement of the form System.out.println(); can be used to move to the next line. A statement of the form System.out.print(' '); can be used to display a space for the last two pat- terns. There should be no other output statements in the program. [Hint: The last two patterns re- quire that each line begin with an appropriate number of blank spaces.]
	
5.16 (Bar-Chart Printing Program) 

One interesting application of computers is to display graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each number that’s read, your program should display the same number of adjacent asterisks. For exam- ple, if your program reads the number 7, it should display *******. Display the bars of asterisks after you read all five numbers.

5.21 (Pythagorean Triples) 

A right triangle can have sides whose lengths are all integers. The set of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple. The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the sides is equal to the square of the hypotenuse. Write an application that displays a table of the Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll learn in more advanced computer-science courses that for many interesting problems there’s no known algorithmic approach other than using sheer brute force.

5.23 (De Morgan’s Laws) 

In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !. De Morgan’s laws can sometimes make it more convenient for us to express a logical expression. These laws state that the expression !(condition1 && condition2) is logically equivalent to the expres- sion (!condition1 || !condition2). Also, the expression !(condition1 || condition2) is logically equivalent to the expression (!condition1 && !condition2). Use De Morgan’s laws to write equivalent expressions for each of the following, then write an application to show that both the original expression and the new expression in each case produce the same value:
	
	a) !(x<5)&&!(y>=7) 
	b) !(a == b) || !(g != 5) 
	c) !((x<=8)&&(y>4)) 
	d) !((i > 4) || (j <= 6))

5.24 (Diamond-Printing Program) 

Write an application that prints the following diamond shape. You may use output statements that print a single asterisk (*), a single space or a single new- line character. Maximize your use of iteration (with nested for statements), and minimize the num- ber of output statements.

5.25 (Modified Diamond Printing Program) 

Modify the application you wrote in Exercise 5.24 to read an odd number in the range 1 to 19 to specify the number of rows in the diamond. Your program should then display a diamond of the appropriate size.

Chapter 06:

6.8 (Parking Charges) 

A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time. Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday. You should enter the hours parked for each customer. The program should display the charge for the current customer and should calculate and display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.
	
6.10 (Rounding Numbers) 

To round numbers to specific decimal places, use a statement like 
		double y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or 
		double y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal point). 
	
Write an application that defines four methods for rounding a number x in various ways:
	a) roundToInteger(number)
	b) roundToTenths(number)
	c) roundToHundredths(number) 
	d) roundToThousandths(number)

6.14 (Floor and Ceil) 

Write two methods myFloor and myCeil that take a positive double num variable int myFloor(double num) and int myCeil(double num). The myFloor method takes num and returns the largest integer number that is less than or equal to x. The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do not use any Math class methods. Incorporate this method into an application that sends a double value to the functions and tests their ability to calculate the required output.

6.16 (Multiples) 

Write a method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of the first. The method should take two integer arguments and return true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.] Incorporate this method into an application that inputs a series of pairs of integers (one pair at a time) and determines whether the second value in each pair is a multiple of the first.

6.23 (Palindrome Numbers) 

A positive integer is a palindrome if its value is the same after reversing the order of the digits in the number. For example, 12321 is a palindrome, but 12563 is not. Write a method that determines whether a number is a palindrome. Use this method in an application that determines whether a number entered by the user is a palindrome or not and prints the result to the console.
	
	
6.24 (Perfect Numbers) 

An integer number is said to be a perfect number if its factors, including 1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 = 1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number. Use this method in an application that displays all the perfect numbers between 1 and 1000. Display the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing power of your computer by testing numbers much larger than 1000. Display the results.

6.26 (Calculating the Sum of Digits) 

Write a method that takes a four-digit integer value and returns the sum of the digits. For example, given the number 7631, the method should return 17. Incorporate the method into an application that reads a value from the user and displays the result.
	

6.28 (Sports Recommender)

Write a method sportsRecommender that inputs a Celsius temperature and returns “It’s lovely weather for sports today!” if it’s 20–30 °C, “It’s reasonable weather for sports today.” if it’s 10–40 °C, and “Please exercise with care today, watch out for the weather!” otherwise. Create an application to test the method.
	
6.30 (Guess the Number) 

Write an application that plays “guess the number” as follows: Your program chooses the number to be guessed by selecting a random integer in the range 1 to 1000. The application displays the prompt Guess a number between 1 and 1000. The player inputs a first guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too low. Try again. to help the player “zero in” on the correct answer. The program should prompt the user for the next guess. When the user enters the correct answer, display Congratulations. You guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19, Searching, Sorting and Big O.]
	
6.31 (Guess-the-Number Modification) Modify the program of Exercise 6.30 to count the number of guesses the player makes. If the number is 10 or fewer, display Either you know the secret or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret! If the player makes more than 10 guesses, display You should be able to do better! Why should it take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate half of the numbers, then half of the remaining numbers, and so on.
	
Chapter 07:

7.10 (Pixel Quantization) 

Use a one-dimensional array to solve the following problem: You want to eventually perform some basic compression on an image. Assume that you will only be operating on a single row of the image, and that pixel colors are represented as simple numbers in the array. You are required to quantize the values of the pixels in the row. In other words, any pixel values appearing in a range will assume a value in that range as indicated below. This creates redundancy that can lead to better compression. Overwrite the original values in the array.
	a) For 0–20: 10
	b) For 21–40: 30
	c) For 41–60: 50
	d) For 61–80: 70
	e) For 81–100: 90
	f) For 101–120: 110
	g) For 121–140: 130
	h) For 141–160: 150
	i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
	Print the array with the new, quantized values.

7.12 (Duplicate Elimination) 

Use a one-dimensional array to solve the following problem: Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save each number that was read in an array that was initialized to a value of -1 for all elements. Assume a value of -1 indicates an array element is empty. You are then to process the array, and remove duplicate elements from the array containing the numbers you input. Display the contents of the array to demonstrate that the duplicate input values were actually removed. [Note: do not display the array elements where the value is -1.]

7.14 (Variable-Length Argument List) 
	
Write an application that calculates the average of a series of integers that are passed to method average using a variable-length argument list. Test your method with several calls, each with a different number of arguments.

7.15 (Command-Line Arguments) 

Write a program that takes command-line arguments and computes the average of their maximum and minimum. Make sure there are command-line arguments being passed before you attempt to compute anything.

7.20 (Archery Game) 

A group of four friends visit a sports club and they decide to practice archery. Each player gets 3 chances and in every chance they can score between 0 to 10 points. The player with the maximum score after adding the scores obtained in all 3 chances wins. Write an application that simulates this game and prints the scores of all four players in a tabular format and also prints which player won.

Each line in the table should contain the following:

1) The player number
2) Their first chance score
3) Their second chance score
4) Their third chance score
5) Their score after all three chances

Use multidimensional arrays to store the scores of players in each chance.
Use the secure random-number generation mechanism learnt in the previous chapter to generate scores between 0 and 10 for each player chance.

Chapter 8:

8.4 (Cylinder Class) 

Create a class Cylinder with attributes radius and height, each of which has a default value of 1. Provide a method that calculates the cylinders’ volume, which is pi multiplied by the square of the radius multiplied by the height. It has set and get methods for both radius and height. The set method should verify that radius and height are positive numbers. Write a program to test class Cylinder.

8.6 (Savings Account Class) 

Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders. Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and print the new balances for both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.


8.10 (enum type)

Write an enum type Food, whose constants (APPLE, BANANA, CARROT) take two parameters —the type (vegetable or fruit), and number of calories. Write a program to test the Food enum so that it displays the enum names and their information.

8.11 (Complex Numbers) 
Create a class called Complex for performing arithmetic with complex numbers. Complex numbers have the form
		
		realPart + imaginaryPart * i
		where i is sqrt(–1)

Write a program to test your class. Use floating-point variables to represent the private data of the class. Provide a constructor that enables an object of this class to be initialized when it’s declared. Provide a no-argument constructor with default values in case no initializers are provided. Provide public methods that perform the following operations:

a) Add two Complex numbers: The real parts are added together and the imaginary parts are added together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from the real part of the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
c) Print Complex numbers in the form (realPart, imaginaryPart).

