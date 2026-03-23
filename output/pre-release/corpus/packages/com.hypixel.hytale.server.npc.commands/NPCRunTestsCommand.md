# NPCRunTestsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public class NPCRunTestsCommand extends AbstractPlayerCommand

Implements `/npc runtests`. Runs a sequential NPC behavior test suite. Spawns one NPC role at a time at the player's position and waits for the tester to mark each as pass, fail, or abort. Tracks test results per role and reports a summary when all roles have been tested or the test is aborted.

Supports specifying roles via a comma-separated list or using a preset set from `NPCPlugin.getPresetCoverageTestNPCs()`. Role names can include a flock size suffix (e.g., `"Zombie#5"` to spawn a flock of 5).

## Arguments

- roles | String | conditional | Comma-separated list of role names (with optional `#flockSize` suffix)
- --preset | flag | no | Use the preset coverage test NPC list
- --pass | flag | no | Mark current NPC as passed, advance to next
- --fail | flag | no | Mark current NPC as failed, advance to next
- --abort | flag | no | Abort the test suite and report results

## Constructor


public NPCRunTestsCommand()

Registers as sub-command `"runtests"` with translation key `"server.commands.npc.runtests.desc"`.

## Inner Classes

- NPCRunTestsCommand.NPCTestData | ECS component storing test session state

## Related Types

- NPCRunTestsCommand.NPCTestData -- test session state component
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static void setNextRole(NPCRunTestsCommand.NPCTestData testData, Ref<EntityStore> reference, Store<EntityStore> store, World world)
  private static void cleanupNPC(Ref<EntityStore> ref, Store<EntityStore> store)
  private static void spawnNPC(Ref<EntityStore> playerReference, NPCRunTestsCommand.NPCTestData testData, int index, Vector3d position, Vector3f rotation, Store<EntityStore> store)
  private static void reportResults(Ref<EntityStore> playerReference, NPCRunTestsCommand.NPCTestData testData, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_NPC_RUN_TESTS_SPECIFY_ROLES
private final OptionalArg<String> rolesArg
private final FlagArg presetArg
private final FlagArg passArg
private final FlagArg failArg
private final FlagArg abortArg
