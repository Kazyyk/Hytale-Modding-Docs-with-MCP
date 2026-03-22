---
title: "AbstractTargetPlayerCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.AbstractTargetPlayerCommand"
api_surface: true
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
public abstract class AbstractTargetPlayerCommand extends AbstractAsyncCommand
```

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for TargetPlayerCommand subclasses.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD` | `Message.translation("server.commands.errors.playerNotInWorld")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `OptionalArg<PlayerRef>` | `playerArg` | `this.withOptionalArg("player", "server.commands.argtype.player.desc", ArgTypes.PLAYER_REF)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractTargetPlayerCommand(@Nonnull String name, @Nonnull String description)` |
| `public` | | `AbstractTargetPlayerCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)` |
| `public` | | `AbstractTargetPlayerCommand(@Nonnull String description)` |
| `@Nonnull @Override protected final` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `protected abstract` | `void` | `execute(@Nonnull CommandContext var1,
        @Nullable Ref<EntityStore> var2,
        @Nonnull Ref<EntityStore> var3,
        @Nonnull PlayerRef var4,
        @Nonnull World var5,
        @Nonnull Store<EntityStore> var6)` |
