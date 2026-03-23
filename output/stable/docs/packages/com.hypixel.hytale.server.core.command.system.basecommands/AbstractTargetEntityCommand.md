---
title: "AbstractTargetEntityCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.AbstractTargetEntityCommand"
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
public abstract class AbstractTargetEntityCommand extends AbstractAsyncCommand
```

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for TargetEntityCommand subclasses.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD` | `Message.translation("server.commands.errors.playerNotInWorld")` |
| `private static final` | `Message` | `MESSAGE_GENERAL_NO_ENTITY_IN_VIEW` | `Message.translation("server.general.noEntityInView")` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `OptionalArg<World>` | `worldArg` | `this.withOptionalArg("world", "server.commands.worldthread.arg.desc", ArgTypes.WORLD)` |
| `@Nonnull private final` | `OptionalArg<PlayerRef>` | `playerArg` | `this.withOptionalArg("player", "server.commands.argtype.player.desc", ArgTypes.PLAYER_REF)` |
| `@Nonnull private final` | `EntityWrappedArg` | `entityArg` | `this.withOptionalArg("entity", "server.commands.entity.entity.desc", ArgTypes.ENTITY_ID)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractTargetEntityCommand(@Nonnull String name, @Nonnull String description)` |
| `public` | | `AbstractTargetEntityCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)` |
| `public` | | `AbstractTargetEntityCommand(@Nonnull String description)` |
| `@Nonnull @Override protected final` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `protected abstract` | `void` | `execute(@Nonnull CommandContext var1, @Nonnull ObjectList<Ref<EntityStore>> var2, @Nonnull World var3, @Nonnull Store<EntityStore> var4)` |
