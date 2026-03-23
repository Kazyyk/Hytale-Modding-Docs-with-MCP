---
title: "WaitCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.commandmacro"
fqcn: "com.hypixel.hytale.builtin.commandmacro.WaitCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "commandmacro"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.commandmacro`

```java
public class WaitCommand extends AbstractAsyncCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `long` | `MILLISECONDS_TO_SECONDS_MULTIPLIER` |
| `public static final` | `Runnable` | `EMPTY_RUNNABLE` |
| `private final` | `RequiredArg<Float>` | `timeArg` |
| `private final` | `FlagArg` | `printArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
