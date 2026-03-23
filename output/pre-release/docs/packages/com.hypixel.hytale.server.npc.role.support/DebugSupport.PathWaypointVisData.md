---
title: "DebugSupport.PathWaypointVisData"
kind: "record"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.DebugSupport.PathWaypointVisData"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:28:03Z"
tags:
  - "server"
  - "npc"
  - "debug"
  - "record"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public record PathWaypointVisData(Vector3d position, boolean isCurrentTarget, boolean isEndNode, boolean isSeekTarget)
```

Inner record of `DebugSupport`. Stores visualization data for a single waypoint along an NPC's path, including its position and flags indicating whether it is the current navigation target, the end node, or a seek target.

## Components

| Type | Name |
|---|---|
| `Vector3d` | `position` |
| `boolean` | `isCurrentTarget` |
| `boolean` | `isEndNode` |
| `boolean` | `isSeekTarget` |
