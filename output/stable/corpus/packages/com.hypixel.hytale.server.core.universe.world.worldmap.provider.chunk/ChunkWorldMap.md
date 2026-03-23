# ChunkWorldMap

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk | Implements: IWorldMap

public class ChunkWorldMap implements IWorldMap

Implements `IWorldMap`.

## Methods

- @Override public WorldMapSettings getWorldMapSettings()
- return new WorldMapSettings(null, 3.0F, 2.0F, 3, 32, settingsPacket)
- @Override public CompletableFuture<WorldMap> generate(World world, int imageWidth, int imageHeight, @Nonnull LongSet chunksToGenerate)
- @Override public CompletableFuture<Map<String, MapMarker>> generatePointsOfInterest(World world)
