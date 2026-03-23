---
title: "BuilderSensorEntity"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderSensorEntity"
api_surface: false
extends: "BuilderSensorEntityBase"
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
public class BuilderSensorEntity extends BuilderSensorEntityBase
```

NPC sensor builder: Test if entity matching specific attributes and filters is in range.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorEntity` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `SensorEntity(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `` | `public boolean` | `isGetPlayers(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `isGetNPCs(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `isExcludeOwnType(@Nonnull BuilderSupport support)` |
