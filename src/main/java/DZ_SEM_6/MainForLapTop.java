package DZ_SEM_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static DZ_SEM_6.LapTop.chooseAnAction;

public class MainForLapTop {
    public static void main(String[] args) {
        LapTop lapTop1 = new LapTop(Brand.HP, Color.SILVER);
        LapTop lapTop2 = new LapTop(Brand.MACBOOK, Color.WHITE);
        LapTop lapTop3 = new LapTop(Brand.MACBOOK,Color.BLACK);
        LapTop lapTop4 = new LapTop(Brand.HP, Color.BLACK);
        LapTop lapTop5 = new LapTop(Brand.HP, Color.WHITE);
        LapTop lapTop6 = new LapTop(Brand.LENOVA, Color.SILVER);
        LapTop lapTop7 = new LapTop(Brand.MACBOOK, Color.SILVER);
        LapTop lapTop8 = new LapTop(Brand.LENOVA, Color.WHITE);
        LapTop lapTop9 = new LapTop(Brand.LENOVA, Color.BLACK);

        Set<LapTop> lapTops = new HashSet<>();
        lapTops.add(lapTop1);
        lapTops.add(lapTop2);
        lapTops.add(lapTop3);
        lapTops.add(lapTop4);
        lapTops.add(lapTop5);
        lapTops.add(lapTop6);
        lapTops.add(lapTop7);
        lapTops.add(lapTop8);
        lapTops.add(lapTop9);
        System.out.println(lapTops);

        chooseAnAction(lapTops);


    }
}
