---
title: "ConnectedBlockPatternRule"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.ConnectedBlockPatternRule"
api_surface: false
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
public class ConnectedBlockPatternRule
```

Defines a single pattern matching rule for connected block faces.

## Enum Constants

- `Up`
- `Down`
- `North`
- `East`
- `South`
- `West`

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<ConnectedBlockPatternRule>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3i` | `getRelativePosition()` |
| `public` | `HashSet<String>` | `getBlockTypes()` |
| `public` | `Set<BlockPattern.BlockEntry>` | `getShapeBlockTypeKeys()` |
| `public` | `ConnectedBlockFaceTags` | `getFaceTags()` |
| `public` | `BlockTypeListAsset[]` | `getBlockTypeListAssets()` |
| `public` | `ConnectedBlockPatternRule.AdjacentSide[]` | `getPlacementNormals()` |
| `public` | `boolean` | `isInclude()` |
