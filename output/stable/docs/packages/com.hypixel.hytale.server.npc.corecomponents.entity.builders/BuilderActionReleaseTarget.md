---
title: "BuilderActionReleaseTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderActionReleaseTarget"
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
public class BuilderActionReleaseTarget extends BuilderActionBase
```

NPC action builder: Clear locked target.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionReleaseTarget` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `ActionReleaseTarget(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public int` | `getTargetSlot(@Nonnull BuilderSupport support)` |
