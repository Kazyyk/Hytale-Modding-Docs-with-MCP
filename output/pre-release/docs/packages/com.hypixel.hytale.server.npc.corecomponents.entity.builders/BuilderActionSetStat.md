---
title: "BuilderActionSetStat"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderActionSetStat"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "corecomponents"
  - "entity"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.builders`

```java
public class BuilderActionSetStat extends BuilderActionBase
```

NPC action builder: Sets (or adds to) an entity stat on the NPC..

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionSetStat` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `ActionSetStat(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public int` | `getStat(@Nonnull BuilderSupport support)` |
| `` | `public float` | `getValue(@Nonnull BuilderSupport support)` |
| `` | `public boolean` | `isAdd(@Nonnull BuilderSupport support)` |
