# WorldMapSettings

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap

public class WorldMapSettings

Configuration for world map rendering and visibility. Controls the map area bounds, image scale factor, and view radius constraints. The `DISABLED` singleton represents a world map that is turned off.

## Constants


public static final WorldMapSettings DISABLED

Singleton instance representing a disabled world map (settings packet has `enabled = false`).

## Constructors


public WorldMapSettings()

Creates disabled settings.


public WorldMapSettings(Box2D worldMapArea, float imageScale, float viewRadiusMultiplier, int viewRadiusMin, int viewRadiusMax, @Nonnull UpdateWorldMapSettings settingsPacket)

## Instance Methods


public Box2D getWorldMapArea()


public float getImageScale()

Returns the scale factor applied to map image dimensions. Default is 0.5.


public UpdateWorldMapSettings getSettingsPacket()


public int getViewRadius(int viewRadius)

Computes the effective view radius by applying the multiplier and clamping to the configured min/max bounds.


public String toString()
