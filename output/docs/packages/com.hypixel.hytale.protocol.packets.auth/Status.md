---
title: "Status"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.auth"
fqcn: "com.hypixel.hytale.protocol.packets.auth.Status"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "auth"
---

**Package:** `com.hypixel.hytale.protocol.packets.auth`

```java
public class Status implements Packet, ToClientPacket
```

Server-to-client packet (ID 19) carrying a status code integer. Used to communicate connection status or error conditions.
