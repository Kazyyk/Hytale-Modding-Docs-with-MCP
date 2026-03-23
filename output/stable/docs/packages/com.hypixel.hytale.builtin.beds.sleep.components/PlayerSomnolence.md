---
title: "PlayerSomnolence"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.components"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.components.PlayerSomnolence"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "sleep"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.components`

```java
public class PlayerSomnolence implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `state` | `PlayerSleep` | PlayerSleep field. |

## Constructors

| Constructor | Description |
|---|---|
| `PlayerSomnolence()` | Creates a new PlayerSomnolence instance. |
| `PlayerSomnolence(@Nonnull PlayerSleep state)` | Creates a new PlayerSomnolence instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, PlayerSomnolence>` | static public method. |
| `getSleepState()` | `PlayerSleep` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
