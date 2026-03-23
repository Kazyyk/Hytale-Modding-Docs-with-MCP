---
title: "PacketAdapters"
kind: "class"
package: "com.hypixel.hytale.server.core.io.adapter"
fqcn: "com.hypixel.hytale.server.core.io.adapter.PacketAdapters"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "io"
  - "adapter"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.adapter`

```java
public class PacketAdapters
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `List<PacketFilter>` | `inboundHandlers` |
| `private static final` | `List<PacketFilter>` | `outboundHandlers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `PacketFilter` | `registerInbound(PacketWatcher watcher)` |
| `public static` | `void` | `registerInbound(PacketFilter predicate)` |
| `@Nonnull public static` | `PacketFilter` | `registerOutbound(PacketWatcher watcher)` |
| `public static` | `void` | `registerOutbound(PacketFilter predicate)` |
| `@Nonnull public static` | `PacketFilter` | `registerInbound(PlayerPacketFilter filter)` |
| `@Nonnull public static` | `PacketFilter` | `registerOutbound(PlayerPacketFilter filter)` |
| `@Nonnull public static` | `PacketFilter` | `registerInbound(PlayerPacketWatcher watcher)` |
| `@Nonnull public static` | `PacketFilter` | `registerOutbound(PlayerPacketWatcher watcher)` |
| `public static` | `void` | `deregisterInbound(PacketFilter predicate)` |
| `public static` | `void` | `deregisterOutbound(PacketFilter predicate)` |
| `public static` | `boolean` | `__handleInbound(PacketHandler player, Packet packet)` |
| `private static` | `boolean` | `handle(List<PacketFilter> list, PacketHandler player, T packet)` |
| `public static` | `boolean` | `__handleOutbound(PacketHandler player, Packet packet)` |
