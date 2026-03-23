---
title: "ServerPlayerListModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.serverplayerlist"
fqcn: "com.hypixel.hytale.server.core.modules.serverplayerlist.ServerPlayerListModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "serverplayerlist"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.serverplayerlist`

```java
public class ServerPlayerListModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static final` | `int` | `PING_UPDATE_INTERVAL_SECONDS` |
| `private static` | `ServerPlayerListModule` | `instance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ServerPlayerListModule` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `private` | `void` | `onPlayerConnect(PlayerConnectEvent event)` |
| `private` | `void` | `onPlayerDisconnect(PlayerDisconnectEvent event)` |
| `private` | `void` | `onPlayerAddedToWorld(AddPlayerToWorldEvent event)` |
| `private` | `void` | `broadcastPingUpdates()` |
| `private static` | `int` | `getPingValue(PacketHandler handler)` |
| `@Nonnull private static` | `ServerPlayerListPlayer` | `createServerPlayerListPlayer(PlayerRef playerRef)` |
