package com.example.ORMx;

import jakarta.persistence.*;

@Entity
@Table(name = "Alien_Table")
public class Alien {
    @Id
    private int aid;

    public void setAname(AlienName aname) {
        this.aname = aname;
    }
//dont store aname
//    @Transient
//    private String aname;

    AlienName aname;

    //save acolor as alienColor
    @Column(name="AlienColor")
    private String  acolor;

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
