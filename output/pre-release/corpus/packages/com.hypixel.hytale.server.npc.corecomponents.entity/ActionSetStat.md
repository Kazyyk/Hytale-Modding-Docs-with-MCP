# ActionSetStat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: ActionBase

public class ActionSetStat extends ActionBase

## Fields

- protected static final ComponentType<EntityStore, EntityStatMap> STAT_MAP_COMPONENT_TYPE
- protected final int stat
- protected final float value
- protected final boolean add
- EntityStatMap entityStatMapComponent

## Constructors

- public ActionSetStat(@Nonnull BuilderActionSetStat builder, @Nonnull BuilderSupport support)

## Methods

- public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
