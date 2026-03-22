---
title: "ObjectiveLocationMarkerSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation.ObjectiveLocationMarkerSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "objectives"
  - "markers"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation`

```java
public class ObjectiveLocationMarkerSystems
```

Container for ECS systems that drive objective location markers. Contains `EnsureNetworkSendableSystem` (assigns network IDs), `InitSystem` (loads marker assets, restores active objectives, sets up model bounding box), and `TickingSystem` (spatial player detection, objective tracking/untracking, trigger condition evaluation).
