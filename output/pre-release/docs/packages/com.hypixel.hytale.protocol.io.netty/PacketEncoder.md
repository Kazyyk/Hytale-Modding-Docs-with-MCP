---
title: "PacketEncoder"
kind: "class"
package: "com.hypixel.hytale.protocol.io.netty"
fqcn: "com.hypixel.hytale.protocol.io.netty.PacketEncoder"
api_surface: false
extends: "MessageToByteEncoder<Packet>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "protocol"
---

**Package:** `com.hypixel.hytale.protocol.io.netty`

```java
public class PacketEncoder extends MessageToByteEncoder<Packet>
```

Concrete implementation extending `MessageToByteEncoder<Packet>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `encode(@Nonnull ChannelHandlerContext ctx, @Nonnull Packet packet, @Nonnull ByteBuf out)` | `void` | protected method. |
