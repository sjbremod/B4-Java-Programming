package day25_methods;

public class CurrencyConverter {
    public static void main(String[] args) {

        double result = convertCurrency("euro",100);
        System.out.println(convertCurrency("euro",100));
        System.out.println(convertCurrency("Euro",100));
        System.out.println(convertCurrency("won",100));




    }
    //void vs return--- return
    //para vs non para -- para
    // convertCurrency (euro
    public static  double convertCurrency (String currencyName , double dollarAmount){
        double result =0;
        switch (currencyName.toLowerCase()){
            case "euro":
               result=  dollarAmount * 0.95;
               break;
            case "yene":
                result = dollarAmount * 150;
                break;
            case "lira":
                result = dollarAmount * 34.88;
                break;
            case "won":
                result = dollarAmount *1423.00;
                break;
            case "rupee":
                result = dollarAmount *84.86;
            default:
                System.out.println("not valid currency!");
                result = -1;
        }

        return result;
    }
}
