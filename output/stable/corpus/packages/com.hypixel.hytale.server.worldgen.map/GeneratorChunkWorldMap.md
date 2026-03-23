# GeneratorChunkWorldMap

Type: class | Package: com.hypixel.hytale.server.worldgen.map | Extends: ChunkWorldMap

public class GeneratorChunkWorldMap extends ChunkWorldMap

## Fields

- private static final WorldMap EMPTY
- private final ChunkGenerator generator
- private final Executor executor

## Methods

- @Nonnull @Override public CompletableFuture<Map<String,MapMarker>> generatePointsOfInterest(World world)
- @Nonnull @Override public WorldMapSettings getWorldMapSettings()

Complete API:
  public CompletableFuture<Map<String,MapMarker>> generatePointsOfInterest(World world)
  public WorldMapSettings getWorldMapSettings()

Fields:
private static final WorldMap EMPTY
private final ChunkGenerator generator
private final Executor executor
