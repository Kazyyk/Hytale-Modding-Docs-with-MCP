# DiskResourceStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IResourceStorageProvider

public class DiskResourceStorageProvider implements IResourceStorageProvider

File-based resource storage. Persists ECS resources as JSON files in `<world>/<path>/` directory. Default path: `resources`. Registered as `"Disk"`. Handles legacy migration of `chunkstore`/`entitystore` subdirectories.
