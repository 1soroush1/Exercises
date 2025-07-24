import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreasureChest {
    private final List<String> clues = new ArrayList<>();
    private final Map<String, Integer> locationMap = new HashMap<>();

    // Add a new clue with its steps
    public void addClue(String clue, int steps) {
        if (!locationMap.containsKey(clue)) {
            clues.add(clue);
            locationMap.put(clue, steps);
        }
    }

    // Remove a clue by its name
    public void removeClue(String clue) {
        clues.remove(clue);
        locationMap.remove(clue);
    }

    // Get all clues in the order they were added
    public List<String> getAllClue() {
        return new ArrayList<>(clues);
    }

    // Calculate total steps needed to reach a specific clue
    public int totalSteps(String targetClue) {
        int total = 0;
        for (String clue : clues) {
            total += locationMap.getOrDefault(clue, 0);
            if (clue.equals(targetClue)) {
                break;
            }
        }
        return total;
    }

    // Generate the deciphered map as a formatted string
    public String decipherMap() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < clues.size(); i++) {
            String clue = clues.get(i);
            int steps = locationMap.get(clue);
            sb.append("Index: ").append(i)
                    .append(" , Clue: ").append(clue)
                    .append(" , Step: ").append(steps)
                    .append("\n");
        }
        return sb.toString().trim();
    }
}
