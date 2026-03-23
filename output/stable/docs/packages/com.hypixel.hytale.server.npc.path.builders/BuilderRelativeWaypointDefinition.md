---
title: "BuilderRelativeWaypointDefinition"
kind: "class"
package: "com.hypixel.hytale.server.npc.path.builders"
fqcn: "com.hypixel.hytale.server.npc.path.builders.BuilderRelativeWaypointDefinition"
api_surface: false
extends: "BuilderBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "path"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.path.builders`

```java
public class BuilderRelativeWaypointDefinition extends BuilderBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `rotation` |
| `protected` | `double` | `distance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `RelativeWaypointDefinition` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `Class<RelativeWaypointDefinition>` | `category()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull @Override public` | `Builder<RelativeWaypointDefinition>` | `readConfig(JsonElement data)` |
| `@Override public final` | `boolean` | `isEnabled(ExecutionContext context)` |
| `public` | `float` | `getRotation()` |
| `public` | `double` | `getDistance()` |
