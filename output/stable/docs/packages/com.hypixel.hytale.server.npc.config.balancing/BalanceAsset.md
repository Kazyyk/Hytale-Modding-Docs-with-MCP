---
title: "BalanceAsset"
kind: "class"
package: "com.hypixel.hytale.server.npc.config.balancing"
fqcn: "com.hypixel.hytale.server.npc.config.balancing.BalanceAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "config"
  - "balancing"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.config.balancing`

```java
public class BalanceAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<BalanceAsset>` | `ABSTRACT_CODEC` |
| `public static final` | `BuilderCodec<BalanceAsset>` | `BASE_CODEC` |
| `public static final` | `AssetCodecMapCodec<String,BalanceAsset>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>>` | `ASSET_STORE` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `String` | `entityEffect` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String,BalanceAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getEntityEffect()` |
| `@Nonnull @Override public` | `String` | `toString()` |
