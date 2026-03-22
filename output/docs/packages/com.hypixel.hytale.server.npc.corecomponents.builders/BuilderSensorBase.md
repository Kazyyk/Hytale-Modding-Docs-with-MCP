---
title: "BuilderSensorBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderSensorBase"
api_surface: false
extends: "BuilderBase<Sensor>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.builders`

```java
public abstract class BuilderSensorBase extends BuilderBase<Sensor>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `once` |
| `protected final` | `BooleanHolder` | `enabled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Builder<Sensor>` | `readCommonConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `Class<Sensor>` | `category()` |
| `public` | `boolean` | `getOnce()` |
| `public` | `void` | `setOnce(boolean once)` |
| `@Override public` | `boolean` | `isEnabled(ExecutionContext context)` |
| `@Override public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
