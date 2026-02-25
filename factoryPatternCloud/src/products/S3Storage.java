package products;

public class S3Storage implements CloudStorage {
    private final String accessKey;
    private final String secreKey;

    public S3Storage(String accessKey, String secreKey) {
        this.accessKey = accessKey;
        this.secreKey = secreKey;
    }

    @Override
    public void uploadFile(String fileName, byte[] content) {
        System.out.println("Uploading [" + fileName + "] to AWS S3.");
        System.out.println("Uploading to AWS S3 using Access Key: " + accessKey);
    }
}
