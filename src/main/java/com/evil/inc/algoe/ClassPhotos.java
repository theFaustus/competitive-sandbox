package com.evil.inc.algoe;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassPhotos {
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.sort(Comparator.reverseOrder());
        blueShirtHeights.sort(Comparator.reverseOrder());
        boolean canBeArrangedBlueFirst = true;
        boolean canBeArrangedRedFirst = true;
        for (int i = 0; i < blueShirtHeights.size(); i++) {
            if(blueShirtHeights.get(i) >= redShirtHeights.get(i))
                canBeArrangedRedFirst = false;
        }

        for (int i = 0; i < blueShirtHeights.size(); i++) {
            if(redShirtHeights.get(i) >= blueShirtHeights.get(i))
                canBeArrangedBlueFirst = false;
        }

        return canBeArrangedBlueFirst || canBeArrangedRedFirst;
    }
}
