---
title: "SyncInteractionChains"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.interaction"
fqcn: "com.hypixel.hytale.protocol.packets.interaction.SyncInteractionChains"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol.packets.interaction`

```java
public class SyncInteractionChains implements Packet, ToClientPacket
```

Server-to-client packet (ID 292) synchronizing multiple interaction chains as an array of `SyncInteractionChain` packets.
