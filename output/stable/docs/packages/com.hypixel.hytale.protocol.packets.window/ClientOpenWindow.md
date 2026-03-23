---
title: "ClientOpenWindow"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.window"
fqcn: "com.hypixel.hytale.protocol.packets.window.ClientOpenWindow"
api_surface: false
extends: null
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "window"
---

**Package:** `com.hypixel.hytale.protocol.packets.window`

```java
public class ClientOpenWindow implements Packet, ToServerPacket
```

Client-to-server packet (ID 143) requesting a window be opened, specifying window type and entity reference.
