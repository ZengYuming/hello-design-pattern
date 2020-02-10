public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderThin builderThin = new BuilderThin();
        BuilderFat builderFat = new BuilderFat();

        director.build(builderThin);
        Product productA = builderThin.getResult();
        productA.show();
        director.build(builderFat);
        Product productB = builderFat.getResult();
        productB.show();
    }
}
