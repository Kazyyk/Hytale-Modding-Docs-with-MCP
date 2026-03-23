---
title: "TagPatternPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.tagpattern"
fqcn: "com.hypixel.hytale.server.core.asset.type.tagpattern.TagPatternPacketGenerator"
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
  - "tagpattern"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.tagpattern`

```java
public class TagPatternPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Map<String,TagPattern> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Map<String,TagPattern> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Set<String> removed)` |
