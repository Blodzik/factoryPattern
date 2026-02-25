package creators;

import products.CloudConfig;
import products.CloudStorage;

import java.util.HashMap;
import java.util.Map;

public class CloudStorageRegistry {
    private final Map<String, CloudStorageFactory> factoryMap = new HashMap<>();

    public CloudStorageRegistry() {
        factoryMap.put("AWS", new AwsStorageFactory());
        factoryMap.put("GCP", new GCPStorageFactory());
        factoryMap.put("AZURE", new AzureStorageFactory());
    }

    public CloudStorage getStorageClient(CloudConfig config) {
        CloudStorageFactory factory = factoryMap.get(config.providerType().toUpperCase());

        if (factory == null) {
            throw new IllegalArgumentException("Unsupported cloud provider: " + config.providerType());
        }

        return factory.createStorage(config);
    }
}
