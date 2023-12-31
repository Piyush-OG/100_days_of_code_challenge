import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isPathCrossing(String path) {
        int [] coordinates = {0 , 0};
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        for (char c : path.toCharArray())
        {
            if (c == 'N') coordinates[1] +=1;
             else if (c == 'S') coordinates[1] -=1;
             else if (c == 'E') coordinates[0] +=1;
             else if (c == 'W') coordinates[0] -=1;

            String currentCoordinate = coordinates[0] + "," + coordinates[1];
            if (!visited.add(currentCoordinate)) return true;
        }

        return false;
    }
}
