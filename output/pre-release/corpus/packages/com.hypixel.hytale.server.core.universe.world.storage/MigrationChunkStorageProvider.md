# MigrationChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<MigrationData>

public class MigrationChunkStorageProvider implements IChunkStorageProvider<MigrationData>

Chains multiple loader providers with a single saver. Loaders are tried in order until one succeeds. Registered as `"Migration"` in the codec. Useful for format migration or read-only configurations.
