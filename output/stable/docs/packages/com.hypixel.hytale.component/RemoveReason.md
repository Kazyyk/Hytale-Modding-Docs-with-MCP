---
title: "RemoveReason"
kind: "enum"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.RemoveReason"
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
public enum RemoveReason
```

Indicates why an entity is being removed from a [Store](Store.md). Passed to `RefSystem.onEntityRemove()` and `HolderSystem.onEntityRemoved()` so systems can distinguish between permanent deletion and temporary unloading.

## Enum Constants

| Constant | Description |
|---|---|
| `REMOVE` | The entity is being permanently removed (e.g., death, despawn, explicit deletion). The entity's references are invalidated and it will not return. |
| `UNLOAD` | The entity is being temporarily unloaded (e.g., chunk unload). It may be restored later via `LOAD`. Systems should preserve state rather than clean up. |

## Related Types

- [AddReason](AddReason.md) -- the corresponding enum for entity addition
- [Store](Store.md) -- `removeEntity()` accepts a `RemoveReason`
- [CommandBuffer](CommandBuffer.md) -- `removeEntity()` and `tryRemoveEntity()` accept a `RemoveReason`
