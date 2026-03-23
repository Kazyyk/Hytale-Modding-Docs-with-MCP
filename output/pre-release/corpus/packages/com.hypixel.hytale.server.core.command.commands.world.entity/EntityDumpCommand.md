# EntityDumpCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity | Extends: AbstractWorldCommand

public class EntityDumpCommand extends AbstractWorldCommand

## Methods

- public EntityDumpCommand()
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)

Also in this package: Default, EntityCleanCommand, EntityCloneCommand, EntityCommand, EntityCountCommand, EntityEffectCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityLodCommand, EntityMakeInteractableCommand, EntityNameplateCommand, EntityRemoveCommand, EntityResendCommand, EntityTrackerCommand, Remove

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_GENERAL_NO_ENTITY_IN_VIEW
private static final Message MESSAGE_COMMANDS_ENTITY_DUMP_DUMP_DONE
private final EntityWrappedArg entityArg
