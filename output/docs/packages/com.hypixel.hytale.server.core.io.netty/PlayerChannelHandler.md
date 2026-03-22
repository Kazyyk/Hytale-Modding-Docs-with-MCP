---
title: "PlayerChannelHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.PlayerChannelHandler"
api_surface: false
extends: "ChannelInboundHandlerAdapter"
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
public class PlayerChannelHandler extends ChannelInboundHandlerAdapter
```

Per-player Netty channel handler that dispatches decoded packets to the player's packet handler. Manages the player's connection lifecycle, handles disconnection cleanup, and tracks the player's network channel state.
