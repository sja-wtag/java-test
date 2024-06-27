//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Image image = new Image("Image.png");
            UploaderService<Image> imageUpload = new UploaderService<Image>();
            imageUpload.setObject(image);
            imageUpload.processFile();
            imageUpload.uploadFile();

            File file = new File("file.pdf");
            UploaderService<File> fileUpload = new UploaderService<File>();
            fileUpload.setObject(file);
            fileUpload.processFile();
            fileUpload.uploadFile();
    }
}