# EntityEffectCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity | Extends: AbstractTargetEntityCommand

public class EntityEffectCommand extends AbstractTargetEntityCommand

## Methods

- public EntityEffectCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store )

Also in this package: Default, EntityCleanCommand, EntityCloneCommand, EntityCommand, EntityCountCommand, EntityDumpCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityLodCommand, EntityMakeInteractableCommand, EntityNameplateCommand, EntityRemoveCommand, EntityResendCommand, EntityTrackerCommand, Remove

Complete API:
  protected void execute(CommandContext context, List<Ref<EntityStore>> entities, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<EntityEffect> effectArg
private final DefaultArg<Float> durationArg
