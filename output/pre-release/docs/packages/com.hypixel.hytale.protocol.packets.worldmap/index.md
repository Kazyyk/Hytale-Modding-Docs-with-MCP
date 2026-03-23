---
title: "com.hypixel.hytale.protocol.packets.worldmap"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.worldmap"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "protocol"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.worldmap`

Network packets and data structures for the in-game world map system. Includes client-bound packets for map updates and settings, server-bound packets for teleportation and marker creation, and polymorphic map marker components.

## Types

| Type | Kind | Description |
|---|---|---|
| [BiomeData](BiomeData.md) | class | Serializable data structure carrying biome zone ID, zone name, biome name, and biome color for world map rendering. |
| [ClearWorldMap](ClearWorldMap.md) | class | Empty client-bound packet (ID 242) that clears the player's world map. Sent on the `WorldMap` network channel. |
| [ContextMenuItem](ContextMenuItem.md) | class | Serializable data structure for a context menu entry on the world map, consisting of a display name and a command string. |
| [CreateUserMarker](CreateUserMarker.md) | class | Server-bound packet (ID 246) sent when a player creates a marker on the world map. Contains position, optional name, marker image, tint color, and shared flag. |
| [HeightDeltaIconComponent](HeightDeltaIconComponent.md) | class | Map marker component (type ID 2) that changes the marker icon based on vertical distance between the marker and viewer. Configurable up/down delta thresholds and corresponding image assets. |
| [MapChunk](MapChunk.md) | class | Serializable data structure representing a single chunk tile on the world map, identified by chunk X/Z coordinates and an optional `MapImage`. |
| [MapImage](MapImage.md) | class | Serializable data structure for a world map image tile with width, height, and nullable pixel data array. |
| [MapMarker](MapMarker.md) | class | Serializable data structure for a world map marker. Contains an ID, optional formatted name, custom name, marker image path, transform, context menu items array, and polymorphic component array. |
| [MapMarkerComponent](MapMarkerComponent.md) | class | Abstract base class for polymorphic map marker components. Subtypes are identified by integer type IDs: `PlayerMarkerComponent` (0), `PlacedByMarkerComponent` (1), `HeightDeltaIconComponent` (2), `TintComponent` (3). |
| [PlacedByMarkerComponent](PlacedByMarkerComponent.md) | class | Map marker component (type ID 1) identifying which player placed a marker. Contains a formatted name and the player's UUID. |
| [PlayerMarkerComponent](PlayerMarkerComponent.md) | class | Map marker component (type ID 0) associating a marker with a player by UUID. |
| [TeleportToWorldMapMarker](TeleportToWorldMapMarker.md) | class | Server-bound packet (ID 244) requesting teleportation to a specific world map marker by its string ID. |
| [TeleportToWorldMapPosition](TeleportToWorldMapPosition.md) | class | Server-bound packet (ID 245) requesting teleportation to an absolute world map position (x, y as integers). |
| [TintComponent](TintComponent.md) | class | Map marker component (type ID 3) that applies a tint color to the marker icon. |
| [UpdateWorldMap](UpdateWorldMap.md) | class | Compressed client-bound packet (ID 241) for incremental world map updates. Contains arrays of added/updated map chunks, added markers, and removed marker IDs. Sent on the `WorldMap` network channel. |
| [UpdateWorldMapSettings](UpdateWorldMapSettings.md) | class | Client-bound packet (ID 240) configuring world map settings: enabled state, biome data map, teleport permissions, marker creation/removal permissions, and zoom scale bounds (default/min/max). |
| [UpdateWorldMapVisible](UpdateWorldMapVisible.md) | class | Server-bound packet (ID 243) toggling the world map visibility state with a single boolean field. |
