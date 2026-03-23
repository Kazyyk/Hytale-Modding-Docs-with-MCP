---
title: "SensorFlockCombatDamage"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.SensorFlockCombatDamage"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents`

```java
public class SensorFlockCombatDamage extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `boolean` | `leaderOnly` |
| `protected final` | `EntityPositionProvider` | `positionProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `InfoProvider` | `getSensorInfo()` |
