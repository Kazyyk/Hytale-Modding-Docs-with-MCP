---
title: "BuilderActionCompleteTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders.BuilderActionCompleteTask"
api_surface: false
extends: "BuilderActionPlayAnimation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "npc"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders`

```java
public class BuilderActionCompleteTask extends BuilderActionPlayAnimation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `BooleanHolder` | `playAnimation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `ActionCompleteTask` | `build(BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionCompleteTask` | `readConfig(JsonElement data)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `boolean` | `isPlayAnimation(BuilderSupport support)` |
