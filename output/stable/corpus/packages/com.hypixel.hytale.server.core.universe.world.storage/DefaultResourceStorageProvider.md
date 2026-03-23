# DefaultResourceStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IResourceStorageProvider

public class DefaultResourceStorageProvider implements IResourceStorageProvider

Default resource storage that delegates to `DiskResourceStorageProvider`. Registered as `"Hytale"`. Singleton via `INSTANCE`.

Also in this package: DiskResourceStorage, DiskResourceStorageProvider, EmptyResourceStorageProvider, IResourceStorageProvider

Complete API:
  public IResourceStorage getResourceStorage(World world)
  public String toString()

Fields:
public static final DefaultResourceStorageProvider INSTANCE
public static final String ID
public static final BuilderCodec<DefaultResourceStorageProvider> CODEC
public static final DiskResourceStorageProvider DEFAULT
