---
title: "PlayerRefAddedSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.system"
fqcn: "com.hypixel.hytale.server.core.universe.system.PlayerRefAddedSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "universe"
---

**Package:** `com.hypixel.hytale.server.core.universe.system`

```java
public class PlayerRefAddedSystem extends RefSystem<EntityStore>
```

ECS system extending `RefSystem<EntityStore>`. Processes entities each tick.

## Fields

| Field | Type | Description |
|---|---|---|
| `playerRefComponentType` | `ComponentType<EntityStore, PlayerRef>` | final ComponentType<EntityStore, PlayerRef> field. |

## Constructors

| Constructor | Description |
|---|---|
| `PlayerRefAddedSystem(@Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType)` | Creates a new PlayerRefAddedSystem instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getDependencies()` | `Set<Dependency<EntityStore>>` | public method. |
| `getQuery()` | `Query<EntityStore>` | public method. |
