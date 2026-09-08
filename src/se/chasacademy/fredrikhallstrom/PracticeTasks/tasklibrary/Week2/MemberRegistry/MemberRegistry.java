package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.MemberRegistry;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.MemberRegistry.model.Member;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.MemberRegistry.model.MembershipStatus;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class MemberRegistry implements TaskTemplate {
    @Override
    public void start() {
        Member[] members = new Member[5];
        members[0] = new Member("Alexander", 25, MembershipStatus.ACTIVE);
        members[2] = new Member("Sonny", 26, MembershipStatus.PAUSED);
        members[3] = new Member("Kalle", 27, MembershipStatus.TERMINATED);

        runMenuLoop(members);
    }

    void runMenuLoop (Member[]members){
        while (true) {
            IO.println("""
                    1. Visa medlemmar
                    2. Byt medlemsstatus
                    3. Avsluta övningsuppgiften""");
            int choice = Integer.parseInt(IO.readln("> "));
            switch (choice) {
                case 1 -> listMembers(members);
                case 2 -> setMembership(members);
                case 3 -> {
                    return;
                }
            }
        }
    }

    public void listMembers (Member[]members){
        IO.println("------------");
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            if (member == null) {
                continue;
            }
            IO.println(String.format("%d: %s", i, member));
        }
        IO.println("------------");
        try { // Roligt o leka med lite extra funktioner...
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setMembership (Member[]members){
        int memberNr = Integer.parseInt(IO.readln("Vilken medlem vill du ändra status på?\n>"));
        IO.println("""
                \nVälj ny status:
                1. ACTIVE
                2. PAUSED
                3. TERMINATED""");

        int choice = Integer.parseInt(IO.readln(">"));

        try {
            switch (choice) {
                case 1 -> {
                    members[memberNr].setMembershipStatus(MembershipStatus.ACTIVE);
                    printConfirmation(members, memberNr);
                }
                case 2 -> {
                    members[memberNr].setMembershipStatus(MembershipStatus.PAUSED);
                    printConfirmation(members, memberNr);
                }
                case 3 -> {
                    members[memberNr].setMembershipStatus(MembershipStatus.TERMINATED);
                    printConfirmation(members, memberNr);
                }
            }
        } catch (Exception e) {
            IO.println("Användaren finns inte!!\n");
        }


    }

    private void printConfirmation (Member[]members,int memberNr){
        IO.println(String.format("Den nya statusen på medlem %d är %s",
                memberNr, members[memberNr].getMembershipStatus()));
        IO.println("------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}