# EntityStatsDumpCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity.stats | Extends: AbstractTargetEntityCommand

public class EntityStatsDumpCommand extends AbstractTargetEntityCommand

Console command handling EntityStatsDump operations.

## Methods

- public EntityStatsDumpCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull ObjectList<Ref<EntityStore>> entities, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void dumpEntityStatsData(@Nonnull CommandContext context, @Nonnull List<Ref<EntityStore>> entities, @Nonnull Store<EntityStore> store)

Also in this package: EntityStatsAddCommand, EntityStatsGetCommand, EntityStatsResetCommand, EntityStatsSetCommand, EntityStatsSetToMaxCommand, EntityStatsSubCommand

Complete API:
  protected void execute(CommandContext context, ObjectList<Ref<EntityStore>> entities, World world, Store<EntityStore> store)
  public static void dumpEntityStatsData(CommandContext context, List<Ref<EntityStore>> entities, Store<EntityStore> store)
