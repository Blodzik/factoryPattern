package creators;

import products.AzureStorage;
import products.CloudConfig;
import products.CloudStorage;

public class AzureStorageFactory implements CloudStorageFactory {
    @Override
    public CloudStorage createStorage(CloudConfig config) {
        if(config.connectionString() == null) {
            throw new IllegalArgumentException("Missing Azure credentials");
        }
        return new AzureStorage(config.connectionString());
    }
}
