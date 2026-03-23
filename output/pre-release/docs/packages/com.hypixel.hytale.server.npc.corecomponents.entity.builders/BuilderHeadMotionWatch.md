---
title: "BuilderHeadMotionWatch"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderHeadMotionWatch"
api_surface: false
extends: "BuilderHeadMotionBase"
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
public class BuilderHeadMotionWatch extends BuilderHeadMotionBase
```

NPC head motion builder: Rotate to target.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `HeadMotionWatch` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `HeadMotionWatch(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public double` | `getRelativeTurnSpeed(@Nonnull BuilderSupport support)` |
