---
title: "WeatherPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.weather"
fqcn: "com.hypixel.hytale.server.core.asset.type.weather.WeatherPacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "weather"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.weather`

```java
public class WeatherPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Map<String,Weather> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Map<String,Weather> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Set<String> removed)` |
