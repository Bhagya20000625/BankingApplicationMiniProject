# Banking Application Mini Project

A simple Java-based interactive console banking application created to practice Object-Oriented Programming (OOP) basics.

## Description

This project demonstrates fundamental Java OOP concepts including classes, objects, encapsulation, methods, and collections. It simulates basic banking operations with user interaction through console input, including account creation, deposits, withdrawals, interest calculations, and transaction history.

## Features

- Create account holder profiles with personal information
- Create bank accounts linked to account holders
- **Interactive deposit** - User input for deposit amounts
- **Interactive withdrawal** - User input for withdrawal amounts with validation and error handling
- Check account balance
- **Interest calculation** - Calculate projected balance after interest for a given period
  - Savings Account (SA): 2% annual interest
  - Fixed Deposit (FD): Tiered interest rates (12.5%, 16.5%, 20%)
- **Transaction history** - Track and view withdrawal history
- **Input validation** - Error handling for invalid user inputs

## Project Structure

```
bankingApplication/
├── src/
│   ├── Main.java           # Entry point of the application
│   ├── accountHolder.java  # Account holder information class
│   └── bankAccount.java    # Bank account operations class
└── README.md
```

## Classes

### `accountHolder`
Stores account holder information:
- Name
- Birthday
- Address

### `bankAccount`
Manages bank account operations and data:
- Account holder reference
- Account number and type
- Balance management
- Transaction history (deposits and withdrawals tracked using ArrayList)
- Interactive cash deposits with user input
- Interactive cash withdrawals with input validation and error handling
- Interest calculation for SA and FD accounts
- Withdrawal history display

## How to Run

1. Navigate to the project directory:
   ```bash
   cd bankingApplication
   ```

2. Compile the Java files:
   ```bash
   javac src/*.java
   ```

3. Run the application:
   ```bash
   java -cp src Main
   ```

## Example Usage

The application creates a sample account for Jane Anderson and performs interactive operations:
- Prompts user to enter deposit amount
- Deposits the entered amount
- Prompts user to enter withdrawal amount
- Validates and processes withdrawal
- Displays current balance
- Calculates and shows projected balance after 4 years with interest
- Displays withdrawal transaction history

## Technologies Used

- Java
- Object-Oriented Programming principles
- Java Collections (ArrayList)
- Scanner for user input
- Exception handling

## Author

Created as a practice project for learning Java basics and OOP concepts.
