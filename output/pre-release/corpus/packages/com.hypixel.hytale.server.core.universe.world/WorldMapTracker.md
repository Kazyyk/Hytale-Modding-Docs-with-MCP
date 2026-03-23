# WorldMapTracker

Type: class | Package: com.hypixel.hytale.server.core.universe.world | Implements: Tickable

public class WorldMapTracker implements Tickable

Per-player world map state manager. Tracks which map chunks are loaded for a player, handles spiral-order loading/unloading, zone discovery with sound/title events, marker tracking, biome tracking, and reload-on-change. Respects world map area bounds, view radius, and frame size limits.

## Inner Types

- `WorldMapTracker.ZoneDiscoveryInfo` -- record with zone name, region, display flag, sound, icon, and timing
