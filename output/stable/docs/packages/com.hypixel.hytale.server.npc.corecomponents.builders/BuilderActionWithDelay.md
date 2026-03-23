---
title: "BuilderActionWithDelay"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.builders.BuilderActionWithDelay"
api_surface: false
extends: "BuilderActionBase"
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
public abstract class BuilderActionWithDelay extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `NumberArrayHolder` | `delayRange` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Builder<Action>` | `readCommonConfig(@Nonnull JsonElement data)` |
| `public` | `double[]` | `getDelayRange(@Nonnull BuilderSupport support)` |
| `protected` | `double[]` | `getDefaultTimeoutRange()` |
