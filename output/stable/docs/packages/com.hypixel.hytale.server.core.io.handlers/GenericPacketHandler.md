---
title: "GenericPacketHandler"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.io.handlers"
fqcn: "com.hypixel.hytale.server.core.io.handlers.GenericPacketHandler"
api_surface: false
extends: "PacketHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "handlers"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers`

```java
public abstract class GenericPacketHandler extends PacketHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Consumer<ToServerPacket>` | `EMPTY_CONSUMER` |
| `protected final` | `List<SubPacketHandler>` | `packetHandlers` |
| `private` | `Consumer<ToServerPacket>[]` | `handlers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `Consumer<ToServerPacket>[]` | `newHandlerArray(int size)` |
| `public` | `void` | `registerSubPacketHandler(SubPacketHandler subPacketHandler)` |
| `public` | `void` | `registerHandler(int packetId, @Nonnull Consumer<ToServerPacket> handler)` |
| `public` | `void` | `registerNoOpHandlers(@Nonnull int... packetIds)` |
| `@Override public final` | `void` | `accept(@Nonnull ToServerPacket packet)` |
