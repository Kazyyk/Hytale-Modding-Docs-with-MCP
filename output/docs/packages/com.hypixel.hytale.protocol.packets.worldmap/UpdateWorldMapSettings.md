---
title: "UpdateWorldMapSettings"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.worldmap"
fqcn: "com.hypixel.hytale.protocol.packets.worldmap.UpdateWorldMapSettings"
api_surface: false
extends: ~
implements: ["com.hypixel.hytale.protocol.Packet", "com.hypixel.hytale.protocol.ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "protocol"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.worldmap`

```java
public class UpdateWorldMapSettings
```

Client-bound packet (ID 240) configuring world map settings: enabled state, biome data map, teleport permissions, marker creation/removal permissions, and zoom scale bounds (default/min/max).
