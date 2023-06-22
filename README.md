# Calculator Microservice

This is a calculator microservice that performs addition and subtraction operations.

## Prerequisites

- Java Development Kit (JDK) installed
- Apache Maven installed

## Build and Run

1. Clone the repository:

   ```bash
   git clone https://github.com/bogdangutorovych/Calculator.git

2. Use master branch:

   ```bash
   git checkout master
   
3. Navigate to the project directory:

   ```bash
   cd calculator

4. Build the project using Maven:

   ```bash
   mvn clean package

5. Run the microservice:

   ```bash
   java -jar target/calculator-0.0.1-SNAPSHOT.jar
   
## API Endpoints

* Addition: /add

  * Method: GET
  * Request Parameters: operand1, operand2
  * Example: http://localhost:8080/add?operand1=5&operand2=3

* Subtraction: /subtract

  * Method: GET
  * Request Parameters: operand1, operand2
  * Example: http://localhost:8080/subtract?operand1=8&operand2=4
