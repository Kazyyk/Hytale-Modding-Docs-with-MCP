# SpawnStatsCommand

Type: class | Package: com.hypixel.hytale.server.spawning.commands

public class SpawnStatsCommand

Subcommand that logs detailed spawning statistics: per-environment NPC expected vs actual counts, spawn rejection breakdowns, spawn marker counts per type, and role distributions. Supports `--environments`, `--markers`, and `--verbose` flags.

Also in this package: Add, Add, Add, DisableCommand, DisableCommand, Dump, DumpAll, EnableCommand, EnableCommand, ManualTrigger, SpawnBeaconsCommand, SpawnCommand, SpawnMarkersCommand, SpawnPopulateCommand, SpawnSuppressionCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final FlagArg environmentsArg
private final FlagArg markersArg
private final FlagArg verboseArg
