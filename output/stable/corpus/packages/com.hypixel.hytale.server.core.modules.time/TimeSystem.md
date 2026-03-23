# TimeSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.time | Extends: TickingSystem<EntityStore>

public class TimeSystem extends TickingSystem<EntityStore>

Advances the `TimeResource` clock by the delta time each tick.

## Methods

- public void tick(float dt, int systemIndex, Store<EntityStore> store)

Also in this package: Init, Ticking, TimeModule, TimePacketSystem, TimeResource, WorldTimeResource, WorldTimeSystems

Complete API:
  public void tick(float dt, int systemIndex, Store<EntityStore> store)

Fields:
private final ResourceType<EntityStore,TimeResource> timeResourceType
