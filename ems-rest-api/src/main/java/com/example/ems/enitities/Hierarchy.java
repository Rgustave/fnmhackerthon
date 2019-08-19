package com.example.ems.enitities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Hierarchy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hierarchyId;
    private Long employeeID;
    private Long managerID;

    public Long getHierarchyId() {
        return hierarchyId;
    }

    public void setHierarchyId(Long hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public Long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }
}
