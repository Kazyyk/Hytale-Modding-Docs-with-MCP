---
title: "BuilderSensorEntityPrioritiserBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderSensorEntityPrioritiserBase"
api_surface: false
extends: "BuilderBase<ISensorEntityPrioritiser>"
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
public abstract class BuilderSensorEntityPrioritiserBase extends BuilderBase<ISensorEntityPrioritiser>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Set<String>` | `providedFilterTypes` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `BuilderSensorEntityPrioritiserBase(Set<String> providedFilterTypes)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Class<ISensorEntityPrioritiser>` | `category()` |
| `@Override public` | `boolean` | `isEnabled(ExecutionContext context)` |
| `@Override public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
| `protected` | `Set<String>` | `getProvidedFilterTypes()` |
