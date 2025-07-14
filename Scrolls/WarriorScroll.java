import java.util.ArrayList;

public class WarriorScroll extends GuardianScroll {

    public WarriorScroll(String scrollname, String secretTechnique, String successorKnowlege){
        super(scrollname, secretTechnique, successorKnowlege);
    }
    public void AddAlliancePact(String pact){
        alliancePacts.add(pact);
    }
}
