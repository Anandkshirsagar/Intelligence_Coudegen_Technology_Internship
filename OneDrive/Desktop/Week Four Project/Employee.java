class Employee {
    int empId;
    String name;
    String designation;
    double basicSalary;
    double hra, da, grossSalary, deductions, netSalary;

    Employee(int empId, String name, String designation, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    void calculateSalary() {
        hra = 0.20 * basicSalary;
        da = 0.10 * basicSalary;
        grossSalary = basicSalary + hra + da;
        deductions = 0.08 * grossSalary;
        netSalary = grossSalary - deductions;
    }

    void display() {
        System.out.println("ID: " + empId +
                ", Name: " + name +
                ", Designation: " + designation +
                ", Net Salary: ₹" + netSalary);
    }
}
