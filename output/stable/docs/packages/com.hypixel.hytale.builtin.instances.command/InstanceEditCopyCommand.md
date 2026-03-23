---
title: "InstanceEditCopyCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstanceEditCopyCommand"
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
public class InstanceEditCopyCommand extends AbstractAsyncCommand
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("copy", "server.commands.instances.edit.copy.desc")` |
| `@Override protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
