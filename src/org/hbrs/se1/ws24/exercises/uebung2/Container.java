package org.hbrs.se1.ws24.exercises.uebung2;

import java.util.ArrayList;

public class Container {
    private ArrayList<Member> memberArrayList;
    public Container() {
        memberArrayList = new ArrayList<Member>();
    }
    void addMember(Member member) throws ContainerException {
        for (Member m : memberArrayList) {
            if (m.getID().equals(member.getID())) {
                throw new ContainerException("Das Member-Objekt mit der ID " + m.getID().toString()
                        + " ist bereits vorhanden!");
            }
        }
        memberArrayList.add(member);
    }
    String deleteMember(Integer id) {
        for (Member m : memberArrayList) {
            if (m.getID().equals(id)) {
                memberArrayList.remove(m);
                return ("Das Member-Objekt mit der ID " + id.toString() + " ist gelöscht!");
            }
        }
        return ("Das Member-Objekt mit der ID " + id.toString() + " ist nicht gefunden!");
    }
    void dump() {
        for (Member m : memberArrayList) {
            System.out.println("Member (ID = " + m.getID().toString() + " )");
        }
    }
    int size() {
        return memberArrayList.size();
    }
}