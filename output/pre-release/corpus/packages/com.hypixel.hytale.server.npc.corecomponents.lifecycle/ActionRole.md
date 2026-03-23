# ActionRole

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle | Extends: ActionBase

public class ActionRole extends ActionBase

NPC action that requests a role change.

Also in this package: ActionDelayDespawn, ActionDespawn, ActionDie, ActionRemove, ActionSpawn, SensorAge

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int roleIndex
protected final String kind
protected final boolean changeAppearance
protected final String state
protected final String subState
