---
title: "ActionWithDelay"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.ActionWithDelay"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public abstract class ActionWithDelay extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double[]` | `delayRange` |
| `private` | `double` | `delay` |
| `private` | `boolean` | `isDelaying` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionWithDelay(@Nonnull BuilderActionWithDelay builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `processDelay(float dt)` |
| `protected` | `boolean` | `isDelaying()` |
| `protected` | `boolean` | `isDelayPrepared()` |
| `protected` | `void` | `prepareDelay()` |
| `protected` | `void` | `clearDelay()` |
| `protected` | `void` | `startDelay(@Nonnull EntitySupport support)` |
