# NPCCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCCommand extends AbstractCommandCollection

Root command collection for the `/npc` command tree. Registered by `NPCPlugin.setup()`. All NPC sub-commands are added in the constructor: `all`, `appearance`, `attack`, `benchmark`, `blackboard`, `clean`, `debug`, `dump`, `flock`, `freeze`, `give`, `path`, `role`, `runtests`, `sensorstats`, `spawn`, `step`, `test`, `thaw`, and `message`.

## Fields


public static final SingleArgumentType<BuilderInfo> NPC_ROLE

Custom argument type for parsing NPC role names. Resolves the input string to a `BuilderInfo` via `NPCPlugin.getIndex()` and `NPCPlugin.getRoleBuilderInfo()`. Provides tab-completion by listing all available role template names from `NPCPlugin.getRoleTemplateNames()`. On failure, suggests similar names using `StringUtil.sortByFuzzyDistance()`.

## Constructor


public NPCCommand()

Creates the root `/npc` command with the translation key `"server.commands.npc"` and registers all sub-commands.

## Sub-commands

- all | NPCAllCommand
- appearance | NPCAppearanceCommand
- attack | NPCAttackCommand
- benchmark | NPCBenchmarkCommand
- blackboard | NPCBlackboardCommand
- clean | NPCCleanCommand
- debug | NPCDebugCommand
- dump | NPCDumpCommand
- flock | NPCFlockCommand
- freeze | NPCFreezeCommand
- give | NPCGiveCommand
- path | NPCPathCommand
- role | NPCRoleCommand
- runtests | NPCRunTestsCommand
- sensorstats | NPCSensorStatsCommand
- spawn | NPCSpawnCommand
- step | NPCStepCommand
- test | NPCTestCommand
- thaw | NPCThawCommand
- message | NPCMessageCommand

## Related Types

- NPCCommandUtils -- shared NPC target resolution utility
- NPCWorldCommandBase -- base class for world-scoped NPC commands
- NPCMultiSelectCommandBase -- base class for multi-entity NPC commands
