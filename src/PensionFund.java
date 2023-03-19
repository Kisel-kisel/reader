import java.util.List;

public class PensionFund {
    private String freeMoney;
    private Boolean isItGoverment;
    private final String dateOfCreate;

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public String getFreeMoney() {
        return freeMoney;
    }

    public Boolean getItGoverment() {
        return isItGoverment;
    }

    public void setItGoverment(Boolean itGoverment) {
        isItGoverment = itGoverment;
    }

    @Override
    public String toString() {
        return freeMoney + ' ' +
                isItGoverment + ' ' +
                dateOfCreate ;
    }

    public void setFreeMoney(String freeMoney) {
        this.freeMoney = freeMoney;
    }

    public PensionFund(String freeMoney, Boolean isItGoverment, String dateOfCreate) {
        this.freeMoney = freeMoney;
        this.isItGoverment = isItGoverment;
        this.dateOfCreate = dateOfCreate;
    }
}
