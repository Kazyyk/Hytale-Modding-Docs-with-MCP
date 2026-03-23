---
title: "PositionProbeWater"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.PositionProbeWater"
api_surface: false
extends: "PositionProbeBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class PositionProbeWater extends PositionProbeBase
```

A position probe for NPCs operating in water. Extends `PositionProbeBase` with swim-depth-aware water detection.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `probePosition( Ref<EntityStore> ref, Box boundingBox, Vector3d position, CollisionResult collisionResult, double swimDepth, ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `String` | `toString()` |
