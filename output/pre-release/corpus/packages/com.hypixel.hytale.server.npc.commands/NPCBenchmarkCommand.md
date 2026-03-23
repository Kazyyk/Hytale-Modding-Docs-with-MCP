# NPCBenchmarkCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: CommandBase

public class NPCBenchmarkCommand extends CommandBase

Implements `/npc benchmark`. Starts a timed performance benchmark for NPC role ticking or sensor support (position cache) operations. Results are logged to the NPC plugin logger after the benchmark duration completes.

## Arguments

- --roles | flag | no | -- | Benchmark role tick performance
- --sensorsupport | flag | no | -- | Benchmark position cache / line-of-sight performance
- seconds | Double | no | 30.0 | Duration of the benchmark in seconds (must be > 0)

Exactly one of `--roles` or `--sensorsupport` must be provided.

## Behavior

**Role benchmark:** Calls `NPCPlugin.startRoleBenchmark()`. On completion, formats a `TimeDistributionRecorder` table sorted by average tick time per role, plus an aggregate "ALL" row.

**Sensor support benchmark:** Calls `NPCPlugin.startSensorSupportBenchmark()`. On completion, formats update times (player and entity) and line-of-sight statistics per role, via `SensorSupportBenchmark`.

If neither flag is set, the command fails with a start-failed message.

## Constructor


public NPCBenchmarkCommand()

Registers as sub-command `"benchmark"` with translation key `"server.commands.npc.benchmark.desc"`.

## Related Types

- NPCCommand -- parent command collection
- NPCSensorStatsCommand -- displays sensor detection range statistics

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void executeSync(CommandContext context)
  private static void logRoleDistribution(TimeDistributionRecorder rec, StringBuilder sb, Formatter formatter, String name)
  private static void logSensorSupportUpdateTime(SensorSupportBenchmark bm, StringBuilder sb, Formatter formatter, String name)
  private static void logSensorSupportLoS(SensorSupportBenchmark bm, StringBuilder sb, Formatter formatter, String name)

Fields:
private static final Message MESSAGE_COMMANDS_NPC_BENCHMARK_START_FAILED
private static final Message MESSAGE_COMMANDS_NPC_BENCHMARK_DONE
private final FlagArg roleArg
private final FlagArg sensorSupportArg
private final OptionalArg<Double> secondsArg
