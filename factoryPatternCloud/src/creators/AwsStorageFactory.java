package creators;

import products.CloudConfig;
import products.CloudStorage;
import products.S3Storage;

public class AwsStorageFactory implements CloudStorageFactory {
    @Override
    public CloudStorage createStorage(CloudConfig config) {
        if(config.accessKey() == null || config.secretKey() == null) {
            throw new IllegalArgumentException("Missing AWS credentials");
        }
        return new S3Storage(config.accessKey(), config.secretKey());
    }
}
