

public class UploaderService<T extends Uploadable> {
    T uploadableObject;

    void setObject(T t){
        this.uploadableObject = t;
    }

    public void processFile(){
        System.out.println("Processing " + uploadableObject.getName());
    }

    public void uploadFile(){
        System.out.println("Uploading " + uploadableObject.getName());
    }
}
