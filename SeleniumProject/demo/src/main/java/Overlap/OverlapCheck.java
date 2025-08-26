package Overlap;

import org.openqa.selenium.Rectangle;

public class OverlapCheck {
    public boolean isOverlapping(Rectangle r1,Rectangle r2){
        int r1Left = r1.getX();
        int r1Right = r1.getX() + r1.getWidth();
        int r1Top = r1.getY();
        int r1Bottom = r1.getY() + r1.getHeight();

        int r2Left = r2.getX();
        int r2Right = r2.getX() + r2.getWidth();
        int r2Top = r2.getY();
        int r2Bottom = r2.getY() + r2.getHeight();

        return !(r1Left >= r2Right || r1Right <= r2Left ||
                r1Top >= r2Bottom || r1Bottom <= r2Top);
    }
}
