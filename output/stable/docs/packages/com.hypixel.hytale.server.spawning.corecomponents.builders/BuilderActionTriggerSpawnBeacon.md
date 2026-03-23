---
title: "BuilderActionTriggerSpawnBeacon"
kind: "class"
package: "com.hypixel.hytale.server.spawning.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.spawning.corecomponents.builders.BuilderActionTriggerSpawnBeacon"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "corecomponents"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.corecomponents.builders`

```java
public class BuilderActionTriggerSpawnBeacon extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `AssetHolder` | `beaconId` |
| `protected final` | `IntHolder` | `range` |
| `protected` | `String` | `targetSlot` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Action` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionTriggerSpawnBeacon` | `readConfig(JsonElement data)` |
| `public` | `int` | `getBeaconId(BuilderSupport support)` |
| `public` | `int` | `getRange(BuilderSupport support)` |
| `public` | `int` | `getTargetSlot(BuilderSupport support)` |
