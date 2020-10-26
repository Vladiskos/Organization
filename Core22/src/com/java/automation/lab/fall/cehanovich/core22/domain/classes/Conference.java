package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.Employee;
import com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans.User;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

import java.util.Date;

public class Conference {
    private String information;
    private Date date;
    private Room room;
    private AccessLevel accessLevel;

    public Conference(String information, Date date, Room room, AccessLevel accessLevel) {
        this.information = information;
        this.date = date;
        this.room = room;
        this.accessLevel = accessLevel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void holdConference(Employee employee) {
        if (employee.getCard().getAccessLevel().equals(this.accessLevel) ||
                employee.getCard().getAccessLevel().equals(AccessLevel.LEVEL_5)) {
            System.out.println("The conference will take place");
        } else {
            System.out.println("You don't have access!");
        }
    }

    public void holdConference(Employee employee, User user) {
        if (employee.getCard().getAccessLevel().equals(this.accessLevel) ||
                user.getInvitation().getAccessLevel().equals(this.accessLevel) ||
                employee.getCard().getAccessLevel().equals(AccessLevel.LEVEL_5)) {
            System.out.println("The conference will take place with users");
        } else {
            System.out.println("You don't have access!");
        }
    }




    @Override
    public String toString() {
        return "Conference {\nInformation: " + information + "\nAccess level: " + accessLevel + "\nDate: " +
                date + "\nRoom: " + room + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        Conference other = (Conference) that;
        return information.equals(other.information) && accessLevel.equals(other.accessLevel) &&
                date.equals(other.date) && room.equals(other.room);
    }

    @Override
    public int hashCode() {
        return (information.hashCode() + accessLevel.hashCode()) / 2 + date.hashCode() + room.hashCode();
    }

}
