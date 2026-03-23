---
title: "HelpCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.help"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.help.HelpCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "command"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.help`

```java
public class HelpCommand extends AbstractAsyncCommand
```

Abstract base for related commands.

## Constructors

| Constructor | Description |
|---|---|
| `HelpCommand()` | Creates a new HelpCommand instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `executeAsync(@Nonnull CommandContext context)` | `CompletableFuture<Void>` | protected method. |
| `openHelpUI(@Nonnull CommandContext context, @Nullable String initialCommand)` | `CompletableFuture<Void>` | static package-private method. |
| `resolveCommandName(@Nullable String commandNameOrAlias)` | `String` | static private method. |
