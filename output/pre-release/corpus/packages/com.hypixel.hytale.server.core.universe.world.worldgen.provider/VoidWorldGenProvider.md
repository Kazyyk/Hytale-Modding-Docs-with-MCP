# VoidWorldGenProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen.provider | Implements: IWorldGenProvider

public class VoidWorldGenProvider implements IWorldGenProvider

## Constants

- public static final String ID

## Fields

- public static final String ID
- private Color tint
- private String environment
- private final int tintId
- private final int environmentId

## Methods

- public VoidWorldGenProvider()
- public VoidWorldGenProvider(Color tint, String environment)
- public IWorldGen getGenerator()
- public String toString()
- public WorldGenTimingsCollector getTimings()
- public Transform[] getSpawnPoints(int seed)
- public CompletableFuture<GeneratedChunk> generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)

Also in this package: DummyWorldGen, DummyWorldGenProvider, FlatWorldGen, FlatWorldGenProvider, IWorldGenProvider, Layer, VoidWorldGen

Complete API:
  public IWorldGen getGenerator()
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<VoidWorldGenProvider> CODEC
private Color tint
private String environment
