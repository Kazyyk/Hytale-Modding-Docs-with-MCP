---
title: "EntityEffectPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.entityeffect"
fqcn: "com.hypixel.hytale.server.core.asset.type.entityeffect.EntityEffectPacketGenerator"
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
  - "entityeffect"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.entityeffect`

```java
public class EntityEffectPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Map<String,EntityEffect> assets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Map<String,EntityEffect> loadedAssets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Set<String> removed)` |
