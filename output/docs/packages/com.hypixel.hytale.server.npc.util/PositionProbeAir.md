---
title: "PositionProbeAir"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.PositionProbeAir"
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
public class PositionProbeAir extends PositionProbeBase
```

A position probe for NPCs operating in air. Extends `PositionProbeBase` to additionally detect whether the NPC is airborne and whether it is standing on a solid surface.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `probePosition( Ref<EntityStore> ref, Box boundingBox, Vector3d position, CollisionResult collisionResult, ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `boolean` | `isInAir()` |
| `public` | `boolean` | `isOnSolid()` |
| `public` | `String` | `toString()` |
