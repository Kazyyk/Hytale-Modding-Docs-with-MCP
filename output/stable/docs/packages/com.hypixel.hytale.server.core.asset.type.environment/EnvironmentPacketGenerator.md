---
title: "EnvironmentPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.environment"
fqcn: "com.hypixel.hytale.server.core.asset.type.environment.EnvironmentPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "environment"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.environment`

```java
public class EnvironmentPacketGenerator extends AssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,Environment> assetMap, Map<String,Environment> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,Environment> assetMap, Map<String,Environment> loadedAssets, AssetUpdateQuery query)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,Environment> assetMap, Set<String> removed, AssetUpdateQuery query)` |
