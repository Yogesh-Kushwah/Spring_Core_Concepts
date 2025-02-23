package spring.spring_core_concept.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Marks this as a Spring Bean
public class EmployeeBean {
    private String employeeName = "Yogesh Kushwah";

    private final DepartmentBean department;

    @Autowired  // Constructor Injection
    public EmployeeBean(DepartmentBean department) {
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartmentName() {
        return department.getDepartmentName();
    }
}
