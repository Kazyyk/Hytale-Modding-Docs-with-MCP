# SpawnPopulateCommand

Type: class | Package: com.hypixel.hytale.server.spawning.commands

public class SpawnPopulateCommand

Subcommand that removes all tracked NPCs (optionally filtered by environment) and re-enables NPC spawning to repopulate the world.

Also in this package: Add, Add, Add, DisableCommand, DisableCommand, Dump, DumpAll, EnableCommand, EnableCommand, ManualTrigger, SpawnBeaconsCommand, SpawnCommand, SpawnMarkersCommand, SpawnStatsCommand, SpawnSuppressionCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final OptionalArg<Environment> environmentArg
