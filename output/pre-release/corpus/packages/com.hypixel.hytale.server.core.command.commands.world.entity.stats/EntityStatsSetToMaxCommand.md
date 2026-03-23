# EntityStatsSetToMaxCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity.stats | Extends: AbstractTargetEntityCommand

public class EntityStatsSetToMaxCommand extends AbstractTargetEntityCommand

Console command handling EntityStatsSetToMax operations.

## Methods

- public EntityStatsSetToMaxCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void setEntityStatMax(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull String entityStatName, @Nonnull Store<EntityStore> store)

Also in this package: EntityStatsAddCommand, EntityStatsDumpCommand, EntityStatsGetCommand, EntityStatsResetCommand, EntityStatsSetCommand, EntityStatsSubCommand

Complete API:
  protected void execute(CommandContext context, List<Ref<EntityStore>> entities, World world, Store<EntityStore> store)
  public static void setEntityStatMax(CommandContext context, List<Ref<EntityStore>> entities, String entityStatName, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
