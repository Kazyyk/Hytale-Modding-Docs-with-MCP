# DiskResourceStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IResourceStorageProvider

public class DiskResourceStorageProvider implements IResourceStorageProvider

File-based resource storage. Persists ECS resources as JSON files in `<world>/<path>/` directory. Default path: `resources`. Registered as `"Disk"`. Handles legacy migration of `chunkstore`/`entitystore` subdirectories.

Also in this package: DefaultResourceStorageProvider, DiskResourceStorage, EmptyResourceStorageProvider, IResourceStorageProvider

Complete API:
  public String getPath()
  public IResourceStorage getResourceStorage(World world)
  public String toString()
  public static void migrateFiles(World world)

Fields:
public static final String ID
public static final BuilderCodec<DiskResourceStorageProvider> CODEC
private String path
