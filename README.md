## Overview
Simple spring-boot application with 2 Microservices

This project is using Java 17, Maven and Spring-boot

## Setup Instructions

1. Clone the repository 
2. Ensure you have JDK 17 and Maven installed.
3. Ensure your path variables are set correctly 
4. Open the cmd and navigate to the project
5. Run the application with "mvn clean install spring-boot:run"
6. Make a POST request to http://localhost:8080/shuffle
   * 6.1 Use PostMan to make the request
     1) POST http://localhost:8080/shuffle?number={someNumber}
     2) POST http://localhost:8080/shuffle and add the number as a form data<br/>
   * 6.2 Do a CURL request
7. You can see the log in the console
   

