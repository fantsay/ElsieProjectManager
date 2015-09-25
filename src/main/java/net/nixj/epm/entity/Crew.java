package net.nixj.epm.entity;

/**
 * Created by fantsay on 9/24/15.
 */
public class Crew {
    public Crew(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
