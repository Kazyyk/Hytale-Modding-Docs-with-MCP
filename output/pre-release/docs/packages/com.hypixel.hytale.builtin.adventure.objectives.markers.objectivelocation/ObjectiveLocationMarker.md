---
title: "ObjectiveLocationMarker"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation.ObjectiveLocationMarker"
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
public class ObjectiveLocationMarker
```

ECS component (`Component<EntityStore>`) representing an objective location marker in the world. Stores the marker asset ID, active objective UUID, area bounds, environment index filter, and trigger conditions. Codec-serializable via `CODEC`. Updates area and trigger configuration from the associated `ObjectiveLocationMarkerAsset`.
