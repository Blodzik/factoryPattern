package creators;

import products.CloudConfig;
import products.CloudStorage;

public interface CloudStorageFactory {
    CloudStorage createStorage(CloudConfig config);
}
