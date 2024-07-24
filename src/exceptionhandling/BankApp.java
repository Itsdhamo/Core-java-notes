package exceptionhandling;
class InvalidAmountException extends Exception
        {
	    InvalidAmountException()
	    {
		System.out.println("InvalidAmountException object is created...");
	    }
 	    void amounthandling() 
	    {
		System.out.println("get lost you culprit...");
	    }
        }
    public class BankApp {
	public static void main(String[] args){
	    initiateTXN(-1000.0);	
	    }
	private static void initiateTXN(double amt) {
        try {
        transaction(amt);
        }
        catch(InvalidAmountException e1){
            e1.amounthandling();
            e1.printStackTrace();
        }}
    private static void transaction(double amt) throws InvalidAmountException{
    	    if(amt>0){
    	    	System.out.println("transcation is initiated for "+amt+" rs.");
    	    }
    	    else {
    	    	throw new InvalidAmountException();
    	    }
             }}