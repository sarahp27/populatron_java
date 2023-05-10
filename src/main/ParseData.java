import java.util.List;
import java.util.stream.Collectors;

public class ParseData{

    private final List<String> popText;
    private final int totalPopulation;

    public ParseData(List<String> data) {
        popText = data.stream()
                .skip(1) 
                .map(line -> line.split(","))
                .map(parts -> parts[4])
                .collect(Collectors.toList());
    }

    public List<String> getPopData() {
        return popText;
    }
  
    public static sum(List<String> data){
        totalPopulation = data.stream()
                    .skip(1)
                    .mapToInt(str -> {
                        try {
                            return Integer.parseInt(str.split(",")[4]);
                        } catch ( ArrayIndexOutOfBoundsException e) {
                            return 0; 
                        }
                    })
                    .sum();
                
                    return totalPopulation;
        }
}
