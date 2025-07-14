import java.util.ArrayList;

public class GuardianScroll {
    public String scrollName;
    private String secretTechnique;
    protected String successorKnowledge;
    ArrayList<String> alliancePacts;
    GuardianScroll(String scrollName, String secretTechnique, String successorKnowledge){
        this.scrollName = scrollName;
        this.secretTechnique = secretTechnique;
        this.successorKnowledge = successorKnowledge;
        this.alliancePacts = new ArrayList<>();
    }

}
