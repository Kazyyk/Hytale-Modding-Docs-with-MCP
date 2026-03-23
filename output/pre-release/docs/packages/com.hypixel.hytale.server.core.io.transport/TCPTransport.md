---
title: "TCPTransport"
kind: "class"
package: "com.hypixel.hytale.server.core.io.transport"
fqcn: "com.hypixel.hytale.server.core.io.transport.TCPTransport"
api_surface: false
extends: ~
implements: ["Transport"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "transport"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.transport`

```java
public class TCPTransport implements Transport
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `EventLoopGroup` | `bossGroup` |
| `private final` | `EventLoopGroup` | `workerGroup` |
| `private final` | `ServerBootstrap` | `bootstrap` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `TransportType` | `getType()` |
| `@Override public` | `ChannelFuture` | `bind(InetSocketAddress address)` |
| `@Override public` | `void` | `shutdown()` |
