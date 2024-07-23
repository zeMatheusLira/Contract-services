package entities;

import java.util.Date;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;
    private Installment installments;

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Contract(Installment installments, Double totalValue, Date date, Integer number) {
        this.installments = installments;
        this.totalValue = totalValue;
        this.date = date;
        this.number = number;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Installment getInstallments() {
        return installments;
    }

    public void setInstallments(Installment installments) {
        this.installments = installments;
    }
}
