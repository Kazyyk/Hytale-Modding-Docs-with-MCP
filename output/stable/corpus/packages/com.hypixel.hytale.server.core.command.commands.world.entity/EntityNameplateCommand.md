# EntityNameplateCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity | Extends: AbstractWorldCommand

public class EntityNameplateCommand extends AbstractWorldCommand

## Methods

- public EntityNameplateCommand()
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)

Also in this package: Default, EntityCleanCommand, EntityCloneCommand, EntityCommand, EntityCountCommand, EntityDumpCommand, EntityEffectCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityLodCommand, EntityMakeInteractableCommand, EntityRemoveCommand, EntityResendCommand, EntityTrackerCommand, Remove

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_GENERAL_NO_ENTITY_IN_VIEW
private static final Message MESSAGE_COMMANDS_ENTITY_NAMEPLATE_UPDATED
private final EntityWrappedArg entityArg
private final RequiredArg<String> textArg
