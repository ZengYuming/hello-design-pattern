package stand;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("吃饭了吗？");
        colleagueB.send("没有呢？你打算请客？");
    }
}
