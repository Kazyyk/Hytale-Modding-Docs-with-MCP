---
title: "InstanceEditNewCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstanceEditNewCommand"
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
public class InstanceEditNewCommand extends AbstractAsyncCommand
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("new", "server.commands.instances.edit.new.desc")` |
| `@Override public` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `` | `throw new` | `IllegalArgumentException("Unknown asset pack: " + packId)` |
