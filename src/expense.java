import java.util.Locale;

public class expense {

    private String expCategory;
    private String expDate;
    private double expAmount;

    public expense(String category, String date, double amount){
        expCategory = category;
        expDate = date;
        expAmount = amount;
    }

    public void setExpCat(String expCategory){
        this.expCategory = expCategory;
    }

    public String getCategory(){
        return expCategory.toLowerCase(Locale.ROOT);
    }

    public void setExpDate(String expDate){
        this.expDate = expDate;
    }

    public String getExpDate(){
        return expDate;
    }

    public void setExpAmount(double expAmount){
        this.expAmount = expAmount;
    }

    public String getExpAmount(){
        return expCategory;
    }

    public String toString(){
        return this.expCategory + " " + this.expDate + " " + this.expAmount;
    }

}
