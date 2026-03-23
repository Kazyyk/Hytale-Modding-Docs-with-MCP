# NPCSensorStatsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public class NPCSensorStatsCommand extends AbstractPlayerCommand

Implements `/npc sensorstats`. Computes and logs sensor detection range statistics for every spawnable NPC role. For each role, temporarily builds the role object and extracts `RoleStats` to determine sorted/unsorted/avoidance detection ranges and priority buckets for both player and entity detection.

Results are formatted as a table logged to the NPC plugin logger, with rows labeled `PLY` (player detection) and `ENT` (entity detection), showing:
- `S=` -- sorted detection ranges
- `U=` -- unsorted detection ranges
- `A=` -- avoidance ranges
- `B=` -- priority bucket assignments

A temporary NPC is spawned and immediately removed to provide the build context.

## Constructor


public NPCSensorStatsCommand()

Registers as sub-command `"sensorstats"` with translation key `"server.commands.npc.sensorstats.desc"`.

## Related Types

- NPCBenchmarkCommand -- runtime performance benchmarking
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static boolean isRangesEmpty(RoleStats roleStats, boolean isPlayer)
  private static void formatBuckets(StringBuilder builder, RoleStats roleStats, String label, boolean isPlayer, int width)
  private static void formatRanges(StringBuilder builder, RoleStats roleStats, String label, boolean isPlayer, RoleStats.RangeType rangeType, int width)
