public class Main {
 public static void main(String[] args) {
  System.out.println("Hello world!");


  Employee[] employees = new Employee[10];


  Employee employee1 = new Employee("Иванов Иван Петрович", 90, 1);
  Employee employee2 = new Employee("Иванова  Мария Петровна", 70, 2);
  Employee employee3 = new Employee("Петров Иван Иванович", 130, 1);
  Employee employee4 = new Employee("Васильев Петр Иванович", 50, 5);
  Employee employee5 = new Employee("Иванов Степан Петрович", 70, 1);
  Employee employee6 = new Employee("Голубева Наталья Петровна", 160, 3);
  Employee employee7 = new Employee("Петров Василий Васильевич", 110, 4);
  Employee employee8 = new Employee("Сидоров Сергей Петрович", 130, 5);
  Employee employee9 = new Employee("Белова  Ольга Викторовна", 80, 2);
  Employee employee10 = new Employee("Шустов Игорь Васильевич", 70, 3);

  employees[0] = employee1;
  employees[1] = employee2;
  employees[2] = employee3;
  employees[3] = employee4;
  employees[4] = employee5;
  employees[5] = employee6;
  employees[6] = employee7;
  employees[7] = employee8;
  employees[8] = employee9;
  employees[9] = employee10;

  printAllEmployeeBook(employees);
  calculateSum(employees);
  calculatMinSalary(employees);
  calculatMaxSalay(employees);
  printFullName(employees);
  averageSalary (employees);
 }

 private static void printAllEmployeeBook(Employee[] employees) {
  System.out.println("Полный список сотрудников: ");
  for (int i = 0; i < employees.length; i++) {
   System.out.println(employees[i]);
  }
 }

 private static void calculateSum(Employee[] employees) {
  int sum = 0;
  for (Employee employee : employees) {
   sum += employee.getSalary();
  }
  System.out.println("Сумма всех зарплат " + sum);
 }

  private static void averageSalary (Employee[] employees) {
   int sum = 0;
   double averageSalary = 0;
   for (Employee employee : employees) {
    sum += employee.getSalary();
    averageSalary = (double) sum / employees.length;
   }
    System.out.println("средняя зарплата = " + averageSalary);
 }



 public static void calculatMinSalary (Employee[] employees) {
  float minSalary = 200;
  String fullNameMin = "";
  for (int i = 0; i < employees.length; i++){
   if (minSalary > employees[i].getSalary()) {
    minSalary = employees[i].getSalary();
    fullNameMin = employees[i].getFullName();}
  }
  System.out.println("Сотрудник " + fullNameMin + " получает минимальную зарплату, которая составляет " + minSalary + " рублей.");
 }

 public static void calculatMaxSalay (Employee[] employees ) {
   int maxSalary = 0;
  String fullNameMax = "";
  for (int i = 1; i < employees.length; i++) {
   if (maxSalary < employees[i].getSalary()) {
    maxSalary = employees[i].getSalary();
    fullNameMax = employees[i].getFullName();
   }
  }
    System.out.println("Сотрудник " + fullNameMax + " получает самую высокую зарплату, которая составляет " + maxSalary + " рублей.");

  }

  public static void printFullName (Employee[] employees){

   System.out.println("Ф.И.О. сотрудников:");
   for (int i = 0; i < employees.length; i++) {

    System.out.println(employees[i].getFullName());
   }
  }
 }
