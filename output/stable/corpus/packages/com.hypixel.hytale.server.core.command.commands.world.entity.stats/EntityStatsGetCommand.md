# EntityStatsGetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity.stats | Extends: AbstractTargetEntityCommand

public class EntityStatsGetCommand extends AbstractTargetEntityCommand

Console command handling EntityStatsGet operations.

## Fields

- @Nonnull private final RequiredArg<String> entityStatNameArg

## Methods

- public EntityStatsGetCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void getEntityStat(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull String entityStat, @Nonnull Store<EntityStore> store)

Also in this package: EntityStatsAddCommand, EntityStatsDumpCommand, EntityStatsResetCommand, EntityStatsSetCommand, EntityStatsSetToMaxCommand, EntityStatsSubCommand

Complete API:
  protected void execute(CommandContext context, ObjectList<Ref<EntityStore>> entities, World world, Store<EntityStore> store)
  public static void getEntityStat(CommandContext context, List<Ref<EntityStore>> entities, String entityStat, Store<EntityStore> store)

Fields:
private final RequiredArg<String> entityStatNameArg
