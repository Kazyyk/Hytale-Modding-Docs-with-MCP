---
title: "SensorHasInteracted"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.SensorHasInteracted"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.interaction`

```java
public class SensorHasInteracted extends SensorBase
```

Concrete implementation extending `SensorBase`.

## Constructors

| Constructor | Description |
|---|---|
| `SensorHasInteracted(@Nonnull BuilderSensorBase builderSensorBase)` | Creates a new SensorHasInteracted instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
| `getSensorInfo()` | `InfoProvider` | public method. |
