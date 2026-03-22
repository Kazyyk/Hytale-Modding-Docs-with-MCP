---
title: "AbstractAsyncCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.AbstractAsyncCommand"
api_surface: true
extends: "AbstractCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system.basecommands`

```java
public abstract class AbstractAsyncCommand extends AbstractCommand
```

Abstract base class extending `AbstractCommand` that provides shared logic for AsyncCommand subclasses.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_MODULES_COMMAND_RUNTIME_ERROR` | `Message.translation("server.modules.command.runtimeError").color(Color.RED)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractAsyncCommand(@Nonnull String name, @Nonnull String description)` |
| `public` | | `AbstractAsyncCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)` |
| `public` | | `AbstractAsyncCommand(@Nonnull String description)` |
| `@Override protected final` | `CompletableFuture<Void>` | `execute(@Nonnull CommandContext context)` |
| `@Nonnull protected abstract` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext var1)` |
| `@Nonnull public` | `CompletableFuture<Void>` | `runAsync(@Nonnull CommandContext context, @Nonnull Runnable runnable, @Nonnull Executor executor)` |
