# LoadAssetEvent

Type: class | Package: com.hypixel.hytale.server.core.asset | Implements: IEvent<Void>

public class LoadAssetEvent implements IEvent<Void>

Event fired during the boot sequence to trigger asset loading. Carries the boot start timestamp and failure state for validation reporting.

Also in this package: AssetModule, AssetNotifications, AssetPackRegisterEvent, AssetPackUnregisterEvent, AssetRegistryLoader, AssetStoreMonitorHandler, Builder, GenerateSchemaEvent, HytaleAssetStore

Complete API:
  public long getBootStart()
  public boolean isShouldShutdown()
  public List<String> getReasons()
  public void failed(boolean shouldShutdown, String reason)
  public String toString()

Fields:
public static final short PRIORITY_LOAD_COMMON
public static final short PRIORITY_LOAD_REGISTRY
public static final short PRIORITY_LOAD_LATE
private final long bootStart
private final List<String> reasons
private boolean shouldShutdown
