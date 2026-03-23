---
title: "BuilderActionSpawnParticles"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders.BuilderActionSpawnParticles"
api_surface: false
extends: "BuilderActionBase"
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
public class BuilderActionSpawnParticles extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `AssetHolder` | `particleSystem` |
| `protected final` | `DoubleHolder` | `range` |
| `protected final` | `NumberArrayHolder` | `offset` |
| `protected final` | `StringHolder` | `targetNodeName` |
| `protected final` | `BooleanHolder` | `isDetachedFromModel` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionSpawnParticles` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionSpawnParticles` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `String` | `getParticleSystem(@Nonnull BuilderSupport support)` |
| `public` | `double` | `getRange(BuilderSupport support)` |
| `public` | `Vector3d` | `getOffset(BuilderSupport support)` |
| `public` | `String` | `getTargetNodeName(BuilderSupport support)` |
| `public` | `boolean` | `isDetachedFromModel(BuilderSupport support)` |
