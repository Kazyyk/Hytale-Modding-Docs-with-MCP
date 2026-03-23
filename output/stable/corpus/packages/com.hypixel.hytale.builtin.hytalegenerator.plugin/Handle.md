# Handle

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.plugin | Implements: IWorldGen

public class Handle implements IWorldGen

Implements `IWorldGen` to provide Handle functionality.

## Fields

- @Nonnull private final HytaleGenerator plugin
- @Nonnull private final ChunkRequest.GeneratorProfile profile
- @Nullable private final String seedOverride

## Methods

- public Handle(@Nonnull HytaleGenerator plugin, @Nonnull ChunkRequest.GeneratorProfile profile, @Nullable String seedOverride)
- @Nonnull @Override public CompletableFuture<GeneratedChunk> generate(int seed, long index, int x, int z, LongPredicate stillNeeded)
- @Nonnull public ChunkRequest.GeneratorProfile getProfile()
- @Nonnull @Override public Transform[] getSpawnPoints(int seed)
- @Nonnull @Override public ISpawnProvider getDefaultSpawnProvider(int seed)
- @Nullable @Override public WorldGenTimingsCollector getTimings()
