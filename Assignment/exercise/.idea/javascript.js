// Constructor function for creating account objects
function Account(accountNumber, customerName, initialBalance, accountType) {
    this.accountNumber = accountNumber;
    this.customerName = customerName;
    this.balance = initialBalance;
    this.accountType = accountType;
    this.transactions = [];
}

// Array to store account objects
var accounts = [];

// Function to create a new account
function createAccount(accountNumber, customerName, initialBalance, accountType) {
    var newAccount = new Account(accountNumber, customerName, initialBalance, accountType);
    accounts.push(newAccount);
    return newAccount;
}

// Function to find an account by account number
function findAccount(accountNumber) {
    for (var i = 0; i < accounts.length; i++) {
        if (accounts[i].accountNumber === accountNumber) {
            return accounts[i];
        }
    }
    return null;
}

// Function to deposit money into an account
function deposit(accountNumber, amount) {
    var account = findAccount(accountNumber);
    if (account) {
        account.balance += amount;
        account.transactions.push({ type: 'Deposit', amount: amount, date: new Date() });
        return account.balance;
    } else {
        return "Account not found.";
    }
}

// Function to withdraw money from an account
function withdraw(accountNumber, amount) {
    var account = findAccount(accountNumber);
    if (account) {
        if (account.balance >= amount) {
            account.balance -= amount;
            account.transactions.push({ type: 'Withdrawal', amount: amount, date: new Date() });
            return account.balance;
        } else {
            return "Insufficient funds.";
        }
    } else {
        return "Account not found.";
    }
}

// Function to check account balance
function getBalance(accountNumber) {
    var account = findAccount(accountNumber);
    if (account) {
        return account.balance;
    } else {
        return "Account not found.";
    }
}

// Function to display transaction history
function getTransactionHistory(accountNumber) {
    var account = findAccount(accountNumber);
    if (account) {
        return account.transactions;
    } else {
        return "Account not found.";
    }
}

// Function to calculate interest for savings account
function calculateInterest(accountNumber, interestRate) {
    var account = findAccount(accountNumber);
    if (account && account.accountType === 'savings') {
        var interestAmount = account.balance * (interestRate / 100);
        account.balance += interestAmount;
        account.transactions.push({ type: 'Interest', amount: interestAmount, date: new Date() });
        return account.balance;
    } else {
        return "Account not found or not a savings account.";
    }
}

// Function to close an account
function closeAccount(accountNumber) {
    var account = findAccount(accountNumber);
    if (account) {
        var index = accounts.indexOf(account);
        if (index > -1) {
            accounts.splice(index, 1);
            return "Account closed successfully.";
        }
    } else {
        return "Account not found.";
    }
}
