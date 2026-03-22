---
title: "HytaleChannelInitializer"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.HytaleChannelInitializer"
api_surface: false
extends: "ChannelInitializer<Channel>"
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
public class HytaleChannelInitializer extends ChannelInitializer<Channel>
```

Netty channel initializer that configures the pipeline for incoming client connections. Handles both QUIC stream channels and standard channels. Installs packet encoder/decoder, rate limiting, timeout handling, latency simulation (if configured), and the initial packet handler. Also extracts client certificates for QUIC connections.
