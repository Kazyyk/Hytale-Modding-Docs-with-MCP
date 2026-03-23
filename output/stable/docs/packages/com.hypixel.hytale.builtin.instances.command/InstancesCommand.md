---
title: "InstancesCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstancesCommand"
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
public class InstancesCommand extends AbstractPlayerCommand
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("instances", "server.commands.instances.desc")` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
| `` | `public` | `InstancesEditCommand()` |
| `` | `` | `super("edit", "server.commands.instances.edit.desc")` |
