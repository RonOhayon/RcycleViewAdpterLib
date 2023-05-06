public class Transaction {
    private String transactionName;
    private int transactionSum;

    public Transaction(String transactionName, int transactionSum) {
        this.transactionName = transactionName;
        this.transactionSum = transactionSum;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public int getTransactionSum() {
        return transactionSum;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public void setTransactionSum(int transactionSum) {
        this.transactionSum = transactionSum;
    }
}
