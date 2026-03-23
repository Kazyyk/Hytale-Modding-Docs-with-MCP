---
title: "AbstractPlayerCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand"
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
public abstract class AbstractPlayerCommand extends AbstractAsyncCommand
```

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for PlayerCommand subclasses.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD` | `Message.translation("server.commands.errors.playerNotInWorld")` |
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG` | `Message.translation("server.commands.errors.playerOrArg").param("option", "player")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractPlayerCommand(@Nonnull String name, @Nonnull String description)` |
| `public` | | `AbstractPlayerCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)` |
| `public` | | `AbstractPlayerCommand(@Nonnull String description)` |
| `@Nonnull @Override protected final` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `protected abstract` | `void` | `execute(@Nonnull CommandContext var1, @Nonnull Store<EntityStore> var2, @Nonnull Ref<EntityStore> var3, @Nonnull PlayerRef var4, @Nonnull World var5)` |
