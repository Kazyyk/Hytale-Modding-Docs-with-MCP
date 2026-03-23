# ActionRemove

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle | Extends: ActionBase

public class ActionRemove extends ActionBase

NPC action that removes the entity or its target.

Also in this package: ActionDelayDespawn, ActionDespawn, ActionDie, ActionRole, ActionSpawn, SensorAge

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final boolean useTarget
