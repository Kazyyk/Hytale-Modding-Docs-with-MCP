---
title: "Transport"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.transport"
fqcn: "com.hypixel.hytale.server.core.io.transport.Transport"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "transport"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.io.transport`

```java
public interface Transport
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `TransportType` | `getType()` |
| `` | `ChannelFuture` | `bind(InetSocketAddress var1)` |
| `` | `void` | `shutdown()` |
