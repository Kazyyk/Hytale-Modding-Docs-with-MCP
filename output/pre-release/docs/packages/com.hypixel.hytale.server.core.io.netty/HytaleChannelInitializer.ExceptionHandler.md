---
title: "HytaleChannelInitializer.ExceptionHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.HytaleChannelInitializer.ExceptionHandler"
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
private static class HytaleChannelInitializer.ExceptionHandler extends ChannelInboundHandlerAdapter
```

Handles Netty pipeline exceptions for game streams. Distinguishes read/write/connection timeouts from general errors. Sends a graceful disconnect message before closing. Uses atomic flag to prevent handling the same exception twice.

## Relationships

- Inner class of [HytaleChannelInitializer](HytaleChannelInitializer.md)
