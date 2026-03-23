---
title: "SoundPlay2DCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.sound"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.sound.SoundPlay2DCommand"
api_surface: false
extends: "AbstractTargetPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "utility"
  - "sound"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.sound`

```java
public class SoundPlay2DCommand extends AbstractTargetPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<SoundEvent>` | `soundEventArg` |
| `private final` | `DefaultArg<SoundCategory>` | `categoryArg` |
| `private final` | `FlagArg` | `allFlag` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)` |
