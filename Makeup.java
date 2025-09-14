public class Makeup {
    private final String eyeshadowColor;
    private final boolean hasEyeliner;
    private final String lipstickColor;
    private final boolean hasLipGloss;
    private final String blushColor;

    private Makeup(Builder builder) {
        this.eyeshadowColor = builder.eyeshadowColor;
        this.hasEyeliner = builder.hasEyeliner;
        this.lipstickColor = builder.lipstickColor;
        this.hasLipGloss = builder.hasLipGloss;
        this.blushColor = builder.blushColor;
    }

    public static class Builder {
        private String eyeshadowColor;
        private boolean hasEyeliner;
        private String lipstickColor;
        private boolean hasLipGloss;
        private String blushColor;

        public Builder withEyeshadowColor(String color) {
            this.eyeshadowColor = color;
            return this;
        }

        public Builder withEyeliner(boolean hasEyeliner) {
            this.hasEyeliner = hasEyeliner;
            return this;
        }

        public Builder withLipstickColor(String color) {
            this.lipstickColor = color;
            return this;
        }

        public Builder withLipGloss(boolean hasLipGloss) {
            this.hasLipGloss = hasLipGloss;
            return this;
        }

        public Builder withBlushColor(String color) {
            this.blushColor = color;
            return this;
        }

        public Makeup build() {
            return new Makeup(this);
        }
    }

    public String getEyeshadowColor() {
        return eyeshadowColor;
    }

    public boolean hasEyeliner() {
        return hasEyeliner;
    }

    public String getLipstickColor() {
        return lipstickColor;
    }

    public boolean hasLipGloss() {
        return hasLipGloss;
    }

    public String getBlushColor() {
        return blushColor;
    }

    @Override
    public String toString() {
        return "Your makeup is " +
                 eyeshadowColor + " on the eyes" +
                ", " + (hasEyeliner ? "with eyeliner" : "without eyeliner") +
                ", with " + lipstickColor + " lipstick" +
                ", " + (hasLipGloss ? "with lip gloss" : "without lip gloss") +
                " and " + blushColor + " blush";
    }
}
