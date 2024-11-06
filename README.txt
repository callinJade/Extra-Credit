Zip: zip -r Jade-Collins-EC.zip cs250 -x cs250/hw1/\* -x cs250/hw2/\* -x cs250/hw3/\* -x cs250/hw4/\*

DecimalToBinary:
    java cs250.ec.convert.DecimalToBinary <decimal-number>
    Compile: javac cs250/ec/convert/DecimalToBinary.java
    Run: java cs250.ec.convert.DecimalToBinary 0.5

AlphaHistogram:
    java cs250.ec.counting.AlphaHistogram “<sentence>”
    Compile: javac cs250/ec/counting/AlphaHistogram.java
    Run: java cs250.ec.counting.AlphaHistogram "I am taking Computer Foundations"

Equation:
    java cs250.ec.order.Equation <x> <y>
    Compile: javac cs250/ec/order/Equation.java
    Run: java cs250.ec.order.Equation -2 -5


This program has three classes: DecimalToBinary, AlphaHistogram, and Equation

Each of the classes reside in three different folders. The first class, DecimalToBinary,
takes a single argument of a decimal, converts it to its binary representation, and prints it.
The second class, AlphaHistogram, takes a sentence as an argument and counts the occurance
of each letter and prints them in priority order from the most common letters on. The 
third class, Equation, implements an equation. It takes two integers as arguments and 
prints the result of the equation. 