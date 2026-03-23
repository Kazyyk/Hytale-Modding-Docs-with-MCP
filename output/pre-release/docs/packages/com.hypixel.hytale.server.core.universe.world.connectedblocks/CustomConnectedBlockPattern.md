---
title: "CustomConnectedBlockPattern"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.CustomConnectedBlockPattern"
api_surface: false
extends: "CustomTemplateConnectedBlockPattern"
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
public class CustomConnectedBlockPattern extends CustomTemplateConnectedBlockPattern
```

Custom implementation of a connected block pattern with user-defined face matching logic.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<CustomConnectedBlockPattern>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Optional<ConnectedBlocksUtil.ConnectedBlockResult>` | `getConnectedBlockTypeKey(String shapeName, @Nonnull World world, @Nonnull Vector3i coordinate, @Nonnull CustomTemplateConnectedBlockRuleSet connectedBlockRuleset, @Nonnull BlockType blockType, int rotation, @Nonnull Vector3i placementNormal, boolean isPlacement)` |
