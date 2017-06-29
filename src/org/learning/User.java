package org.learning;

public class User {

    private String name;
    private String alias;
    private Integer age;
    private Integer strenght;
    private Integer dexterity;
    private Integer wisdom;

    public User(String name,
                String alias,
                Integer age,
                Integer strenght,
                Integer dexterity,
                Integer wisdom) {
        this.name = name;
        this.alias = alias;
        this.age = age;
        this.strenght = strenght;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStrenght() {
        return strenght;
    }

    public void setStrenght(Integer strenght) {
        this.strenght = strenght;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }
}
