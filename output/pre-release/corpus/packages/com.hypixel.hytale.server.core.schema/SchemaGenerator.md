# SchemaGenerator

Type: class | Package: com.hypixel.hytale.server.core.schema

public class SchemaGenerator

Generates JSON schemas for asset types and plugin configurations. Collects schemas from all registered `AssetStore` instances and `ConfigRegistration` entries, writes them to a `Schema/` directory, and generates VS Code `settings.json` for schema-to-file associations.

Also in this package: AssetSchemaRegistration, ConfigRegistration, GenerationResult, VsCodeEntry

Complete API:
  public static void registerConfig(String name, BuilderCodec<?> codec, String virtualPath, List<String> fileMatchPatterns)
  public static void registerAssetSchema(String fileName, Function<SchemaContext,Schema> factory, List<String> fileMatchPatterns, String extension)
  public static Map<String,Schema> generateAssetSchemas()
  public static void generate(Path assetOutputDir, Path configOutputDir)
  private static SchemaGenerator.GenerationResult collectSchemas(boolean includeConfigs)
  private static void cleanAndCreateSchemaDir(Path schemaDir)
  private static void writeVsCodeSettings(Path outputDir, List<SchemaGenerator.VsCodeEntry> entries)
  public static String toFileName(String name)
  public static void writeSchemas(Map<String,Schema> schemas, Path schemaDir)
  public static void addVsCodeSchemaLink(BsonDocument vsCodeConfig, String schemaFileName, List<String> fileMatchPatterns, String extension)

Fields:
private static final HytaleLogger LOGGER
private static final List<SchemaGenerator.ConfigRegistration> configRegistrations
private static final List<SchemaGenerator.AssetSchemaRegistration> assetSchemaRegistrations
