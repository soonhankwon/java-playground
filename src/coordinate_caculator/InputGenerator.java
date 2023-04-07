package coordinate_caculator;

import java.util.ArrayList;
import java.util.List;

public class InputGenerator {
    public List<Pos> convertInput(String input) {
        String[] split = input.replaceAll("[()]", "").split("-");
        ArrayList<Pos> list = new ArrayList<>();

        for(String s : split) {
            String[] split1 = s.split(",");
            list.add(new Pos(Integer.parseInt(split1[0]),Integer.parseInt(split1[1])));
        }
        return list;
    }
}
