---
title: "PendingStreamHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.stream"
fqcn: "com.hypixel.hytale.server.core.io.stream.PendingStreamHandler"
api_surface: false
extends: "ChannelInboundHandlerAdapter"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:19:37Z"
tags:
  - "networking"
  - "stream"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.stream`

```java
public class PendingStreamHandler extends ChannelInboundHandlerAdapter
```

Netty handler for newly opened auxiliary QUIC streams. Expects a `StreamOpen` packet as the first message. Validates the stream type, enforces rate limits and maximum auxiliary stream count (4), creates the appropriate handler via `StreamManager`, replaces itself in the pipeline, and sends a `StreamOpenResponse`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `int` | `MAX_AUXILIARY_STREAMS` | `4` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PendingStreamHandler(PacketHandler packetHandler)` |
| `public` | `PendingStreamHandler(PacketHandler packetHandler, StreamManager streamManager)` |

## Relationships

- Extends `ChannelInboundHandlerAdapter`
- Works with [StreamManager](StreamManager.md) and [PacketHandler](../com.hypixel.hytale.server.core.io/PacketHandler.md)
