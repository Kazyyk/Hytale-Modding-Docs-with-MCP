---
title: "BuilderToolsPlugin.QueuedTask"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.QueuedTask"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "task-queue"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
private static final class QueuedTask
```

Private wrapper class for asynchronous builder tool operations queued for execution on the world thread. Each task holds a `ThrowableTriConsumer` that receives a player entity ref, the builder state, and a component accessor.

## Constructor

```java
private QueuedTask(
    @Nonnull ThrowableTriConsumer<Ref<EntityStore>, BuilderToolsPlugin.BuilderState, ComponentAccessor<EntityStore>, ? extends Throwable> biTask
)
```

## Methods

### execute

```java
void execute(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull BuilderToolsPlugin.BuilderState state,
    @Nonnull ComponentAccessor<EntityStore> defaultComponentAccessor
) throws Throwable
```

Executes the wrapped task by calling `task.acceptNow()` with the given arguments.

## Visibility

This class has `private` visibility and is only accessible within [BuilderToolsPlugin](BuilderToolsPlugin.md).

## Related Types

- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- creates and dequeues these tasks
- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- enclosing class
