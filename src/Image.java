public class Image implements Uploadable{
    String imageName;
    public Image(String imageName) {
        this.imageName = imageName;
    }
    @Override
    public String getName() {
        return this.imageName;
    }
}
