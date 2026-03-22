---
title: "BuilderTransientPathDefinition"
kind: "class"
package: "com.hypixel.hytale.server.npc.path.builders"
fqcn: "com.hypixel.hytale.server.npc.path.builders.BuilderTransientPathDefinition"
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
public class BuilderTransientPathDefinition extends BuilderBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `BuilderObjectListHelper<RelativeWaypointDefinition>` | `waypoints` |
| `protected final` | `DoubleHolder` | `scale` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `TransientPathDefinition` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `Class<TransientPathDefinition>` | `category()` |
| `@Override public final` | `boolean` | `isEnabled(ExecutionContext context)` |
| `@Nonnull @Override public` | `Builder<TransientPathDefinition>` | `readConfig(JsonElement data)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Override public` | `boolean` | `validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)` |
| `@Nullable public` | `List<RelativeWaypointDefinition>` | `getWaypoints(BuilderSupport support)` |
| `public` | `double` | `getScale(BuilderSupport support)` |
