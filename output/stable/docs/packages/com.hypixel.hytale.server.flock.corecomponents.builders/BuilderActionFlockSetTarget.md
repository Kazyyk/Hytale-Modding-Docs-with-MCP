---
title: "BuilderActionFlockSetTarget"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderActionFlockSetTarget"
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
public class BuilderActionFlockSetTarget extends BuilderActionBase
```

NPC behavior action builder for ActionFlockSetTarget functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `boolean` | `clear` |  |
| `protected final` | `StringHolder` | `targetSlot` | `new StringHolder()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionFlockSetTarget` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionFlockSetTarget` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `boolean` | `isClear()` |
| `public` | `String` | `getTargetSlot(@Nonnull BuilderSupport support)` |
