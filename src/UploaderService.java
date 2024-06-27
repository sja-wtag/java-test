public class UploaderService<T extends Uploadable> {
    private static UploaderService<?> instance;
    private T uploadableObject;


    private UploaderService() {

    }


    public static synchronized UploaderService<?> getInstance() {
        if (instance == null) {
            instance = new UploaderService<>();
        }
        return instance;
    }


    public void setObject(T t) {
        this.uploadableObject = t;
    }

    public void processFile() {
        if (uploadableObject != null) {
            System.out.println("Processing " + uploadableObject.getName());
        } else {
            System.out.println("No object set for processing.");
        }
    }

    public void uploadFile() {
        if (uploadableObject != null) {
            System.out.println("Uploading " + uploadableObject.getName());
        } else {
            System.out.println("No object set for uploading.");
        }
    }
}