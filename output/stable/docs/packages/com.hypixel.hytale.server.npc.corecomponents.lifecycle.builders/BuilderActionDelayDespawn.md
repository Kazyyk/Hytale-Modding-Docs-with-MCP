---
title: "BuilderActionDelayDespawn"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders.BuilderActionDelayDespawn"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders`

```java
public class BuilderActionDelayDespawn extends BuilderActionBase
```

NPC behavior action builder for ActionDelayDespawn functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `time` |
| `protected` | `boolean` | `shorten` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `ActionDelayDespawn` | `build(BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionDelayDespawn` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `float` | `getTime()` |
| `public` | `boolean` | `getShorten()` |
