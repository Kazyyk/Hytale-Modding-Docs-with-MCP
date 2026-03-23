# HytaleAssetStore

Type: class | Package: com.hypixel.hytale.server.core.asset

public class HytaleAssetStore

Extended asset store base used by the Hytale server. Adds network packet generation for sending asset definitions to clients, file monitoring for hot-reload, and schema generation support.

Also in this package: AssetModule, AssetNotifications, AssetPackRegisterEvent, AssetPackUnregisterEvent, AssetRegistryLoader, AssetStoreMonitorHandler, Builder, GenerateSchemaEvent, LoadAssetEvent

Complete API:
  public AssetPacketGenerator<K,T,M> getPacketGenerator()
  public Function<K,ItemWithAllMetadata> getNotificationItemFunction()
  protected EventBus getEventBus()
  public void addFileMonitor(String packKey, Path assetsPath)
  public void removeFileMonitor(Path path)
  protected void handleRemoveOrUpdate(Set<K> toBeRemoved, Map<K,T> toBeUpdated, AssetUpdateQuery query)
  public void sendAssets(Consumer<ToClientPacket[]> packetConsumer)
  protected void sendReloadedNotification(AssetLoadResult<K,T> result)
  protected void sendRemovedNotification(Set<K> removedKeys)
  protected void sendNotificationKeys(Message primaryMessage, String icon, Set<K> keys)
  protected void sendNotificationPaths(Message primaryMessage, Set<Path> paths)
  public static HytaleAssetStore.Builder<String,T,M> builder(Class<T> tClass, M assetMap)
  public static HytaleAssetStore.Builder<K,T,M> builder(Class<K> kClass, Class<T> tClass, M assetMap)

Fields:
public static final Queue<Consumer<ToClientPacket>> SETUP_PACKET_CONSUMERS
protected final AssetPacketGenerator<K,T,M> packetGenerator
protected final Function<K,ItemWithAllMetadata> notificationItemFunction
protected SoftReference<ToClientPacket[]> cachedInitPackets
