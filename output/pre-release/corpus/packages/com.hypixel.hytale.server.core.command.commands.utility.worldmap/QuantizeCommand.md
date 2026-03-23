# WorldMapCommand.QuantizeCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.worldmap | Extends: CommandBase

private static class WorldMapCommand.QuantizeCommand extends CommandBase

A sub-command of `WorldMapCommand` that toggles image quantization for world map rendering. Registered under the name `"quantize"` with aliases `"quant"` and `"q"`.

## Command Details

- Name | quantize
- Aliases | quant`, `q
- Description key | server.commands.worldmap.quantize.desc

When executed, toggles `ImageBuilder.toggleQuantization()` and sends a localized enabled/disabled message.

## Related Types

- `WorldMapCommand` -- parent command collection
- `CommandBase` -- abstract base for simple commands
