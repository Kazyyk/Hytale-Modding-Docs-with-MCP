---
title: "OpenWindow"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.window"
fqcn: "com.hypixel.hytale.protocol.packets.window.OpenWindow"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "window"
---

**Package:** `com.hypixel.hytale.protocol.packets.window`

```java
public class OpenWindow implements Packet, ToClientPacket
```

Server-to-client packet (ID 142) opening a window, specifying type, title, slot count, and window data.
