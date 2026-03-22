---
title: "UpdateWorldMap"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.worldmap"
fqcn: "com.hypixel.hytale.protocol.packets.worldmap.UpdateWorldMap"
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
public class UpdateWorldMap
```

Compressed client-bound packet (ID 241) for incremental world map updates. Contains arrays of added/updated map chunks, added markers, and removed marker IDs. Sent on the `WorldMap` network channel.
