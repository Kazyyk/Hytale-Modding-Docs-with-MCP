---
title: "FieldcraftCategoryPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.FieldcraftCategoryPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator<String, FieldcraftCategory>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item`

```java
public class FieldcraftCategoryPacketGenerator extends DefaultAssetPacketGenerator<String, FieldcraftCategory>
```

Concrete implementation extending `DefaultAssetPacketGenerator<String, FieldcraftCategory>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(@Nonnull DefaultAssetMap<String, FieldcraftCategory> assetMap, @Nonnull Map<String, FieldcraftCategory> assets)` | `ToClientPacket` | public method. |
| `generateUpdatePacket(@Nonnull Map<String, FieldcraftCategory> assets)` | `ToClientPacket` | public method. |
| `generateRemovePacket(Set<String> removed)` | `ToClientPacket` | public method. |
