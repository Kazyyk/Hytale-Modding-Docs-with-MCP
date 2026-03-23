---
title: "WorldLoadProgress"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.setup"
fqcn: "com.hypixel.hytale.protocol.packets.setup.WorldLoadProgress"
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
public class WorldLoadProgress implements Packet, ToClientPacket
```

Server-to-client packet (ID 21) reporting world loading progress as a float value between 0 and 1.
