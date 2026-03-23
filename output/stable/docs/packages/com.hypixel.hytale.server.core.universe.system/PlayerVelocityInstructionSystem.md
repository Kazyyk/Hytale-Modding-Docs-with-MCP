---
title: "PlayerVelocityInstructionSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.system"
fqcn: "com.hypixel.hytale.server.core.universe.system.PlayerVelocityInstructionSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "universe"
---

**Package:** `com.hypixel.hytale.server.core.universe.system`

```java
public class PlayerVelocityInstructionSystem extends EntityTickingSystem<EntityStore>
```

ECS system extending `EntityTickingSystem<EntityStore>`. Processes entities each tick.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getDependencies()` | `Set<Dependency<EntityStore>>` | public method. |
| `getQuery()` | `Query<EntityStore>` | public method. |
