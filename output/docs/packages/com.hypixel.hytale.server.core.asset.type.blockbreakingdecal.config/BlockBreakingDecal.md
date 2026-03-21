---
title: "BlockBreakingDecal"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blockbreakingdecal.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blockbreakingdecal.config.BlockBreakingDecal"
api_surface: false
extends: null
implements: ["JsonAssetWithMap", "NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "blockbreakingdecal"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blockbreakingdecal.config`

```java
public class BlockBreakingDecal implements JsonAssetWithMap, NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String[]` | `DEFAULT_STAGE_TEXTURE_LIST` |
| `public static final` | `AssetCodec<String,BlockBreakingDecal>` | `CODEC` |
| `private static` | `AssetStore<String,BlockBreakingDecal,DefaultAssetMap<String,BlockBreakingDecal>>` | `ASSET_STORE` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `String[]` | `stageTextures` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,BlockBreakingDecal,DefaultAssetMap<String,BlockBreakingDecal>>` | `getAssetStore()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.BlockBreakingDecal` | `toPacket()` |
| `public` | `String` | `getId()` |
| `@Nonnull @Override public` | `String` | `toString()` |
