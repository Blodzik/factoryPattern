package products;

public class AzureStorage implements CloudStorage {
    private final String connectionString;

    public AzureStorage(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void uploadFile(String fileName, byte[] content) {
        System.out.println("Uploading [" + fileName + "] to Azure Blob Storage.");
        System.out.println("Using Connection String: " + connectionString);
    }
}
