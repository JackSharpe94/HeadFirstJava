import java.util.ArrayList;

public class SimpleDotCom {


    private ArrayList<String> locationCells;
    int numOfHits = 0;

    public String checkYourself(String userInput) {
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
        }

        if (locationCells.isEmpty()) {
            result = "kill";
        } 

        System.out.println(result);
        return result;
    }

    public void SetLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }
}
