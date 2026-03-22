---
title: "LatencySimulationHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.netty"
fqcn: "com.hypixel.hytale.server.core.io.netty.LatencySimulationHandler"
api_surface: false
extends: "ChannelDuplexHandler"
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
public class LatencySimulationHandler extends ChannelDuplexHandler
```

Netty handler that artificially delays inbound and outbound packets to simulate network latency. Used for development and testing. Configurable delay is applied by scheduling messages on the event loop.
