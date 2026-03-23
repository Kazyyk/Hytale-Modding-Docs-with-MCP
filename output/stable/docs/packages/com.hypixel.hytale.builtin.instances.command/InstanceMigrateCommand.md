---
title: "InstanceMigrateCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstanceMigrateCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "instances"
  - "command"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances.command`

```java
public class InstanceMigrateCommand extends AbstractAsyncCommand
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("migrate", "server.commands.instances.migrate.desc")` |
| `@Override protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `@Nonnull private static` | `CompletableFuture<Void>` | `migrateInstance(@Nonnull CommandContext context, @Nonnull String asset, @Nonnull WorldConfig config, @Nonnull AtomicLong chunkCount, @Nonnull AtomicLong chunksMigrated)` |
