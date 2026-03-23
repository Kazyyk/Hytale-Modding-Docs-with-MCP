# MigrationChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class MigrationChunkStorageProvider implements IChunkStorageProvider<MigrationChunkStorageProvider.MigrationData>

Chains multiple storage providers: tries each loader in order until a chunk is found, and saves to a single target provider. Used for migrating worlds between storage formats or creating read-only storage backed by multiple sources.
