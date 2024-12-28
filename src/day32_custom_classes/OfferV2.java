package day32_custom_classes;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto;

    public OfferV2 (String company,String location){
        this.company=company;
        this.location=location;

    }
    public OfferV2 (String company,String location,double salary){
        this(company,location);
//        this.company=company;
//        this.location=location;
        this.salary=salary;

    }

    public OfferV2 (String location, String company, double salary, boolean isFullTime, int pto) {
        this(location,company,salary);
//        this.location = location;
//        this.company = company;
//        this.salary = salary;
        this.isFullTime = isFullTime;
        this.pto = pto;
    }

    public String toString() {

        String result = "offer info: ";

        result += "\n\tlocation: "+ location;
        result += "\n\tCompany: "+ company;
        result+= "\n\tsalary: "+ ((salary>0)? "$"+salary : "info not available.");
        result+= "\n\tis full time: "+ ((isFullTime)? "full time": "either not full time or not availble");
        result+= "\n\tnumber of PTO: "+ ((pto>0)?pto : "0 days as pto or info not available");


        return result;
    }
}
