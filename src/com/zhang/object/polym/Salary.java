package com.zhang.object.polym;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 16:43
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck() {
        System.out.println("Salary类的mailCheck方法");
        System.out.println("邮寄支票给： " + getName() + " ,工资为 " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("计算工资，付给： " + getName());
        return salary/52;
    }
}
