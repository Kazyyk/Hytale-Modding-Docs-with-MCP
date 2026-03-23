---
title: "SensorBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.SensorBase"
api_surface: false
extends: "AnnotatedComponentBase"
implements: ["Sensor"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public abstract class SensorBase extends AnnotatedComponentBase implements Sensor
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `boolean` | `once` |
| `protected` | `boolean` | `triggered` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorBase(@Nonnull BuilderSensorBase builderSensorBase)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `clearOnce()` |
| `@Override public` | `void` | `setOnce()` |
| `@Override public` | `boolean` | `isTriggered()` |
| `@Override public` | `boolean` | `processDelay(float dt)` |
