---
title: "GameModeType"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.gamemode"
fqcn: "com.hypixel.hytale.server.core.asset.type.gamemode.GameModeType"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "gamemode"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.gamemode`

```java
public class GameModeType implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,GameModeType>` | `CODEC` |
| `private static` | `AssetStore<String,GameModeType,DefaultAssetMap<String,GameModeType>>` | `ASSET_STORE` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `private` | `String[]` | `permissionGroups` |
| `private` | `String` | `interactionsOnEnter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `AssetStore<String,GameModeType,DefaultAssetMap<String,GameModeType>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String,GameModeType>` | `getAssetMap()` |
| `@Nonnull public static` | `GameModeType` | `fromGameMode(GameMode gameMode)` |
| `@Nullable public` | `String` | `getInteractionsOnEnter()` |
| `@Nonnull public` | `String[]` | `getPermissionGroups()` |
| `public` | `String` | `getId()` |
