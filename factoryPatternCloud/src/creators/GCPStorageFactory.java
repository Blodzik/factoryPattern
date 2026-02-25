package creators;

import products.CloudConfig;
import products.CloudStorage;
import products.GSPStorage;

public class GCPStorageFactory implements CloudStorageFactory {
    @Override
    public CloudStorage createStorage(CloudConfig config) {
        if(config.jsonKeyFilePath() == null) {
            throw new IllegalArgumentException("Missing GSP credentials");
        }
        return new GSPStorage(config.jsonKeyFilePath());
    }
}
