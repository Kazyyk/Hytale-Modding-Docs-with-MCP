# SensorDroppedItem

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items | Extends: SensorBase

public class SensorDroppedItem extends SensorBase

## Fields

- protected final List<String> items
- protected final EnumSet<Attitude> attitudes
- protected final double range
- protected final float viewCone
- protected final boolean hasLineOfSight
- protected float heading

## Methods

- public SensorDroppedItem(@Nonnull BuilderSensorDroppedItem builder, @Nonnull BuilderSupport support)
- public void registerWithSupport(@Nonnull Role role)
- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public InfoProvider getSensorInfo()
- protected boolean filterItem( @Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> itemRef, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor )

Also in this package: ActionDropItem, ActionInventory, ActionPickUpItem, Operation, StorageTarget

Complete API:
  public void registerWithSupport(Role role)
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected boolean filterItem(Ref<EntityStore> ref, Ref<EntityStore> itemRef, Role role, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final List<String> items
protected final EnumSet<Attitude> attitudes
protected final double range
protected final float viewCone
protected final boolean hasLineOfSight
protected float heading
protected final EntityPositionProvider positionProvider
