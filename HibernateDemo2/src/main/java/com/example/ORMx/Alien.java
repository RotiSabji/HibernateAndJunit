package com.example.ORMx;


import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Alien_Table_Laptop" )
@Cacheable
@org.hibernate.annotations.Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
    @Id
    private int aid;

    public void setAname(AlienName aname) {
        this.aname = aname;
    }

    AlienName aname;

    //save acolor as alienColor
    @Column(name="AlienColor")
    private String  acolor;

    @OneToMany(mappedBy = "alien",fetch=FetchType.EAGER)
    private Collection<Laptop> laps =new ArrayList<Laptop>();

    public Collection<Laptop> getLaps() {
        return laps;
    }

    public void setLaps(Collection<Laptop> laps) {
        this.laps = laps;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAcolor() {
        return acolor;
    }

    public void setAcolor(String acolor) {
        this.acolor = acolor;
    }

    @Override
    public String toString(){
//        String s="Alien [aid="+aid+"aname="+aname+"color"+acolor+"]";
        String s="Alien [aid="+this.aid+" aname="+this.aname+" color="+this.acolor+"]";
        return (s);
    }
}
