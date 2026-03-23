---
title: "WorldMapCommand.QuantizeCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.worldmap"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.worldmap.WorldMapCommand.QuantizeCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "command"
  - "worldmap"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.worldmap`

```java
private static class WorldMapCommand.QuantizeCommand extends CommandBase
```

A sub-command of `WorldMapCommand` that toggles image quantization for world map rendering. Registered under the name `"quantize"` with aliases `"quant"` and `"q"`.

## Command Details

| Property | Value |
|---|---|
| Name | `quantize` |
| Aliases | `quant`, `q` |
| Description key | `server.commands.worldmap.quantize.desc` |

When executed, toggles `ImageBuilder.toggleQuantization()` and sends a localized enabled/disabled message.

## Related Types

- `WorldMapCommand` -- parent command collection
- `CommandBase` -- abstract base for simple commands
