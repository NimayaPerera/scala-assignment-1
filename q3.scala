object q3 extends App {

  def coverprice(x : Double) : Double = x*24.95

  def discount(amount : Double)  : Double =  amount*0.4

  def shipping(quantity : Double) : Double  = 50*3 + (quantity-50)*0.75


 var total : Double =  coverprice(60) - discount(coverprice(60)) + shipping(60);
  print(total);

}
