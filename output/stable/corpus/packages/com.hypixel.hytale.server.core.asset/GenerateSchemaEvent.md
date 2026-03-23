# GenerateSchemaEvent

Type: class | Package: com.hypixel.hytale.server.core.asset | Implements: IEvent<Void>

public class GenerateSchemaEvent implements IEvent<Void>

Event fired during boot to allow plugins to contribute JSON schemas for asset validation and editor support.

Also in this package: AssetModule, AssetNotifications, AssetPackRegisterEvent, AssetPackUnregisterEvent, AssetRegistryLoader, AssetStoreMonitorHandler, Builder, HytaleAssetStore, LoadAssetEvent

Complete API:
  public SchemaContext getContext()
  public BsonDocument getVsCodeConfig()
  public void addSchemaLink(String name, List<String> paths, String extension)
  public void addSchema(String fileName, Schema schema)

Fields:
protected final Map<String,Schema> schemas
protected final SchemaContext context
protected final BsonDocument vsCodeConfig
