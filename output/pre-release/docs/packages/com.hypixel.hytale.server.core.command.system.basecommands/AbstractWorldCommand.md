---
title: "AbstractWorldCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.AbstractWorldCommand"
api_surface: false
extends: "AbstractAsyncCommand"
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
public abstract class AbstractWorldCommand extends AbstractAsyncCommand
```

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for WorldCommand subclasses.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_NO_WORLD` | `Message.translation("server.commands.errors.noWorld")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `OptionalArg<World>` | `worldArg` | `this.withOptionalArg("world", "server.commands.worldthread.arg.desc", ArgTypes.WORLD)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractWorldCommand(@Nonnull String name, @Nonnull String description)` |
| `public` | | `AbstractWorldCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)` |
| `public` | | `AbstractWorldCommand(@Nonnull String description)` |
| `@Nonnull @Override protected final` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `protected abstract` | `void` | `execute(@Nonnull CommandContext var1, @Nonnull World var2, @Nonnull Store<EntityStore> var3)` |
