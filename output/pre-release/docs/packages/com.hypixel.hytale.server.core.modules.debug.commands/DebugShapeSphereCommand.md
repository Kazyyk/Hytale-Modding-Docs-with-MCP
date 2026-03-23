---
title: "DebugShapeSphereCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.debug.commands"
fqcn: "com.hypixel.hytale.server.core.modules.debug.commands.DebugShapeSphereCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "debug"
  - "command"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.debug.commands`

```java
public class DebugShapeSphereCommand extends AbstractPlayerCommand
```

Debug command that spawns a sphere shape at the executing player's position (for arrow, along the player's look direction). Supports `--fade`, `--no-wireframe`, and `--no-solid` flags. Uses `DebugUtils.addSphere()` with a random color and 30-second display time.

## Relationships

- Extends `AbstractPlayerCommand`
- Part of [DebugShapeSubCommand](DebugShapeSubCommand.md)
- Uses [DebugUtils](../com.hypixel.hytale.server.core.modules.debug/DebugUtils.md)
