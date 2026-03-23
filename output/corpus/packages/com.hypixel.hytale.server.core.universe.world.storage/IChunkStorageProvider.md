# IChunkStorageProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage

public interfaceinterface IChunkStorageProvider

Pluggable storage backend interface for chunk persistence. Implementations provide `initialize`, `close`, `getLoader`, `getSaver`, and `migrateFrom` methods. Uses `BuilderCodecMapCodec` for JSON configuration.
