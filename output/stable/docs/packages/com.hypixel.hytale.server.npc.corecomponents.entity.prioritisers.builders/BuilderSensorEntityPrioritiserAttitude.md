---
title: "BuilderSensorEntityPrioritiserAttitude"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.builders.BuilderSensorEntityPrioritiserAttitude"
api_surface: false
extends: "BuilderSensorEntityPrioritiserBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "entity"
  - "prioritisers"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.builders`

```java
public class BuilderSensorEntityPrioritiserAttitude extends BuilderSensorEntityPrioritiserBase
```

Utility type in the `builders` subsystem.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getShortDescription()` | `String` | Accessor method. |
| `getLongDescription()` | `String` | Accessor method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | Accessor method. |
| `getPrioritisedAttitudes(BuilderSupport support)` | `Attitude[]` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `build(BuilderSupport builderSupport)` | `SensorEntityPrioritiserAttitude` | Instance method. |
| `readConfig(JsonElement data)` | `BuilderSensorEntityPrioritiserAttitude` | Instance method. |
