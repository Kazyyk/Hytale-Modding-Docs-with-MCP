---
title: "PacketArrayEncoder"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.PacketArrayEncoder"
api_surface: false
extends: "MessageToByteEncoder<Packet[]>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "networking"
  - "netty"
  - "io"
---

**Package:** `com.hypixel.hytale.server.core.io.netty`

```java
public class PacketArrayEncoder extends MessageToByteEncoder<Packet[]>
```

Netty encoder that serializes an array of `Packet` objects into a single `ByteBuf`. Writes each packet sequentially with its ID prefix, enabling batched packet transmission.
