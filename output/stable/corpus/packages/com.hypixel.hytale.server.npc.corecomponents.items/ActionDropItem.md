# ActionDropItem

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items | Extends: ActionWithDelay

public class ActionDropItem extends ActionWithDelay

## Fields

- protected final String item
- protected final String dropList
- protected final float dropSectorStart
- protected final float dropSectorEnd
- protected final double minDistance
- protected final double maxDistance
- protected final boolean highPitch
- protected final float[] pitch
- protected float throwSpeed

## Methods

- public ActionDropItem(@Nonnull BuilderActionDropItem builder, @Nonnull BuilderSupport support)
- public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- protected double pickDistance()
- protected void newDirection(@Nonnull Ref<EntityStore> ref, double distance, double height, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Also in this package: ActionInventory, ActionPickUpItem, Operation, SensorDroppedItem, StorageTarget

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected double pickDistance()
  protected void newDirection(Ref<EntityStore> ref, double distance, double height, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final String item
protected final String dropList
protected final float dropSectorStart
protected final float dropSectorEnd
protected final double minDistance
protected final double maxDistance
protected final boolean highPitch
protected final float[] pitch
protected final Vector3d dropDirection
protected float throwSpeed
