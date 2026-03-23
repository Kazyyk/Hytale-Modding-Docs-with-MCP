# FlatWorldGenProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen.provider | Implements: IWorldGenProvider

public class FlatWorldGenProvider implements IWorldGenProvider

## Constants

- public static final String ID
- public static final Color DEFAULT_TINT

## Fields

- public static final String ID
- private Color tint
- private FlatWorldGenProvider.Layer[] layers
- private final FlatWorldGenProvider.Layer[] layers
- private final int tintId
- public int from
- public int to
- public String environment
- public String blockType
- public int environmentId
- public int blockId

## Methods

- public FlatWorldGenProvider()
- public FlatWorldGenProvider(Color tint, FlatWorldGenProvider.Layer[] layers)
- public IWorldGen getGenerator()
- public String toString()
- public WorldGenTimingsCollector getTimings()
- public Transform[] getSpawnPoints(int seed)
- public CompletableFuture<GeneratedChunk> generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)
- public String toString()

Also in this package: DummyWorldGen, DummyWorldGenProvider, FlatWorldGen, IWorldGenProvider, Layer, VoidWorldGen, VoidWorldGenProvider

Complete API:
  public IWorldGen getGenerator()
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<FlatWorldGenProvider> CODEC
public static final Color DEFAULT_TINT
private Color tint
private FlatWorldGenProvider.Layer[] layers
