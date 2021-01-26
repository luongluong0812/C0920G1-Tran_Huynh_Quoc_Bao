package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ren_type_id;
    private String ren_type_name;
    private String ren_type_cost;
    @OneToMany(mappedBy = "rentType")
    private List<Service> services;

    public RentType() {
    }

    public Long getRen_type_id() {
        return ren_type_id;
    }

    public void setRen_type_id(Long ren_type_id) {
        this.ren_type_id = ren_type_id;
    }

    public String getRen_type_name() {
        return ren_type_name;
    }

    public void setRen_type_name(String ren_type_name) {
        this.ren_type_name = ren_type_name;
    }

    public String getRen_type_cost() {
        return ren_type_cost;
    }

    public void setRen_type_cost(String ren_type_cost) {
        this.ren_type_cost = ren_type_cost;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
