# DiskResourceStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.resources | Implements: IResourceStorageProvider

public class DiskResourceStorageProvider implements IResourceStorageProvider

## Fields

- public static final String ID
- public static final BuilderCodec<DiskResourceStorageProvider> CODEC
- @Nonnull private String path

## Methods

- @Nonnull public String getPath()
- @Nonnull @Override public <T extends WorldProvider> IResourceStorage getResourceStorage(@Nonnull World world)
- @Nonnull @Override public String toString()
- @Deprecated(forRemoval = true) public static void migrateFiles(@Nonnull World world)

## Inner Types

- `DiskResourceStorageProvider.DiskResourceStorage`
