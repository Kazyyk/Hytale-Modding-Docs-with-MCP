# SensorAge

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle

public class SensorAge

Sensor tracking the age of an NPC entity.

Also in this package: ActionDelayDespawn, ActionDespawn, ActionDie, ActionRemove, ActionRole, ActionSpawn

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final Instant minAgeInstant
protected final Instant maxAgeInstant
