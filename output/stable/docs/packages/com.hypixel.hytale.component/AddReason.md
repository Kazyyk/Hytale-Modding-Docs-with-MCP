---
title: "AddReason"
kind: "enum"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.AddReason"
api_surface: true
extends: "java.lang.Enum"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public enum AddReason
```

Indicates why an entity is being added to a [Store](Store.md). Passed to `RefSystem.onEntityAdded()` and `HolderSystem.onEntityAdd()` so systems can distinguish between newly created entities and entities restored from storage.

## Enum Constants

| Constant | Description |
|---|---|
| `SPAWN` | The entity is newly created at runtime (e.g., NPC spawn, player join). |
| `LOAD` | The entity is being restored from persistent storage (e.g., chunk load, stored flock restore). |

## Related Types

- [RemoveReason](RemoveReason.md) -- the corresponding enum for entity removal
- [Store](Store.md) -- `addEntity()` accepts an `AddReason`
- [CommandBuffer](CommandBuffer.md) -- `addEntity()` accepts an `AddReason`
