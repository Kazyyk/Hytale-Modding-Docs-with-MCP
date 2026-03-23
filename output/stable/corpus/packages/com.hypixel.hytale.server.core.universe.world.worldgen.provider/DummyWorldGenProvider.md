# DummyWorldGenProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen.provider | Implements: IWorldGenProvider

public class DummyWorldGenProvider implements IWorldGenProvider

## Constants

- public static final String ID

## Fields

- public static final String ID

## Methods

- public IWorldGen getGenerator()
- public String toString()
- public WorldGenTimingsCollector getTimings()
- public Transform[] getSpawnPoints(int seed)
- public CompletableFuture<GeneratedChunk> generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)

Also in this package: DummyWorldGen, FlatWorldGen, FlatWorldGenProvider, IWorldGenProvider, Layer, VoidWorldGen, VoidWorldGenProvider

Complete API:
  public IWorldGen getGenerator()
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<DummyWorldGenProvider> CODEC
