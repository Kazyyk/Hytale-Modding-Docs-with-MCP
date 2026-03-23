---
title: "BuilderActionSetMarkedTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderActionSetMarkedTarget"
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
public class BuilderActionSetMarkedTarget extends BuilderActionBase
```

NPC action builder: Explicitly sets a marked target in a given slot..

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `ActionSetMarkedTarget(this, builderSupport)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public int` | `getTargetSlot(@Nonnull BuilderSupport support)` |
