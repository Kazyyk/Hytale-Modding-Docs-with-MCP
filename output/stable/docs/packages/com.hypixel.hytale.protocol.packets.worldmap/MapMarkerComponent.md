---
title: "MapMarkerComponent"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.worldmap"
fqcn: "com.hypixel.hytale.protocol.packets.worldmap.MapMarkerComponent"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "protocol"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.worldmap`

```java
public abstract class MapMarkerComponent
```

Abstract base class for polymorphic map marker components. Subtypes are identified by integer type IDs: `PlayerMarkerComponent` (0), `PlacedByMarkerComponent` (1), `HeightDeltaIconComponent` (2), `TintComponent` (3).
