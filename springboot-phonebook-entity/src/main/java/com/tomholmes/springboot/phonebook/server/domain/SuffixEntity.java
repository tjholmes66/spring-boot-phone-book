package com.tomholmes.springboot.phonebook.server.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * CREATE TABLE `dict_suffix` (
 * `dict_suffix_id` int NOT NULL AUTO_INCREMENT,
 * `dict_suffix_name` varchar(45) NOT NULL,
 * `dict_suffix_active` tinyint(1) NOT NULL DEFAULT '1',
 * PRIMARY KEY (`dict_suffix_id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
 * 
 */

public class SuffixEntity
{
    // `dict_suffix_id` int NOT NULL AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dict_suffix_id")
    private long suffixId;

    // `dict_suffix_name` varchar(45) NOT NULL,
    @Column(name = "dict_suffix_name")
    private boolean suffixName;

    // `dict_suffix_active` tinyint(1) NOT NULL DEFAULT '1',
    @Column(name = "active")
    private boolean active;

    public long getSuffixId()
    {
        return suffixId;
    }

    public void setSuffixId(long suffixId)
    {
        this.suffixId = suffixId;
    }

    public boolean isSuffixName()
    {
        return suffixName;
    }

    public void setSuffixName(boolean suffixName)
    {
        this.suffixName = suffixName;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (active ? 1231 : 1237);
        result = prime * result + (int) (suffixId ^ (suffixId >>> 32));
        result = prime * result + (suffixName ? 1231 : 1237);
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
        SuffixEntity other = (SuffixEntity) obj;
        if (active != other.active)
            return false;
        if (suffixId != other.suffixId)
            return false;
        if (suffixName != other.suffixName)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "SuffixEntity [suffixId=" + suffixId + ", suffixName=" + suffixName + ", active=" + active + "]";
    }

}
