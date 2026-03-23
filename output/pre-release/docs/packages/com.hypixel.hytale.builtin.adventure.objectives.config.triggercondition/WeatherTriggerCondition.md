---
title: "WeatherTriggerCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition.WeatherTriggerCondition"
api_surface: false
extends: "ObjectiveLocationTriggerCondition"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "triggercondition"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition`

```java
public class WeatherTriggerCondition extends ObjectiveLocationTriggerCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<WeatherTriggerCondition>` | `CODEC` |
| `protected static final` | `ResourceType<EntityStore,WeatherResource>` | `WEATHER_RESOURCE_RESOURCE_TYPE` |
| `protected static final` | `ComponentType<EntityStore,TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `protected` | `String[]` | `weatherIds` |
| `protected` | `int[]` | `weatherIndexes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `isConditionMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, ObjectiveLocationMarker objectiveLocationMarker)` |
| `@Nonnull @Override public` | `String` | `toString()` |
