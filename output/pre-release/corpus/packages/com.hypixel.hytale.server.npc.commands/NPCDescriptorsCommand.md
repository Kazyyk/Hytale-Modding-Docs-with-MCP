# NPCDescriptorsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractAsyncPlayerCommand

public class NPCDescriptorsCommand extends AbstractAsyncPlayerCommand

Player command that generates and saves NPC descriptor data to `npc_descriptors.json` in the server's working directory. Executes asynchronously on the world thread. Registered as the `"descriptors"` sub-command under the NPC command group.

## Constructor


public NPCDescriptorsCommand()

Registers as `"descriptors"` with description key `"server.commands.npc.descriptors.desc"`.

## Methods

- executeAsync(CommandContext, Store<EntityStore>, Ref<EntityStore>, PlayerRef, World) | CompletableFuture<Void> | Calls `NPCPlugin.get().generateDescriptors()` and `saveDescriptors()`, then reports the output path.

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
