---
title: "BuilderActionFlockJoin"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderActionFlockJoin"
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
public class BuilderActionFlockJoin extends BuilderActionBase
```

NPC behavior action builder for ActionFlockJoin functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `forceJoin` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionFlockJoin` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionFlockJoin` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `boolean` | `isForceJoin()` |
