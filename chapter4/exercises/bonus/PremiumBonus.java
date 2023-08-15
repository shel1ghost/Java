public class PremiumBonus extends Bonus{
  public double getPremiumBonus(){
    return getBonus()+(sales_amt-2500)*0.01;
  }
}
