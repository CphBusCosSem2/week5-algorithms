# Exercises for day 1

##Exercise 1 (measure execution time)

Import the file “Collections and Efficiency – demo.zip” (from Fronter) and open the project “time_measure_demo”.

*	Run the program “MeasureSimpleCode”. Compare your observations with your neighbours.
..* What can be concluded?

*	Run with different values of ‘n’. Observe how the execution time varies with “n”.
..* Conclusion?

Note: In this project we have disabled the "Just-in-time compilation”. In NetBeans this is done by:

...Right click the project > properties > Run 
...set ”VM Options”  to  ”-Djava.compiler=NONE” > OK

##Exercise 2 (another “algorithm”)

Now, add the statement below to the loop in exercise 1 and figure out how execution time varies with “n” after the change.

...n = n/2;

Conclusion?