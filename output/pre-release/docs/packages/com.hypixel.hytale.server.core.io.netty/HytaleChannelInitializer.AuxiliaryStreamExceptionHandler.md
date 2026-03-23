---
title: "HytaleChannelInitializer.AuxiliaryStreamExceptionHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.HytaleChannelInitializer.AuxiliaryStreamExceptionHandler"
api_surface: false
extends: "ChannelInboundHandlerAdapter"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:19:37Z"
tags:
  - "networking"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.netty`

```java
private static class HytaleChannelInitializer.AuxiliaryStreamExceptionHandler extends ChannelInboundHandlerAdapter
```

Handles exceptions on auxiliary QUIC streams. Logs warnings and closes the stream. Ignores `ClosedChannelException`.

## Relationships

- Inner class of [HytaleChannelInitializer](HytaleChannelInitializer.md)
