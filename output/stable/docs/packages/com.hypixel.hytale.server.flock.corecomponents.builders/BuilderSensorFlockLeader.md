---
title: "BuilderSensorFlockLeader"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderSensorFlockLeader"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents.builders`

```java
public class BuilderSensorFlockLeader extends BuilderSensorBase
```

NPC behavior sensor builder for SensorFlockLeader functionality.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SensorFlockLeader` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<Sensor>` | `readConfig(JsonElement data)` |
