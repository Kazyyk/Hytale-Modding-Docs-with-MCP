---
title: "BuilderSensorAnimation"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders.BuilderSensorAnimation"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "audiovisual"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders`

```java
public class BuilderSensorAnimation extends BuilderSensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `EnumHolder<NPCAnimationSlot>` | `animationSlot` |
| `protected final` | `StringHolder` | `animationId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Sensor` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `NPCAnimationSlot` | `getAnimationSlot(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getAnimationId(@Nonnull BuilderSupport support)` |
