---
title: "CancelInteractionChain"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.interaction"
fqcn: "com.hypixel.hytale.protocol.packets.interaction.CancelInteractionChain"
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
public class CancelInteractionChain implements Packet, ToClientPacket
```

Server-to-client packet (ID 291) canceling an active interaction chain. Contains the chain ID and optional forked chain ID.
