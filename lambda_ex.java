import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GradeProcessor {

    public double calculateAverage(List<Integer> grades) {
        return grades.stream().mapToInt(x -> x).average().orElse(0);
    }

    public int findMaxGrade(List<Integer> grades){
        Optional<Integer> max = grades.stream().max((a,b) -> a.compareTo(b));
        return max.orElse(0);
    }
    public List<Integer> filterPassingGrades(List<Integer> grades){
        return grades.stream().filter(x -> x >= 10).collect(Collectors.toList());
    }
    public  List<Integer> boostGrades(List<Integer> grades) {
        return grades.stream().map(x -> x+2).collect(Collectors.toList());
    }

}
