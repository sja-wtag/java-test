public class File implements  Uploadable{
    private String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public String getName() {
        return this.fileName;
    }

    public String test() {
    return "test";
  }
}
