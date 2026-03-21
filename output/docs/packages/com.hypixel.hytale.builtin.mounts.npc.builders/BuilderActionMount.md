---
title: "BuilderActionMount"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.npc.builders"
fqcn: "com.hypixel.hytale.builtin.mounts.npc.builders.BuilderActionMount"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "mounts"
  - "npc"
  - "builders"
---

**Package:** `com.hypixel.hytale.builtin.mounts.npc.builders`

```java
public class BuilderActionMount extends BuilderActionBase
```

Utility type in the `builders` subsystem.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getShortDescription()` | `String` | Accessor method. |
| `getLongDescription()` | `String` | Accessor method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | Accessor method. |
| `getAnchorX(BuilderSupport support)` | `float` | Accessor method. |
| `getAnchorY(BuilderSupport support)` | `float` | Accessor method. |
| `getAnchorZ(BuilderSupport support)` | `float` | Accessor method. |
| `getMovementConfig(BuilderSupport support)` | `String` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `build(BuilderSupport builderSupport)` | `ActionMount` | Instance method. |
| `readConfig(JsonElement data)` | `Builder<Action>` | Instance method. |
