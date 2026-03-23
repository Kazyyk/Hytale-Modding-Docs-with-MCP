---
title: "BuilderActionBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderActionBase"
api_surface: false
extends: "BuilderBase<Action>"
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
public abstract class BuilderActionBase extends BuilderBase<Action>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `boolean` | `once` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canRequireFeature()` |
| `@Nonnull @Override public` | `Builder<Action>` | `readCommonConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public final` | `Class<Action>` | `category()` |
| `@Override public final` | `boolean` | `isEnabled(ExecutionContext context)` |
| `public` | `boolean` | `isOnce()` |
