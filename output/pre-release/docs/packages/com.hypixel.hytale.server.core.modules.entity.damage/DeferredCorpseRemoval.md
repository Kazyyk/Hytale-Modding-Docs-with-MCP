---
title: "DeferredCorpseRemoval"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeferredCorpseRemoval"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:51Z"
tags:
  - "damage"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DeferredCorpseRemoval implements Component<EntityStore>
```

Component that defers corpse removal by a configurable time. Attached to dead entities to keep the corpse visible for a duration. Optionally specifies a death particle effect ID to spawn when the corpse is finally removed.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DeferredCorpseRemoval(double timeUntilCorpseRemoval, String deathParticles)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, DeferredCorpseRemoval>` | `getComponentType()` |
| `public` | `void` | `tick(float dt)` |
| `public` | `boolean` | `shouldRemove()` |
| `public` | `String` | `getDeathParticles()` |
| `public` | `Component<EntityStore>` | `clone()` |

## Relationships

- Implements `Component<EntityStore>`
- Used by `DeathSystems.CorpseRemoval` and `DeathSystems.TickCorpseRemoval`
