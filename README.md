# Brainwave_matrix_intern

# ATM Java Program

## Overview

This Java program simulates a basic ATM (Automated Teller Machine) system. It allows users to check their balance, deposit funds, withdraw funds, and exit the program. The ATM requires a PIN for authentication, ensuring that only authorized users can access the system.

## Features

- **Check Balance**: View the current balance in the account.
- **Deposit Funds**: Add funds to the account balance.
- **Withdraw Funds**: Withdraw funds from the account balance, subject to sufficient balance.
- **PIN Authentication**: Authenticate users with a PIN.
- **Menu Navigation**: Simple text-based menu for user interaction.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.

## How to Compile and Run

1. **Save the Code**: Save the provided Java code in a file named `ATM.java`.

2. **Compile the Program**:
   Open a terminal or command prompt and navigate to the directory containing `ATM.java`. Compile the program using the following command:
   ```bash
   javac ATM.java
   ```

3. **Run the Program**:
   After compilation, run the program with the following command:
   ```bash
   java ATM
   ```

4. **Interaction**:
   - **Enter PIN**: When prompted, enter the PIN `1234` (or any PIN you choose to set).
   - **Choose an Option**: Select an option from the menu to check balance, deposit funds, withdraw funds, or exit the program.

## Code Description

- **ATM Class**:
  - **Fields**:
    - `balance`: The current balance in the account.
    - `userPIN`: The PIN used for authentication.
  - **Constructor**: Initializes the ATM with a starting balance and PIN.
  - **Methods**:
    - `checkBalance()`: Displays the current balance.
    - `deposit(double amount)`: Adds the specified amount to the balance.
    - `withdraw(double amount)`: Deducts the specified amount from the balance if sufficient funds are available.
    - `authenticate(String enteredPIN)`: Checks if the entered PIN matches the stored PIN.
    - `start()`: Main method to start the ATM interaction, including menu navigation and user input handling.
  - **main(String[] args)**: Creates an instance of `ATM` with an initial balance and PIN, then starts the ATM interaction.

## Error Handling

- The program handles invalid numeric inputs with `InputMismatchException`.
- Non-numeric inputs are cleared and prompt the user to enter valid data.

## Sample Output

```plaintext
Enter your PIN: 1234

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 1
Your balance is: $500.00

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 2
Enter the amount to deposit: 100
You've successfully deposited $100.00

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 3
Enter the amount to withdraw: 50
You've successfully withdrawn $50.00

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 4
Exiting...
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, please contact R.chihna at chihna04@gmail.com.





