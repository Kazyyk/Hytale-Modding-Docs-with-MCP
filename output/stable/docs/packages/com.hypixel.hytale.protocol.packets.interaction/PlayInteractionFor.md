---
title: "PlayInteractionFor"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.interaction"
fqcn: "com.hypixel.hytale.protocol.packets.interaction.PlayInteractionFor"
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
public class PlayInteractionFor implements Packet, ToClientPacket
```

Server-to-client packet (ID 293) instructing the client to play an interaction for a specific entity. Contains the entity reference and interaction ID string.
