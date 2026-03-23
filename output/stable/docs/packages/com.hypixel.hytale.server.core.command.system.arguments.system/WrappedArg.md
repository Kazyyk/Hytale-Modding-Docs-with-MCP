---
title: "WrappedArg"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.WrappedArg"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
  - "arguments"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.system`

```java
public abstract class WrappedArg<BasicType>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final Argument<?,` | `BasicType>` | `arg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `provided(@Nonnull CommandContext context)` |
| `@Nonnull public` | `String` | `getName()` |
| `@Nonnull public` | `String` | `getDescription()` |
| `@Nonnull public` | `Argument<?, BasicType>` | `getArg()` |
| `protected` | `BasicType` | `get(@Nonnull CommandContext context)` |
