public class Main {
 public static void main(String[] args) {
  System.out.println("Hello world!");

  Employee[] employeeBook = new Employee[10];
  Employee employee1 = new Employee("Иванов Иван Петрович", 93, 1);
  Employee employee2 = new Employee("Иванова  Мария Петровна", 77, 2);
  Employee employee3 = new Employee("Петров Иван Иванович", 132, 4);
  Employee employee4 = new Employee("Васильев Петр Иванович", 57, 5);
  Employee employee5 = new Employee("Иванов Степан Петрович", 75, 1);
  Employee employee6 = new Employee("Голубева Наталья Петровна", 169, 3);
  Employee employee7 = new Employee("Петров Василий Васильевич", 102, 4);
  Employee employee8 = new Employee("Сидоров Сергей Петрович", 132, 5);
  Employee employee9 = new Employee("Белова  Ольга Викторовна", 86, 2);
  Employee employee10 = new Employee("Шустов Игорь Васильевич", 79, 3);
  employeeBook[0] = employee1;
  employeeBook[1] = employee2;
  employeeBook[2] = employee3;
  employeeBook[3] = employee4;
  employeeBook[4] = employee5;
  employeeBook[5] = employee6;
  employeeBook[6] = employee7;
  employeeBook[7] = employee8;
  employeeBook[8] = employee9;
  employeeBook[9] = employee10;

  for (Employee employee:employeeBook) {
   System.out.println(employee);
  }
 }
}
