---
title: "BuilderEntityFilterWithToggle"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderEntityFilterWithToggle"
api_surface: false
extends: "BuilderBase<IEntityFilter>"
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
public abstract class BuilderEntityFilterWithToggle extends BuilderBase<IEntityFilter>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `BooleanHolder` | `enabled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Builder<IEntityFilter>` | `readCommonConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `Class<IEntityFilter>` | `category()` |
| `@Override public` | `boolean` | `isEnabled(ExecutionContext context)` |
