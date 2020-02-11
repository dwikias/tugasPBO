/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author dwiki
 */
public class Employee {

    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;
    
    public Employee(int ID,String FirstName,String LastName,int Salary){
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.salary = Salary;
    }
    int getId (){
        return id;
    }
    String getfirstName(){
        return firstName;
    }
    String getlastName(){
        return lastName;
    }
    String getName(){
        return getfirstName() +" "+getlastName();
    }
    int getSalary(){
        return salary;
    }
    public void setSalary(int slr){
        this.salary = slr;
    }
    int getAnnualSalary(){
        return salary*12;
    }
    int raiseSalary(float percent){
        return  (int) (getAnnualSalary()*percent+ getAnnualSalary());// peningkatan gaji dengan persen
    }
    @Override
    public String toString(){
        return "Employee [ ID :" +getId()+ ", Nama : "+getName()+" , salary : ";
    }
    public static void main(String[] args) {
   
    Employee karyawan = new Employee(123,"Bejo","Untung",500000);   
    System.out.println("Gaji perbulan "+karyawan.getName()+ " adalah "+ karyawan.getSalary());
    karyawan.setSalary(600000);
    System.out.println("Karena sudah bekerja dengan sangat baik maka gaji perbulan dinaikan menjadi "+karyawan.getSalary());
    System.out.println("Sehingga dalam satu tahun "+karyawan.getName()+ " mendapatkan gaji sebesar "+karyawan.getAnnualSalary());
    System.out.println("Dan ditambah 10% dari gaji ,maka total gaji adalah "+karyawan.raiseSalary((float)0.1));
    System.out.println(karyawan.toString()+ karyawan.raiseSalary((float)0.1)+" ]");
    }
    
}
