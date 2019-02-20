package com.tp1;

import com.tp2.preambule.Employee;
import com.tp2.preambule.Service;

public class Project {
    Employee employee;
    Service service;

    public Project(Employee employee, Service service) {
        this.employee = employee;
        this.service = service;
    }

    public boolean equals(Project p) {
        return (p.employee.equals(this.employee) && p.service.equals(this.service));
    }
}
