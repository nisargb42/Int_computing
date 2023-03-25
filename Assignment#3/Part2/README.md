## JUnit Testing
This is a sample JUnit testing project with four test cases for different methods of a class called JunitTesting.

## JunitTesting Class
This class has three methods:

- square: This method takes an integer argument and returns the square of that integer.
- divide: This method takes two double arguments and returns the result of dividing the first argument by the second.
- countA: This method takes a string argument and returns the count of 'a' and 'A' characters in the string.

## Test Cases
There are four test cases in this project:

- squareTest: This test case tests the square method of JunitTesting class.
- countATest: This test case tests the countA method of JunitTesting class.
- divideTest: This test case tests the divide method of JunitTesting class.
- testDivideByZero: This test case tests the scenario when the second argument of the divide method is zero.

## AllTests Class
This class is used to run all the test cases at once using JUnit's @Suite and @SelectClasses annotations.

To run the tests, simply execute the AllTests class.

## Dependencies
JUnit 5.7.2

## Conclusion
This project is just a sample to showcase how JUnit testing can be done for a Java project. In real-world projects, there can be many more test cases with a lot more complexity. Testing is a critical aspect of software development, and JUnit is one of the most popular testing frameworks in Java.
