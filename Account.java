import java.util.*;
import java.io.*;


public class Account{

    public long balance;
    public int transactions;
    
    public Account(){
        balance = 100000;
    }
    
    public Account(long balance, int transactions){
        this.balance = balance;
		this.transactions = transactions;
    }
    
   

    boolean deposit(long amount) throws InvalidAmountException{
        if(amount < 0){
            throw new InvalidAmountException("account must be > 0");
        }
        else{
            balance += amount;
            return true;
        }
    }


    boolean withdraw(double amount , double fee) throws OverWithdrawException{
        if (amount < 0 || (amount + fee) >= balance){
            throw new OverWithdrawException("Error");
		}
        else{
            balance = balance - (amount + fee);
            return true;
        }
    }
    
	
	public void transfer(double amount, double fee){
		if(amount > fee) 
			return true;
		else 
			return false;
	}
    
   
    public int getTransactions(){
        return transactions;
    }
	
	public void setTransactions(int transactions){
		this.transactions = transactions;
	}

    public long getBalance(){
        return balance;
    }

	public void setBalance(long balance){
		this.balance = balance;
	}


    @Override
    public String toString(){
   
        
        return "Account [balance = " + balance + ", transactions = " + transactions + "]";
    }
	
}