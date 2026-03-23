---
title: "BuilderSensorSelf"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderSensorSelf"
api_surface: false
extends: "BuilderSensorWithEntityFilters"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "corecomponents"
  - "entity"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.builders`

```java
public class BuilderSensorSelf extends BuilderSensorWithEntityFilters
```

Extends `BuilderSensorWithEntityFilters`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorSelf` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `SensorSelf(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
