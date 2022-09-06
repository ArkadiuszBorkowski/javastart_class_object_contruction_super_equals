package ex_polimorfizm;

public class Hospital {

    private static final int MAX_EMPLOYESS = 3;

    private Person[] employees = new Person[MAX_EMPLOYESS];
    private int employeesNumber = 0;

    void add(Person person) {
        if(employeesNumber < MAX_EMPLOYESS){
            employees[employeesNumber] = person;
            employeesNumber++;
        }
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result = result + employees[i].getInfo() + "\n";
        }
        return result;
    }
}
