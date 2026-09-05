package se.chasacademy.PracticeTasks.taskLibrary.MemberRegistry.model;

public class Member {
    private String name;
    private int age;
    private MembershipStatus membershipStatus;

    public Member(String name, int age, MembershipStatus membershipStatus) {
        this.name = name;
        this.age = age;
        this.membershipStatus = membershipStatus;
    }

    // Getters som egentligen är helt onödiga men det stod i uppgiften
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    //Getters
    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    //Setters som egentligen är helt onödiga men det stod i uppgiften
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Setters
    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) - %s", name, age, membershipStatus);
    }
}
