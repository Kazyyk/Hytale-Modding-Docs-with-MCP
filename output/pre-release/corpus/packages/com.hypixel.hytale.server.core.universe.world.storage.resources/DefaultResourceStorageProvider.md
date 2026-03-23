# DefaultResourceStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.resources | Implements: IResourceStorageProvider

public class DefaultResourceStorageProvider implements IResourceStorageProvider

## Fields

- public static final DefaultResourceStorageProvider INSTANCE
- public static final String ID
- public static final BuilderCodec<DefaultResourceStorageProvider> CODEC
- public static final DiskResourceStorageProvider DEFAULT

## Methods

- @Nonnull @Override public <T extends WorldProvider> IResourceStorage getResourceStorage(@Nonnull World world)
- @Nonnull @Override public String toString()

Also in this package: DiskResourceStorage, DiskResourceStorageProvider, EmptyResourceStorageProvider, IResourceStorageProvider

Complete API:
  public IResourceStorage getResourceStorage(World world)
  public String toString()

Fields:
public static final DefaultResourceStorageProvider INSTANCE
public static final String ID
public static final BuilderCodec<DefaultResourceStorageProvider> CODEC
public static final DiskResourceStorageProvider DEFAULT
