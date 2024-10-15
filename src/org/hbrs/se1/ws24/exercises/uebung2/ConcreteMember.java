package org.hbrs.se1.ws24.exercises.uebung2;

public class ConcreteMember implements Member {
    private int cMID;
    public ConcreteMember(int ID) {
        this.cMID = ID;
    }
    @Override
    public Integer getID() {
        return cMID;
    }
}
