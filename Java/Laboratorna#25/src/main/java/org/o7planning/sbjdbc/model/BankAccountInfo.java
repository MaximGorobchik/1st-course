package org.o7planning.sbjdbc.model;
public class BankAccountInfo {
    private Long ID;
    private String FULL_NAME;
    private double BALANCE;
    public BankAccountInfo(Long id, String fullName, double balance) {
        super();
        this.ID = id;
        this.FULL_NAME = fullName;
        this.BALANCE = balance;
    }

    public Long getId() {
        return ID;
    }
    public void setId(Long id) {
        this.ID = id;
    }
    public String getFullName() {
        return FULL_NAME;
    }
    public void setFullName(String fullName) {
        this.FULL_NAME = fullName;
    }
    public double getBalance() {
        return BALANCE;
    }
    public void setBalance(double balance) {
        this.BALANCE = balance;
    }
    }
