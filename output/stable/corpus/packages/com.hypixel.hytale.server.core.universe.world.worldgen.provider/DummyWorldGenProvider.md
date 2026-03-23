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
