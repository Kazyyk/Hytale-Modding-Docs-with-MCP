# EntityCloneCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity | Extends: AbstractWorldCommand

public class EntityCloneCommand extends AbstractWorldCommand

## Methods

- public EntityCloneCommand()
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void cloneEntity(@Nonnull CommandSender sender, @Nonnull Ref<EntityStore> entityReference, @Nonnull Store<EntityStore> store)

Also in this package: Default, EntityCleanCommand, EntityCommand, EntityCountCommand, EntityDumpCommand, EntityEffectCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityLodCommand, EntityMakeInteractableCommand, EntityNameplateCommand, EntityRemoveCommand, EntityResendCommand, EntityTrackerCommand, Remove

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  public static void cloneEntity(CommandSender sender, Ref<EntityStore> entityReference, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_GENERAL_NO_ENTITY_IN_VIEW
private static final Message MESSAGE_COMMANDS_ENTITY_CLONE_CLONED
private final EntityWrappedArg entityArg
private final DefaultArg<Integer> countArg
