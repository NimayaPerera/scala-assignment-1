object  q4  extends  App {

    def basicsalary(workinghour : Double , othour : Double) : Double = workinghour*150 + othour*75

    def tax(salary : Double) : Double = salary*0.1

   var totalsalary : Double = basicsalary(40,20) - tax(basicsalary(40,20));

  print(totalsalary);

}
