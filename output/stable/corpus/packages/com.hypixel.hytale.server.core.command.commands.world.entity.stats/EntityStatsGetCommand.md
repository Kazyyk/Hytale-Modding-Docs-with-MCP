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
