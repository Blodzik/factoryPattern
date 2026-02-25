import creators.CloudStorageRegistry;
import products.CloudConfig;
import products.CloudStorage;


public class Main {
    public static void main(String[] args) {
        CloudStorageRegistry registry = new CloudStorageRegistry();
        byte[] dummyFile = "Hello World".getBytes();

        System.out.println("--- TESTING HAPPY PATHS ---");

        // Test AWS
        CloudConfig awsConfig = new CloudConfig("AWS", "AKIA12345", "SecretXYZ987", null, null);
        CloudStorage awsClient = registry.getStorageClient(awsConfig);
        awsClient.uploadFile("resume_aws.pdf", dummyFile);
        System.out.println();

        // Test GCP 
        CloudConfig gcpConfig = new CloudConfig("GCP", null, null, "/opt/keys/gcp-service-account.json", null);
        CloudStorage gcpClient = registry.getStorageClient(gcpConfig);
        gcpClient.uploadFile("resume_gcp.pdf", dummyFile);
        System.out.println();

        // Test Azure
        CloudConfig azureConfig = new CloudConfig("AZURE", null, null, null, "DefaultEndpointsProtocol=https;AccountName=myacc;");
        CloudStorage azureClient = registry.getStorageClient(azureConfig);
        azureClient.uploadFile("resume_azure.pdf", dummyFile);
        System.out.println();


        System.out.println("--- TESTING EDGE CASES & EXCEPTIONS ---");

        // Test 1: Missing AWS Credentials
        try {
            CloudConfig badAwsConfig = new CloudConfig("AWS", null, null, null, null);
            System.out.println("Attempting to create AWS client with missing keys...");
            registry.getStorageClient(badAwsConfig);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
        System.out.println();

        // Test 2: Unknown Cloud Provider
        try {
            CloudConfig ibmConfig = new CloudConfig("IBM", "key", "secret", null, null);
            System.out.println("Attempting to use unsupported provider (IBM)...");
            registry.getStorageClient(ibmConfig);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
    }
}