---
title: "InstanceSpawnCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.command"
fqcn: "com.hypixel.hytale.builtin.instances.command.InstanceSpawnCommand"
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
public class InstanceSpawnCommand extends AbstractPlayerCommand
```

Extends `AbstractPlayerCommand`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("spawn", "server.commands.instances.spawn.desc")` |
| `` | `protected Vector3f` | `getSpawnRotation(@Nonnull Ref<EntityStore> ref,
        @Nonnull CommandContext context,
        @Nonnull DefaultArg<Vector3f> rotationArg,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
