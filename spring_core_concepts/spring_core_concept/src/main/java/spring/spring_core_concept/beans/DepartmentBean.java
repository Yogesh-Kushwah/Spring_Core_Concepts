package spring.spring_core_concept.beans;



import org.springframework.stereotype.Component;

@Component  // Marks this as a Spring Bean
public class DepartmentBean {
    private String departmentName = "Software Development";

    public String getDepartmentName() {
        return departmentName;
    }
}
