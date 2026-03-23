---
title: "WorldSettings"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.setup"
fqcn: "com.hypixel.hytale.protocol.packets.setup.WorldSettings"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "setup"
---

**Package:** `com.hypixel.hytale.protocol.packets.setup`

```java
public class WorldSettings implements Packet, ToClientPacket
```

Server-to-client packet (ID 20) carrying world configuration including game mode, world time, daylight hours, and moon phase.
