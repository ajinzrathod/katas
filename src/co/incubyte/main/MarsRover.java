package co.incubyte.main;


import java.text.MessageFormat;

public class MarsRover {
    private int currentXAxisPosition = 0;
    private int currentYAxisPosition = 0;
    private String currentFacingDirection = "N";
    private final String clockwiseDirection = "NESWN";
    private final String antiClockwiseDirection = "NWSEN";
    private final int gridX = 9;
    private final int gridY = 9;

    public String moveRover(String input) {
        int length = input.length();
        int index = 0;

        for (; length > 0 && index < length; ) {
            while (input.charAt(index) == 'M') {
                switch (this.currentFacingDirection) {
                    case "E":
                        if (this.currentXAxisPosition < gridX) {
                            this.currentXAxisPosition += 1;
                        } else {
                            this.currentXAxisPosition = 0;
                        }
                        break;
                    case "S":
                        if (this.currentYAxisPosition > 0) {
                            this.currentYAxisPosition -= 1;
                        } else {
                            this.currentYAxisPosition = gridY;
                        }
                        break;
                    case "W":
                        if (this.currentXAxisPosition > 0) {
                            this.currentXAxisPosition -= 1;
                        } else {
                            this.currentXAxisPosition = gridX;
                        }
                        break;
                    case "N":
                        if (this.currentYAxisPosition < gridY) {
                            this.currentYAxisPosition += 1;
                        } else {
                            this.currentYAxisPosition = 0;
                        }
                        break;
                }
                index++;
                if (length == index)
                    break;
            }
            if (length > index && input.charAt(index) == 'R') {
                this.currentFacingDirection = getRightSideDirection(this.currentFacingDirection);
                index++;
            }
            else if (length > index && input.charAt(index) == 'L') {
                this.currentFacingDirection = getLeftSideDirection(this.currentFacingDirection);
                index++;
            }
        }

        return MessageFormat.format("{0}:{1}:{2}", this.currentXAxisPosition, this.currentYAxisPosition, this.currentFacingDirection);
    }

    public String getRightSideDirection(String currentFacingDirection) {
        int index = clockwiseDirection.indexOf(currentFacingDirection);
        return String.valueOf(clockwiseDirection.charAt(index + 1));
    }

    public String getLeftSideDirection(String currentFacingDirection) {
        int index = antiClockwiseDirection.indexOf(currentFacingDirection);
        return String.valueOf(antiClockwiseDirection.charAt(index + 1));
    }
}
