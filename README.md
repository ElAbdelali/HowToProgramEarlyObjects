# HowToProgramEarlyObjects
Repo consists of End of Chapter problems from the Textbook: Java How to Program, 11/e, Early Objects Version which can be found following this link: https://amzn.to/30ZQVw0

Will update the README with which chapter problems I've completed as I complete them. 

Chapter 03: 

3.12 (Class PetrolPurchase) 
    Create a class called PetrolPurchase to represent information about the petrol you purchase. The class should include five pieces of information in the form of
    instance variables—the station’s location (type String), the type of petrol (type String), the quan- tity (type int) of the purchase in liters, the price per liter (double), and the percentage discount (double). Your class should have a constructor that initializes the five instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getPurchase- Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter) minus the discount, then returns the net amount you had to pay as a double value. Write an appli- cation class named Petrol that demonstrates the capabilities of class PetrolPurchase.

3.13 (Car Class) 
     Create a class called Car that includes three instance variables—a model (type String), a year (type String), and a price (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the price is not positive, do not set its value. Write a test application named CarApplication that demonstrates class Car’s ca- pabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
     
3.16 (Target-Heart-Rate Calculator)
    While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested by your trainers and doctors. According to
    The American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for cal- culating your maximum heart rate in beats per minute is 220 minus your age in years. Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health-care professional before beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and returns the per- son’s maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a Java app that prompts for the person’s information, instantiates an object of class Heart- Rates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target- heart-rate range.

Chapter 4

4.17: Gas Mileage

Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by recording the miles driven and gallons used for each tank-full. Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data from the user.
