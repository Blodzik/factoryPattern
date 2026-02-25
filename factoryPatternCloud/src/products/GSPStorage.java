package products;

public class GSPStorage implements CloudStorage {
    private final String jsonKeyFilePath;

    public GSPStorage(String jsonKeyFilePath) {
        this.jsonKeyFilePath = jsonKeyFilePath;
    }

    @Override
    public void uploadFile(String fileName, byte[] content) {
        System.out.println("Uploading [" + fileName + "] to Google Cloud Storage.");
        System.out.println("Using JSON key file located at: " + jsonKeyFilePath);
    }
}
