package app.domain.models;

public class BankLoan {
    private int idBankLoan;
    private String typeBankLoan;
    private int idApplicant;
    private double amountApplicant;
    private double amountApproved;
    private double interestRate;
    private int termMonths;
    private boolean statusLoan;
    private String dateApproved;
    private String dateDisbursement;
    private int idAccountDestination;

    public BankLoan() {
    }
    
    public BankLoan(int idBankLoan, String typeBankLoan, int idApplicant, double amountApplicant, double amountApproved, double interestRate, int termMonths, boolean statusLoan, String dateApproved, String dateDisbursement, int idAccountDestination) {
        this.idBankLoan = idBankLoan;
        this.typeBankLoan = typeBankLoan;
        this.idApplicant = idApplicant;
        this.amountApplicant = amountApplicant;
        this.amountApproved = amountApproved;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
        this.statusLoan = statusLoan;
        this.dateApproved = dateApproved;
        this.dateDisbursement = dateDisbursement;
        this.idAccountDestination = idAccountDestination;
    }

    public int getIdBankLoan() {
        return idBankLoan;
    }

    public void setIdBankLoan(int idBankLoan) {
        this.idBankLoan = idBankLoan;
    }

    public String getTypeBankLoan() {
        return typeBankLoan;
    }

    public void setTypeBankLoan(String typeBankLoan) {
        this.typeBankLoan = typeBankLoan;
    }

    public int getIdApplicant() {
        return idApplicant;
    }

    public void setIdApplicant(int idApplicant) {
        this.idApplicant = idApplicant;
    }

    public double getAmountApplicant() {
        return amountApplicant;
    }

    public void setAmountApplicant(double amountApplicant) {
        this.amountApplicant = amountApplicant;
    }

    public double getAmountApproved() {
        return amountApproved;
    }

    public void setAmountApproved(double amountApproved) {
        this.amountApproved = amountApproved;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public boolean isStatusLoan() {
        return statusLoan;
    }

    public void setStatusLoan(boolean statusLoan) {
        this.statusLoan = statusLoan;
    }

    public String getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(String dateApproved) {
        this.dateApproved = dateApproved;
    }

    public String getDateDisbursement() {
        return dateDisbursement;
    }

    public void setDateDisbursement(String dateDisbursement) {
        this.dateDisbursement = dateDisbursement;
    }

    public int getIdAccountDestination() {
        return idAccountDestination;
    }

    public void setIdAccountDestination(int idAccountDestination) {
        this.idAccountDestination = idAccountDestination;
    }
}
