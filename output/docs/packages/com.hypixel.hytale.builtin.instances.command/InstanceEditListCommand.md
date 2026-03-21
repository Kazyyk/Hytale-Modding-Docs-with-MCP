---
title: "InstanceEditListCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstanceEditListCommand"
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
public class InstanceEditListCommand extends AbstractAsyncCommand
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("list", "server.commands.instances.edit.list.desc")` |
| `@Override public` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
