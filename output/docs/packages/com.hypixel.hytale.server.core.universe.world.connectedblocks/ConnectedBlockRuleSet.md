---
title: "ConnectedBlockRuleSet"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.ConnectedBlockRuleSet"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "universe"
  - "world"
  - "connectedblocks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.connectedblocks`

```java
public abstract class ConnectedBlockRuleSet
```

Holds a set of rules that determine connected block model variants based on neighboring block faces.

## Constants

| Type | Name |
|---|---|
| `CodecMapCodec<ConnectedBlockRuleSet>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `boolean` | `onlyUpdateOnPlacement()` |
| `public abstract` | `Optional<ConnectedBlocksUtil.ConnectedBlockResult>` | `getConnectedBlockType(World var1, Vector3i var2, BlockType var3, int var4, Vector3i var5, boolean var6)` |
| `public` | `void` | `updateCachedBlockTypes(BlockType blockType, BlockTypeAssetMap<String, BlockType> assetMap)` |
| `public` | `com.hypixel.hytale.protocol.ConnectedBlockRuleSet` | `toPacket(BlockTypeAssetMap<String, BlockType> assetMap)` |
