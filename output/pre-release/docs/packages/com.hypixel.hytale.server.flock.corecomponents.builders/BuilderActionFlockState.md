---
title: "BuilderActionFlockState"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderActionFlockState"
api_surface: false
extends: "BuilderActionBase"
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
public class BuilderActionFlockState extends BuilderActionBase
```

NPC behavior action builder for ActionFlockState functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `StringHolder` | `state` | `new StringHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionFlockState` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionFlockState` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `String` | `getState(@Nonnull BuilderSupport support)` |
