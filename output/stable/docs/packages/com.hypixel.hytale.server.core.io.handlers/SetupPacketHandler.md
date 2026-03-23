---
title: "SetupPacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.handlers"
fqcn: "com.hypixel.hytale.server.core.io.handlers.SetupPacketHandler"
api_surface: false
extends: "GenericConnectionPacketHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "handlers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers`

```java
public class SetupPacketHandler extends GenericConnectionPacketHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UUID` | `uuid` |
| `private final` | `String` | `username` |
| `private final` | `byte[]` | `referralData` |
| `private final` | `HostAddress` | `referralSource` |
| `private` | `PlayerCommonAssets` | `assets` |
| `private` | `boolean` | `receivedRequest` |
| `private` | `int` | `clientViewRadiusChunks` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getIdentifier()` |
| `@Override public` | `void` | `registered0(@Nonnull PacketHandler oldHandler)` |
| `@Override public` | `void` | `accept(@Nonnull ToServerPacket packet)` |
| `@Override public` | `void` | `closed(ChannelHandlerContext ctx)` |
| `public` | `void` | `handle(@Nonnull Disconnect packet)` |
| `public` | `void` | `handle(@Nonnull RequestAssets packet)` |
| `public` | `void` | `handle(@Nonnull ViewRadius packet)` |
| `public` | `void` | `handle(@Nonnull PlayerOptions packet)` |
