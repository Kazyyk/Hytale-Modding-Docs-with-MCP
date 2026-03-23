---
title: "CommandBase"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.CommandBase"
api_surface: false
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
public abstract class CommandBase extends AbstractCommand
```

Abstract base class extending `AbstractCommand` that provides shared logic for CommandBase subclasses.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `CommandBase(@Nonnull String name, @Nonnull String description)` |
| `public` | | `CommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)` |
| `public` | | `CommandBase(@Nonnull String description)` |
| `@Nullable @Override protected final` | `CompletableFuture<Void>` | `execute(@Nonnull CommandContext context)` |
| `protected abstract` | `void` | `executeSync(@Nonnull CommandContext var1)` |
