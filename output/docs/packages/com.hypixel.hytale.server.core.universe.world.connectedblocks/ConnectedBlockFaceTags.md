---
title: "ConnectedBlockFaceTags"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.ConnectedBlockFaceTags"
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
public class ConnectedBlockFaceTags
```

Tag constants and utility methods for evaluating connected block face matching rules.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<ConnectedBlockFaceTags>` | `CODEC` |
| `ConnectedBlockFaceTags` | `EMPTY` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `contains(Vector3i direction, String blockFaceTag)` |
| `public` | `Set<String>` | `getBlockFaceTags(Vector3i direction)` |
| `public` | `Set<Vector3i>` | `getDirections()` |
