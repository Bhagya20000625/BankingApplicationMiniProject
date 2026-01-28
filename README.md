# Banking Application Mini Project

A simple Java-based banking application created to practice Object-Oriented Programming (OOP) basics.

## Description

This project demonstrates fundamental Java OOP concepts including classes, objects, encapsulation, and methods. It simulates basic banking operations such as account creation, deposits, and withdrawals.

## Features

- Create account holder profiles with personal information
- Create bank accounts linked to account holders
- Deposit cash into accounts
- Withdraw cash from accounts with balance validation
- Check account balance

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
Manages bank account operations:
- Account number
- Account type
- Balance management
- Cash deposits
- Cash withdrawals

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

The application creates a sample account for Jane Anderson and performs the following operations:
- Deposits $500
- Attempts to withdraw $400 (successful)
- Attempts to withdraw $200 (checks for sufficient balance)

## Technologies Used

- Java
- Object-Oriented Programming principles

## Author

Created as a practice project for learning Java basics and OOP concepts.
