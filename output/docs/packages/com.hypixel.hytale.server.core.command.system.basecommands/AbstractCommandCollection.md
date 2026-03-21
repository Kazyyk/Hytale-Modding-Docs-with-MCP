---
title: "AbstractCommandCollection"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
fqcn: "com.hypixel.hytale.server.core.command.system.basecommands.AbstractCommandCollection"
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
public abstract class AbstractCommandCollection extends AbstractAsyncCommand
```

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for CommandCollection subclasses.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AbstractCommandCollection(@Nonnull String name, @Nonnull String description)` |
| `@Nonnull public` | `Message` | `getFullUsage(@Nonnull CommandSender sender)` |
| `@Nonnull @Override protected final` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `@Nonnull @Override public` | `Message` | `getUsageString(@Nonnull CommandSender sender)` |
