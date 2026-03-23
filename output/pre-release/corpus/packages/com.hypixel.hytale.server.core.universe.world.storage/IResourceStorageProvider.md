# IResourceStorageProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage

public interfaceinterface IResourceStorageProvider

Interface for pluggable resource (non-chunk) storage. Provides `getResourceStorage(World)` returning an `IResourceStorage`. Uses `BuilderCodecMapCodec` for configuration.

Known implementors: DefaultResourceStorageProvider, DiskResourceStorageProvider, EmptyResourceStorageProvider

Also in this package: DefaultResourceStorageProvider, DiskResourceStorage, DiskResourceStorageProvider, EmptyResourceStorageProvider

Complete API:
  IResourceStorage getResourceStorage(World var1)

Fields:
BuilderCodecMapCodec<IResourceStorageProvider> CODEC
