---
title: "CommandInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple.CommandInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "interaction"
  - "command"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple`

```java
public class CommandInteraction extends SimpleInstantInteraction
```

Interaction that executes a server command as the owning player. When triggered, retrieves the `Player` component from the owning entity and passes the configured command string to `CommandManager.handleCommand()`.

## Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<CommandInteraction>` | Codec with inherited `Command` string field. |
| `command` | `String` | The command to execute. |

## Methods

| Method | Signature |
|---|---|
| `firstRun` | `protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `toString` | `@Nonnull String toString()` |