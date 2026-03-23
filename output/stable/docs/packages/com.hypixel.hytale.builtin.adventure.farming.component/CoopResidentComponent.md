---
title: "CoopResidentComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.component"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.component.CoopResidentComponent"
api_surface: false
extends: ~
implements: ['Component']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "farming"
  - "component"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.component`

```java
public class CoopResidentComponent implements Component<EntityStore>
```

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, CoopResidentComponent>` | Accessor method. |
| `setCoopLocation(Vector3i coopLocation)` | `void` | Mutator method. |
| `getCoopLocation()` | `Vector3i` | Accessor method. |
| `setMarkedForDespawn(boolean markedForDespawn)` | `void` | Mutator method. |
| `getMarkedForDespawn()` | `boolean` | Accessor method. |
