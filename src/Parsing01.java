public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice, taxRate, gibberish;
        shirtPrice = "200";
        taxRate = ".10";
        gibberish = "wasd";



        //Parse shirtPrice and taxRate, and print the total tax
        double totalTax;
        totalTax = Double.parseDouble(shirtPrice) * Double.parseDouble(taxRate);
        System.out.println(totalTax);


        //Try to parse taxRate as an int
        //System.out.println(Integer.parseInt(taxRate));
        //Try to parse gibberish as an int
        //System.out.println(Integer.parseInt(gibberish));;
    }
    
}
