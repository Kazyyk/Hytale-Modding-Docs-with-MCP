# TimeCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.time.commands | Extends: AbstractWorldCommand

public class TimeCommand extends AbstractWorldCommand

The `/time` command implementation. Displays current game time, day/week/year info, and moon phase. Sub-commands: set time by hour, set named period (Dawn/Midday/Dusk/Midnight), pause, and dilation (0.01--4.0x). Requires Creative permission group. Contains inner enum `TimeOfDay` and inner classes for each sub-command variant.
