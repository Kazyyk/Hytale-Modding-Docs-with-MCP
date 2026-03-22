---
title: "SoundEventPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.soundevent"
fqcn: "com.hypixel.hytale.server.core.asset.type.soundevent.SoundEventPacketGenerator"
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
  - "soundevent"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.soundevent`

```java
public class SoundEventPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Map<String,SoundEvent> assets)` |
| `@Nonnull public` | `ToClientPacket` | `generateUpdatePacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Map<String,SoundEvent> loadedAssets)` |
| `@Nonnull public` | `ToClientPacket` | `generateRemovePacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Set<String> removed)` |
