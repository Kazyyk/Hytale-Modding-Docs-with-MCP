# StartVoidEventInFragmentSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.voidevent | Extends: DelayedSystem<EntityStore>

public class StartVoidEventInFragmentSystem extends DelayedSystem<EntityStore>

Delayed system (1.0s interval) that manages void event lifecycle in portal fragment worlds. Checks elapsed time against the configured start threshold and spawns or removes `VoidEvent` entities.

## Methods

- public void delayedTick(float dt, int systemIndex, Store<EntityStore> store)

Also in this package: Instantiate, VoidEventRefSystem, VoidEventStagesSystem, VoidInvasionPortalsSpawnSystem, VoidSpawnerSystems

Complete API:
  public void delayedTick(float dt, int systemIndex, Store<EntityStore> store)
