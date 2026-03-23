---
title: "RateLimitHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.RateLimitHandler"
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
public class RateLimitHandler extends ChannelInboundHandlerAdapter
```

Netty handler that enforces per-connection packet rate limits. Tracks incoming packet counts within a sliding time window and disconnects clients that exceed the configured threshold. Uses `RateLimitConfig` for limit parameters.
