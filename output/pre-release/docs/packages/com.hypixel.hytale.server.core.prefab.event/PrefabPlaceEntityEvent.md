---
title: "PrefabPlaceEntityEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.event"
fqcn: "com.hypixel.hytale.server.core.prefab.event.PrefabPlaceEntityEvent"
api_surface: false
extends: "EcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "core"
  - "prefab"
  - "event"
---

**Package:** `com.hypixel.hytale.server.core.prefab.event`

```java
public class PrefabPlaceEntityEvent extends EcsEvent
```

ECS event dispatched through the entity component system.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getPrefabId()` | `int` | Accessor method. |
| `getHolder()` | `Holder<EntityStore>` | Accessor method. |
