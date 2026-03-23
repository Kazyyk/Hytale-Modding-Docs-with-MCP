---
title: "MovementStatesComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.movement"
fqcn: "com.hypixel.hytale.server.core.entity.movement.MovementStatesComponent"
api_surface: false
extends: null
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.entity.movement`

```java
public class MovementStatesComponent implements Component<EntityStore>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, MovementStatesComponent>` | `getComponentType()` |
| `public` | `` | `MovementStatesComponent()` |
| `public` | `` | `MovementStatesComponent(@Nonnull MovementStatesComponent other)` |
| `public` | `MovementStates` | `getMovementStates()` |
| `public` | `void` | `setMovementStates(MovementStates movementStates)` |
| `public` | `MovementStates` | `getSentMovementStates()` |
| `public` | `void` | `setSentMovementStates(MovementStates sentMovementStates)` |
| `public` | `Component<EntityStore>` | `clone()` |
