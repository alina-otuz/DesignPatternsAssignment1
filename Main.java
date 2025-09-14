public class Main {
    public static void main(String[] args){
        Makeup makeup = new Makeup.Builder()
                .withEyeshadowColor("Blue silver")
                .withEyeliner(true)
                .withLipstickColor("Red Mac")
                .withLipGloss(false)
                .withBlushColor("Peachy")
                .build();

        System.out.println("Makeup selected:");
        System.out.println(makeup);
    }
}
