package com.tomholmes.springboot.phonebook.server.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * CREATE TABLE `company` (
 * `company_id` int NOT NULL AUTO_INCREMENT,
 * `active` tinyint(1) NOT NULL,
 * `code` varchar(10) NOT NULL,
 * `name` varchar(45) NOT NULL,
 * `description` varchar(345) DEFAULT NULL,
 * `address1` varchar(45) DEFAULT NULL,
 * `address2` varchar(45) DEFAULT NULL,
 * `city` varchar(45) DEFAULT NULL,
 * `state` varchar(45) DEFAULT NULL,
 * `zip` varchar(45) DEFAULT NULL,
 * PRIMARY KEY (`company_id`),
 * KEY `code` (`code`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 * 
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "company")
public class CompanyEntity implements Serializable
{
    // `company_id` int NOT NULL AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private long companyId;

    // `active` tinyint(1) NOT NULL,
    @Column(name = "active")
    private boolean active;

    // `code` varchar(10) NOT NULL,
    @Column(name = "code")
    private String companyCode;

    // `name` varchar(45) NOT NULL,
    @Column(name = "name")
    private String companyName;

    // `description` varchar(345) DEFAULT NULL,
    @Column(name = "description")
    private String description;

    // `address1` varchar(45) DEFAULT NULL,
    @Column(name = "address1")
    private String address1;

    // `address2` varchar(45) DEFAULT NULL,
    @Column(name = "address2")
    private String address2;

    // `city` varchar(45) DEFAULT NULL,
    @Column(name = "city")
    private String city;

    // `state` varchar(45) DEFAULT NULL,
    @Column(name = "state")
    private String state;

    // `zip` varchar(45) DEFAULT NULL,
    @Column(name = "zip")
    private String zip;

    public long getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(long companyId)
    {
        this.companyId = companyId;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public String getCompanyCode()
    {
        return companyCode;
    }

    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (active ? 1231 : 1237);
        result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
        result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((companyCode == null) ? 0 : companyCode.hashCode());
        result = prime * result + (int) (companyId ^ (companyId >>> 32));
        result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((zip == null) ? 0 : zip.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CompanyEntity other = (CompanyEntity) obj;
        if (active != other.active)
            return false;
        if (address1 == null)
        {
            if (other.address1 != null)
                return false;
        }
        else if (!address1.equals(other.address1))
            return false;
        if (address2 == null)
        {
            if (other.address2 != null)
                return false;
        }
        else if (!address2.equals(other.address2))
            return false;
        if (city == null)
        {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (companyCode == null)
        {
            if (other.companyCode != null)
                return false;
        }
        else if (!companyCode.equals(other.companyCode))
            return false;
        if (companyId != other.companyId)
            return false;
        if (companyName == null)
        {
            if (other.companyName != null)
                return false;
        }
        else if (!companyName.equals(other.companyName))
            return false;
        if (description == null)
        {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (state == null)
        {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (zip == null)
        {
            if (other.zip != null)
                return false;
        }
        else if (!zip.equals(other.zip))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "CompanyEntity [companyId=" + companyId + ", active=" + active + ", companyCode=" + companyCode + ", companyName=" + companyName + ", description=" + description + ", address1="
            + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }

}
