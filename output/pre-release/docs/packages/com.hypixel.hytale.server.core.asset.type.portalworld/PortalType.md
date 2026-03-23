---
title: "PortalType"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.portalworld"
fqcn: "com.hypixel.hytale.server.core.asset.type.portalworld.PortalType"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, PortalType>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.portalworld`

```java
public class PortalType implements JsonAssetWithMap<String, DefaultAssetMap<String, PortalType>>
```

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, PortalType>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_STORE` | `AssetStore<String, PortalType, DefaultAssetMap<String, PortalType>>` | Static AssetStore<String, PortalType, DefaultAssetMap<String, PortalType>> field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |
| `instanceId` | `String` | String field. |
| `description` | `PortalDescription` | PortalDescription field. |
| `gameplayConfig` | `String` | String field. |
| `voidInvasionEnabled` | `boolean` | boolean field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetStore()` | `AssetStore<String, PortalType, DefaultAssetMap<String, PortalType>>` | static public method. |
| `getAssetMap()` | `DefaultAssetMap<String, PortalType>` | static public method. |
| `getId()` | `String` | public method. |
| `getInstanceId()` | `String` | public method. |
| `getDisplayName()` | `Message` | public method. |
| `getDescription()` | `PortalDescription` | public method. |
| `getCursedItems()` | `Set<String>` | public method. |
| `getGameplayConfigId()` | `String` | public method. |
| `isVoidInvasionEnabled()` | `boolean` | public method. |
| `getGameplayConfig()` | `GameplayConfig` | public method. |
