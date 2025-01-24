package day44_map_and_functions.enum_sample;

public class UsingBrowser {
    public static void main(String[] args) {

        Browser browser = Browser.CHROME; //String browser = "CHROME"

        switch (browser) {
            case CHROME:
                case FIREFOX:
                    System.out.println("opening either chrome or Firefox");
                    break;
            case EDGE:
                System.out.println("opening edge");
                break;
                case SAFARI:
                    System.out.println("opening safari");
                    break;
                    default:
                        System.out.println("unknown browser");

        }





    }
}
