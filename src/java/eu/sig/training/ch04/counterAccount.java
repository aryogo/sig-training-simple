public class counterAccount() {
	
	public void testing() {
		int sum = 0;
	    for (int i = 0; i < counterAccount.length(); i++) {
	        char character = counterAccount.charAt(i);
	        int characterValue = Character.getNumericValue(character);
	        sum = sum + (9 - i) * characterValue;
	    }
	    if (sum % 11 == 0) {
	        // 3. Look up counter account and make transfer object:
	        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
	        Transfer result = new Transfer(this, acct, amount);
	        return result;
	    } else {
	        throw new BusinessException("Invalid account number!");
	    }
	}
}