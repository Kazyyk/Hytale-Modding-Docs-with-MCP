---
title: "BuilderToolsSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "ecs"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class BuilderToolsSystems
```

Container class for ECS systems related to builder tools. Contains the [EnsureBuilderTools](BuilderToolsSystems.EnsureBuilderTools.md) inner class, which is an `EntityStore` holder system that populates newly added player entities with builder tool items.

## Inner Types

- [EnsureBuilderTools](BuilderToolsSystems.EnsureBuilderTools.md) -- `HolderSystem<EntityStore>` that ensures builder tool items are in the player's tools inventory on entity add

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- registers `EnsureBuilderTools` as an entity store system during setup
- [BuilderToolsUserDataSystem](BuilderToolsUserDataSystem.md) -- companion system that ensures `BuilderToolsUserData` component
