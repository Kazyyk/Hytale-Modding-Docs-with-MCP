---
title: "CustomTemplateConnectedBlockRuleSet"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.CustomTemplateConnectedBlockRuleSet"
api_surface: false
extends: "ConnectedBlockRuleSet"
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
public class CustomTemplateConnectedBlockRuleSet extends ConnectedBlockRuleSet
```

Rule set that delegates to a CustomConnectedBlockTemplateAsset for connected block evaluation.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<CustomTemplateConnectedBlockRuleSet>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Map<String, BlockPattern>` | `getShapeNameToBlockPatternMap()` |
| `public` | `void` | `updateCachedBlockTypes(BlockType blockType, BlockTypeAssetMap<String, BlockType> assetMap)` |
| `public` | `Set<String>` | `getShapesForBlockType(int blockTypeKey)` |
| `public` | `CustomConnectedBlockTemplateAsset` | `getShapeTemplateAsset()` |
| `public` | `boolean` | `onlyUpdateOnPlacement()` |
| `public` | `Optional<ConnectedBlocksUtil.ConnectedBlockResult>` | `getConnectedBlockType(World world, Vector3i testedCoordinate, BlockType blockType, int rotation, Vector3i placementNormal, boolean isPlacement)` |
