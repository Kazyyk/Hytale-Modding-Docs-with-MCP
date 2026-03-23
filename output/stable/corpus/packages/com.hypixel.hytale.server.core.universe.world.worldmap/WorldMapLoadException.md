# WorldMapLoadException

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap | Extends: Exception

public class WorldMapLoadException extends Exception

Checked exception thrown when a world map fails to load. Provides a convenience method to extract a combined trace message from the exception chain.

## Constructors


public WorldMapLoadException(@Nonnull String message)


public WorldMapLoadException(@Nonnull String message, Throwable cause)

## Instance Methods


public String getTraceMessage()

Returns a comma-separated combined message from this exception and its cause chain.


public String getTraceMessage(@Nonnull String joiner)

Returns combined messages from the exception chain joined by the specified delimiter.

Also in this package: IWorldMap, ImageEntry, MarkerAndItsStore, MarkerProvider, MarkerReference, PlayerMarkerReference, WorldMapManager, WorldMapSettings

Complete API:
  public String getTraceMessage()
  public String getTraceMessage(String joiner)
