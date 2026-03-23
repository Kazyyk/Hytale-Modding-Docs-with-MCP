---
title: "StreamManager.StreamHandlerFactory"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.stream"
fqcn: "com.hypixel.hytale.server.core.io.stream.StreamManager.StreamHandlerFactory"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:19:37Z"
tags:
  - "networking"
  - "stream"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.io.stream`

```java
public @FunctionalInterface interface StreamManager.StreamHandlerFactory
```

Functional interface for creating `ChannelHandler` instances for auxiliary streams. Single method: `ChannelHandler create(PacketHandler packetHandler)`.

## Relationships

- Inner type of [StreamManager](StreamManager.md)
