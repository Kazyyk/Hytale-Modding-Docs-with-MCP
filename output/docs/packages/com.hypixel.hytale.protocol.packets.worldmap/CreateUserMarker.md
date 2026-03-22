---
title: "CreateUserMarker"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.worldmap"
fqcn: "com.hypixel.hytale.protocol.packets.worldmap.CreateUserMarker"
api_surface: false
extends: ~
implements: ["com.hypixel.hytale.protocol.Packet", "com.hypixel.hytale.protocol.ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "protocol"
  - "packet"
---

**Package:** `com.hypixel.hytale.protocol.packets.worldmap`

```java
public class CreateUserMarker
```

Server-bound packet (ID 246) sent when a player creates a marker on the world map. Contains position, optional name, marker image, tint color, and shared flag.
