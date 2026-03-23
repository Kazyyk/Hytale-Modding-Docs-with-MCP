---
title: "DebugShapeSubCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.debug.commands"
fqcn: "com.hypixel.hytale.server.core.modules.debug.commands.DebugShapeSubCommand"
api_surface: false
extends: "AbstractCommandCollection"
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
public class DebugShapeSubCommand extends AbstractCommandCollection
```

Command collection registering all debug shape subcommands: sphere, cube, cylinder, cone, arrow, show-force, and clear. Provides the `buildFlags` helper method used by all shape commands to construct the debug flags bitmask from `--fade`, `--no-wireframe`, and `--no-solid` flag arguments.

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `static` | `int` | `buildFlags(CommandContext context, FlagArg fadeFlag, FlagArg noWireframeFlag, FlagArg noSolidFlag)` |

## Relationships

- Extends `AbstractCommandCollection`
- Registers shape commands below
