---
title: "InstanceExitCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstanceExitCommand"
api_surface: false
extends: "AbstractPlayerCommand"
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
public class InstanceExitCommand extends AbstractPlayerCommand
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("exit", "server.commands.instances.exit.desc")` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
| `` | `` | `InstanceExitOtherCommand()` |
| `` | `` | `super("server.commands.instances.exit.other.desc")` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
