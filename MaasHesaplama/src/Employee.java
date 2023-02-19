public class Employee {

    String name;

    double salary;

    double workHours;

    int hireYear;

    int extraHours;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

   public double tax(){
        double tax = 0;
        if (salary > 1000){
            tax = this.salary * 3 / 100;
            return tax;
        }else {
            tax = 0;
            return tax;
        }
   }

   public double bonus (){
        double bonus = 0;
        if (this.workHours > 40){
            this.extraHours = (int) (this.workHours - 40);
            bonus = extraHours * 30;
            return bonus;
        }

        return bonus;
   }

   public double raiseSalary(){
        double gSalary = 0;
        if (this.hireYear <= 10){
            gSalary = salary * 5 / 100;
            return gSalary;
        } else if (hireYear >= 9 && hireYear < 20) {
            gSalary = salary * 10 / 100;
            return gSalary;
        } else if (hireYear >= 19) {
            gSalary = salary * 15 / 100;
            return gSalary;
        }
        return gSalary;
   }

   public String toString() {

       System.out.println("Çalışanın İsmi : " + this.name);
       System.out.println("Çalışanın Maaşı : " + this.salary);
       System.out.println("Çalışma Saati : " + this.workHours);
       System.out.println("Başlangıç Yılı : " + this.hireYear);
       System.out.println("Vergi : " + tax());
       System.out.println("Bonus : " + bonus());
       System.out.println("Maaş Artışı : " + raiseSalary());
       System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
       System.out.println("Toplam maaş : " + (this.salary + raiseSalary()));
       System.out.println("----------------------------------------");
       return  super.toString();
   }
}

