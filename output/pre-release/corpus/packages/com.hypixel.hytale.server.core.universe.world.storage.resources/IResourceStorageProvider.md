# IResourceStorageProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage.resources

public interface IResourceStorageProvider

## Fields

- @Nonnull BuilderCodecMapCodec<IResourceStorageProvider> CODEC

## Methods

- <T extends WorldProvider> IResourceStorage getResourceStorage(@Nonnull World var1)

Known implementors: DefaultResourceStorageProvider, DiskResourceStorageProvider, EmptyResourceStorageProvider

Also in this package: DefaultResourceStorageProvider, DiskResourceStorage, DiskResourceStorageProvider, EmptyResourceStorageProvider

Complete API:
  IResourceStorage getResourceStorage(World var1)

Fields:
BuilderCodecMapCodec<IResourceStorageProvider> CODEC
