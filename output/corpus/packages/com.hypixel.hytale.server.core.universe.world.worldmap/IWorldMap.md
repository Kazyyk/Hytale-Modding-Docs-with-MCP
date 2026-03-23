# IWorldMap

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.worldmap

public interface IWorldMap

Interface for world map generators that produce map images and points of interest from world data. Implementations are responsible for asynchronously rendering map tiles and discovering notable locations.

## Methods


WorldMapSettings getWorldMapSettings()

Returns the settings controlling map area, image scale, and view radius.


CompletableFuture<WorldMap> generate(World var1, int var2, int var3, LongSet var4)

Asynchronously generates map images for the specified chunk indices at the given dimensions.


CompletableFuture<Map<String, MapMarker>> generatePointsOfInterest(World var1)

Asynchronously discovers and returns all points of interest as named map markers.


default void shutdown()

Called when this generator is replaced or the world shuts down. Default implementation is a no-op.
