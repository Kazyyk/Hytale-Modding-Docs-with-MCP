# PrefabMarkerProvider

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Implements: WorldMapManager.MarkerProvider

public class PrefabMarkerProvider implements WorldMapManager.MarkerProvider

Singleton marker provider that adds world map markers for all loaded prefabs in the player's active edit session. Each prefab produces a `MapMarker` at its location.

## Fields

- INSTANCE | PrefabMarkerProvider | Singleton instance.

## Methods

- update(World, Player, MarkersCollector) | void | Collects markers for all prefabs in the player's edit session.

## See Also

- PrefabEditSession
