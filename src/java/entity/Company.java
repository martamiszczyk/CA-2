/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pernille
 */
@Entity
public class Company extends InfoEntity implements Serializable
{
    private String name;
    private String description;
    private String cvr;
    private int numEmployees;
    private int marketValue;

    public Company()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCvr()
    {
        return cvr;
    }

    public void setCvr(String cvr)
    {
        this.cvr = cvr;
    }

    public int getNumEmployees()
    {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees)
    {
        this.numEmployees = numEmployees;
    }

    public int getMarketValue()
    {
        return marketValue;
    }

    public void setMarketValue(int marketValue)
    {
        this.marketValue = marketValue;
    }
    
    
}