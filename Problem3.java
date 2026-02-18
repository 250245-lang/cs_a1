class StepCounter{
    static int totalStepsAllUsers = 0;
    int individualSteps = 0;

    public void walk(int steps){
        if(steps>0) {
            this.individualSteps += steps;
            totalStepsAllUsers += steps;
        }
    }

    public static void resetGlobalSteps(){
        totalStepsAllUsers = 0;
    }
}


public class Problem3 {
    public static void main(String[] args) {
        StepCounter user1 = new StepCounter();
        StepCounter user2 = new StepCounter();
        user1.walk(2500);
        user2.walk(3400);

        System.out.printf("User 1 has walked %d steps%nUser 2 has walked %d steps%nTotal steps: %d", user1.individualSteps, user2.individualSteps, StepCounter.totalStepsAllUsers);
    }
}
