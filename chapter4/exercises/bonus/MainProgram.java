public class MainProgram{
  public static void main(String[]args){
    PremiumBonus p = new PremiumBonus();
    p.sales_amt = 45000;
    System.out.println("Bonus = "+p.getBonus());
    System.out.println("Premium Bonus = "+p.getPremiumBonus());
  }
}
