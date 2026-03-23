---
title: "HourRangeTriggerCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition.HourRangeTriggerCondition"
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
public class HourRangeTriggerCondition extends ObjectiveLocationTriggerCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<HourRangeTriggerCondition>` | `CODEC` |
| `protected static final` | `ResourceType<EntityStore,WorldTimeResource>` | `WORLD_TIME_RESOURCE_RESOURCE_TYPE` |
| `protected` | `int` | `minHour` |
| `protected` | `int` | `maxHour` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `isConditionMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, ObjectiveLocationMarker objectiveLocationMarker)` |
| `@Nonnull @Override public` | `String` | `toString()` |
