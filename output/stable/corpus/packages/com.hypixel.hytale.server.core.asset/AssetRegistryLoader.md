# AssetRegistryLoader

Type: class | Package: com.hypixel.hytale.server.core.asset

public class AssetRegistryLoader

Handles ordered loading of all registered asset stores from asset packs. Resolves inter-store dependencies via `AssetStoreIterator`, loads assets from the `Server/` directory of each pack, generates JSON schemas, and provides a method to send all asset data to a connecting client.

## Methods

- public static void init()
- public static void preLoadAssets(@Nonnull LoadAssetEvent event)
- public static void loadAssets(@Nullable LoadAssetEvent event, @Nonnull AssetPack assetPack)
- public static void sendAssets(@Nonnull PacketHandler packetHandler)
- @Nonnull public static Map<String, Schema> generateSchemas(@Nonnull SchemaContext context, @Nonnull BsonDocument vsCodeConfig)
