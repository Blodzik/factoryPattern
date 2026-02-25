package products;

public record CloudConfig(
        String providerType,
        String accessKey,
        String secretKey,
        String jsonKeyFilePath,
        String connectionString
) {}
