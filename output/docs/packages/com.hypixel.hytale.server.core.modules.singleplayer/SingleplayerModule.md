---
title: "SingleplayerModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.singleplayer"
fqcn: "com.hypixel.hytale.server.core.modules.singleplayer.SingleplayerModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "singleplayer"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.singleplayer`

```java
public class SingleplayerModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static` | `SingleplayerModule` | `instance` |
| `private` | `Access` | `access` |
| `private` | `Access` | `requestedAccess` |
| `private` | `List<InetSocketAddress>` | `publicAddresses` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `SingleplayerModule` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `@Override protected` | `void` | `start()` |
| `public` | `Access` | `getAccess()` |
| `public` | `Access` | `getRequestedAccess()` |
| `public` | `void` | `requestServerAccess(Access access)` |
| `public` | `void` | `setPublicAddresses(List<InetSocketAddress> publicAddresses)` |
| `public` | `void` | `updateAccess(Access access)` |
| `public static` | `void` | `checkClientPid()` |
| `public static` | `UUID` | `getUuid()` |
| `public static` | `String` | `getUsername()` |
| `public static` | `boolean` | `isOwner(PlayerRef player)` |
| `public static` | `boolean` | `isOwner(PlayerAuthentication playerAuth, UUID playerUuid)` |
