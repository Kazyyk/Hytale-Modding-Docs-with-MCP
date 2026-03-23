# VoidWorldGenProvider.VoidWorldGen

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen.provider | Implements: IWorldGen

public static class VoidWorldGen implements IWorldGen

## Fields

- private final int tintId
- private final int environmentId

## Methods

- public VoidWorldGen()
- public VoidWorldGen(@Nullable Color tint, @Nullable String environment)
- public VoidWorldGen(int tintId, int environmentId)
- public WorldGenTimingsCollector getTimings()
- public Transform[] getSpawnPoints(int seed)
- public CompletableFuture<GeneratedChunk> generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)

Also in this package: DummyWorldGen, DummyWorldGenProvider, FlatWorldGen, FlatWorldGenProvider, IWorldGenProvider, Layer, VoidWorldGenProvider

Complete API:
  public WorldGenTimingsCollector getTimings()
  public Transform[] getSpawnPoints(int seed)
  public CompletableFuture<GeneratedChunk> generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)

Fields:
private final int tintId
private final int environmentId
