---
title: "HytaleServerConfig"
kind: "class"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.HytaleServerConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "core"
  - "server"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public class HytaleServerConfig
```

The server configuration model, loaded from `config.json`. Manages server name, MOTD, password, max players, max view radius, default world/gamemode, connection timeouts, rate limits, module configs, log levels, mod configs, player storage provider, auth credential store, update config, and backup config. Supports versioned codec deserialization (current version: 4) with legacy migration.

## Inner Classes

| Type | Kind | Description |
|---|---|---|
| `Defaults` | class | Default world name and game mode settings. |
| `Module` | class | Per-module configuration with enabled flag and nested document data. |
| `TimeoutProfile` | class | Connection timeout durations for each authentication/setup phase. |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `HytaleServerConfig` | `load()` |
| `@Nonnull public static` | `CompletableFuture<Void>` | `save(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `String` | `getServerName()` |
| `public` | `void` | `setServerName(@Nonnull String serverName)` |
| `public` | `String` | `getMotd()` |
| `public` | `int` | `getMaxPlayers()` |
| `public` | `void` | `setMaxPlayers(int maxPlayers)` |
| `public` | `int` | `getMaxViewRadius()` |
| `@Nonnull public` | `HytaleServerConfig.Defaults` | `getDefaults()` |
| `@Nonnull public` | `Map<String, HytaleServerConfig.Module>` | `getModules()` |
| `@Nonnull public` | `Map<PluginIdentifier, ModConfig>` | `getModConfig()` |
| `public` | `boolean` | `shouldSkipModValidation()` |
| `public` | `void` | `markChanged()` |
