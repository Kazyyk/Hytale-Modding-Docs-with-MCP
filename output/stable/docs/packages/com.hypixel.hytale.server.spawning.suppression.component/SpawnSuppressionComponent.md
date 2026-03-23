---
title: "SpawnSuppressionComponent"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression.component"
fqcn: "com.hypixel.hytale.server.spawning.suppression.component.SpawnSuppressionComponent"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "spawning"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.spawning.suppression.component`

```java
public class SpawnSuppressionComponent implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `spawnSuppression` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `SpawnSuppressionComponent(String spawnSuppression)` | Creates a new SpawnSuppressionComponent instance. |
| `SpawnSuppressionComponent()` | Creates a new SpawnSuppressionComponent instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, SpawnSuppressionComponent>` | static public method. |
| `getSpawnSuppression()` | `String` | public method. |
| `setSpawnSuppression(String spawnSuppression)` | `void` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
