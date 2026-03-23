# EmptyResourceStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IResourceStorageProvider

public class EmptyResourceStorageProvider implements IResourceStorageProvider

No-op resource storage using `EmptyResourceStorage`. Registered as `"Empty"`. Singleton via `INSTANCE`.

Also in this package: DefaultResourceStorageProvider, DiskResourceStorage, DiskResourceStorageProvider, IResourceStorageProvider

Complete API:
  public IResourceStorage getResourceStorage(World world)
  public String toString()

Fields:
public static final EmptyResourceStorageProvider INSTANCE
public static final String ID
public static final BuilderCodec<EmptyResourceStorageProvider> CODEC
