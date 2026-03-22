---
title: "BuilderMotionBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderMotionBase"
api_surface: false
extends: "Motion> extends BuilderBase<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.builders`

```java
public abstract class BuilderMotionBase<T extends Motion> extends BuilderBase<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canRequireFeature()` |
| `@Override public` | `Builder<T>` | `readCommonConfig(JsonElement data)` |
| `@Override public final` | `boolean` | `isEnabled(ExecutionContext context)` |
| `@Override public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
