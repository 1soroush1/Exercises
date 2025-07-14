public class MageScroll extends GuardianScroll {
    public MageScroll(String scrollname, String secretTechnique, String successorKnowlege){
        super(scrollname, secretTechnique, successorKnowlege);
    }
    public void AddAlliancePact(String pact){
        alliancePacts.add(pact);
    }
}
