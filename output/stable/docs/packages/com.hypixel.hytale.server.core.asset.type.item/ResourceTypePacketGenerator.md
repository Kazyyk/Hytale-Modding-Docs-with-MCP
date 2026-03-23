---
title: "ResourceTypePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.ResourceTypePacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator<String, ResourceType>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item`

```java
public class ResourceTypePacketGenerator extends DefaultAssetPacketGenerator<String, ResourceType>
```

Concrete implementation extending `DefaultAssetPacketGenerator<String, ResourceType>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(@Nonnull DefaultAssetMap<String, ResourceType> assetMap, @Nonnull Map<String, ResourceType> assets)` | `ToClientPacket` | public method. |
| `generateUpdatePacket(@Nonnull Map<String, ResourceType> loadedAssets)` | `ToClientPacket` | public method. |
| `generateRemovePacket(@Nonnull Set<String> removed)` | `ToClientPacket` | public method. |
